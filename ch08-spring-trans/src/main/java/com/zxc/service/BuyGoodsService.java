package com.zxc.service;

public interface BuyGoodsService {
    //购买商品的方法，goodsId购买商品的编号，nums：购买的数量
    void buy(Integer goodsId, Integer nums);
}
