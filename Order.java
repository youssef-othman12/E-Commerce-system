/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommercesystem;


public class Order {
    
private int orderId;
private int customerId;
private product[]products;
private float totalprice;

    public Order(int orderId, int customerId, product[] products, float totalprice) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.products = products;
        this.totalprice = totalprice;
    }

public void printOrderInfo(){
  
    System.out.println("here is your order's summary");
    System.out.println("order id:"+orderId);
    System.out.println("customer id:"+customerId);
    System.out.println("products:");
    for(int i=0;i<products.length;i++){
    product product=this.products[i];
        System.out.println(products[i].getName()+" - $"+products[i].getPrice());
    }
    System.out.println("Total price: $"+totalprice);
   
    
    

}
}
