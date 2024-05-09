package com.leadtorev.repository;

import java.util.List;

import com.leadtorev.entity.Product;



public interface CustomProductRepository {
    List<Product> findByAttributesKeyAndAttributesValueIgnoreCase(String key, String value);
}
 	