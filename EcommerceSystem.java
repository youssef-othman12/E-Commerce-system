/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ecommercesystem;

import java.util.Scanner;

public class EcommerceSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Customer c1 = new Customer();
        System.out.println("welcom to the E-commerce system!");
        System.out.println("please enter your id");
        c1.setCustomrId(input.nextInt());
        System.out.println("please enter your name");
        c1.setName(input.nextLine());
        input.nextLine();
        System.out.println("please enter your address");
        c1.setName(input.nextLine());

      
        System.out.println("how many products you want to add to your cart?");
        int nproductttt = input.nextInt();
        cart cart = new cart(c1.getCustomrId(), nproductttt);
        cart.addProduct();
        cart.placeOrder();

    }
}
