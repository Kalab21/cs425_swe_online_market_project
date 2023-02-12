package edu.miu.cs.cs425.swe_online_market_project.service;

import edu.miu.cs.cs425.swe_online_market_project.model.Product;
import edu.miu.cs.cs425.swe_online_market_project.model.ShoppingCart;

public interface ShoppingCartService {
    ShoppingCart getShoppingCartById(long id);

    void deleteShoppingCartById(long id);

    ShoppingCart getShoppingCartByBuyer(Long id);

    ShoppingCart addProductToShoppingCart(Long cartId, Product product);

    void deleteProductFromCart(Long productId, Long cartId);

    void deleteAllProductsFromCart(Long cartId);
}
