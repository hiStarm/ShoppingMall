package com.mzw.ShoppingMall.ShoppingCart;

import com.mzw.ShoppingMall.Products.Products;

import java.util.*;

/**
 * @author mzw
 * @date 2020/2/22 - 23:26
 */
//购物车
public class ShoppingCart {
    //使用Map存储商品条目
    Map <Products,Integer> productsIntegerMap;
    double totalPrice;
    public ShoppingCart(){
        productsIntegerMap  = new HashMap<Products, Integer>();
    }
    //添加商品一个
    public void add(Products p){
        add(p,1);
    }
    //添加商品n个
    public void add(Products p,int n){
        //判断购物车中是否有此商品
        if(!productsIntegerMap.containsKey(p)){
            productsIntegerMap.put(p,n);
        }
        else{
            //车中有此商品
            int before = productsIntegerMap.get(p).intValue();
            int after = before + n;
            productsIntegerMap.put(p,after);  //Key重复，覆盖Value
        }
    }
    //删除一个商品
    public void remove(Products p){
        remove(p,1);
    }
    //删除一类商品
    public void remove(Products p,int n){
        int before = productsIntegerMap.get(p).intValue();
        if(before==n){
            productsIntegerMap.remove(p);
            return;
        }
        int after = before - n;
        productsIntegerMap.put(p,after);
    }
    //清空购物车
    public void clear(){
        productsIntegerMap.clear();
    }
    //打印详单
    /*
        格式：
        购物详单：
            10   苹果    10元
            2    西瓜    35元
                ......
                    总价：40元
     */
    public void print(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("购物清单：\n");
        //遍历Map
        Set<Products> keys = productsIntegerMap.keySet();
        for(Products key:keys){
            Products k = key;
            Integer v = productsIntegerMap.get(k);
            totalPrice += v*k.getPrice();
            stringBuffer.append("\t" + v.intValue() + "\t\t" + k+"\t\t" + (v.intValue()*k.getPrice())+"元"+"\n");
        }
        stringBuffer.append("\t\t\t\t总价："+totalPrice+"元");
        System.out.println(stringBuffer);
    }
}
