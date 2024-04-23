/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommercesystem;

import java.util.Scanner;

public class cart {

   private int customerId;
 private   int nproducts;
  private  product[] products;

    Scanner input = new Scanner(System.in);

    public cart() {
    }

    public cart(int customerId, int nproducts) {
        this.customerId = customerId;
        this.nproducts = nproducts;
        this.products = new product[nproducts];
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        if (customerId >= 0) {
            this.customerId = customerId;
        } else {
            this.customerId = Math.abs(customerId);
        }
    }

    public void setNproducts(int nproducts) {
        if (nproducts >= 0) {
            this.nproducts = nproducts;
        } else {
            this.nproducts = Math.abs(nproducts);
        }
    }

    public int getNproducts() {
        return nproducts;
    }

    public product[] getProducts() {
        return products;
    }

    public void addProduct() {

        ElectronicProduct e1 = new ElectronicProduct(1, "smartphone", 599.9f, "sumsung", 1);

        ClothingProduct co1 = new ClothingProduct(2, "T-shirt", 19.99f, "medium", "cotton");

        BookProduct b1 = new BookProduct(3, "OOP", 39.99f, "O’Reilly", "X Publications");

        for (int i = 0; i < nproducts; i++) {
            System.out.println("which product would you like to add? 1- smartphone 2- T-shirt 3- oop");

            int p = input.nextInt();
            switch (p) {
                case 1:
                    products[i] = e1;

                    break;
                case 2:
                    products[i] = co1;

                    break;
                case 3:
                    products[i] = b1;

                    break;
                default:
                    System.out.println("NOt included!");
                    
                    break;
            }
        }
    }


    public float calculatePrice() {

        float total = 0;
        for (int i = 0; i < nproducts; i++) {

            total += products[i].getPrice();

        }
        return total;
    }

    public void placeOrder() {

        System.out.println("would you like to place the order 1-Yes 2-No");
        int place = (input.nextInt());
        if (place == 1) {
            Customer c1 = new Customer();

            System.out.println("your total is" + calculatePrice());
            Order o1 = new Order(1, c1.getCustomrId(), getProducts(), calculatePrice());
            o1.printOrderInfo();
        } else if (place == 2) {
            System.out.println("your order dosent place");
        } else {
            System.out.println("invalid number");
        }
    }
}
