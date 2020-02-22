package com.mzw.ShoppingMall.Test;

import com.mzw.ShoppingMall.Products.Products;
import com.mzw.ShoppingMall.ShoppingCart.ShoppingCart;

/**
 * @author mzw
 * @date 2020/2/23 - 0:11
 */
public class Test {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        //货物
        Products p1 = new Products(1000,"苹   果",2.5);
        Products p2 = new Products(1015,"iphone",4500);
        Products p3 = new Products(2015,"香   蕉",10.5);
        Products p4 = new Products(6036,"青    菜",1.5);
        Products p5 = new Products(1123,"铅   笔",5.5);
        //开始购物
        cart.add(p1,3);
        cart.add(p2,1);
        cart.add(p3,10);
        cart.add(p4,30);
        cart.add(p5,3);
        cart.add(p1,10);
        cart.add(p3,5);
        //打印商品
        cart.print();
    }
}
