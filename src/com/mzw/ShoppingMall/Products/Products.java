package com.mzw.ShoppingMall.Products;

/**
 * @author mzw
 * @date 2020/2/22 - 23:22
 */
public class Products {
    int no;
    String name;
    double price;
    public Products(){}
    public Products(int no,String name,double price){
        this.no = no;
        this.name = name;
        this.price = price;
    }
    public void setNo(int no){
        this.no = no;
    }
    public int getNo(){
        return no;
    }public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    //城市商品编号  1000-9999
    public int hashCode(){
        return no/1000;
    }
    //需求：如果商品编号和名字都一样就表示同一商品
    public boolean equals(Object o){
        if(this==o){
            return true;
        }
        if(o instanceof Products){
            Products ob = (Products)o;
            if(ob.no==this.no&&ob.name.equals(this.name)){
                return true;
            }
        }
        return false;
    }
    public String toString(){
        return "Product[编号："+no+", 名称："+name+", 单价："+price+"]";
    }
}
