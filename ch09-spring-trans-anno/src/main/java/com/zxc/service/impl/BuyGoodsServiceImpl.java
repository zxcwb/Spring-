package com.zxc.service.impl;

import com.zxc.dao.GoodsDao;
import com.zxc.dao.SaleDao;
import com.zxc.domain.Goods;
import com.zxc.domain.Sale;
import com.zxc.exception.NotEnoughException;
import com.zxc.service.BuyGoodsService;

public class BuyGoodsServiceImpl implements BuyGoodsService {

    private SaleDao saleDao;
    private GoodsDao goodsDao;

    @Override
    public void buy(Integer goodsId, Integer nums) {
        System.out.println("======buy方法的开始======");
        //记录销售的信息，向销售表添加记录
        Sale sale = new Sale();
        sale.setGid(goodsId);
        sale.setNums(nums);
        saleDao.insertSale(sale);

        //更新库存
        Goods goods = goodsDao.selectGoods(goodsId);
        if (goods == null){
            //没有库存了
            throw  new NullPointerException("编号是："+goodsId+"，商品不存在！");
        }else if (goods.getAmount() < nums){
            throw new NotEnoughException("编号是："+goodsId+"，商品库存不足！");
        }

        //修改库存
        Goods buyGoods = new Goods();
        buyGoods.setId(goodsId);
        buyGoods.setAmount(nums);
        goodsDao.updateGoods(buyGoods);
        System.out.println("=====buy方法的完成=====");
    }

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }
}
