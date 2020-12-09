package com.zxc.dao;

import com.zxc.domain.Goods;

public interface GoodsDao {
    //本次用户购买商品信息
    int updateGoods(Goods goods);
    //查询商品信息
    Goods selectGoods(Integer id);
}
