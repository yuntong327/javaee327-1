package cn.itcast.core.service;

import cn.itcast.core.pojo.entity.PageResult;
import cn.itcast.core.pojo.seller.Seller;
import cn.itcast.core.pojo.specification.Specification;

public interface SellerService {
    void add(Seller seller);

    //Seller findOne(String username);

    PageResult search(Integer page, Integer rows, Seller seller);

    Seller findOne(String id);

    void updateStatus(String sellerId, String status);
}
