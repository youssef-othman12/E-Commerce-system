/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommercesystem;

public class BookProduct extends product{
  private  String author;
 private  String publisher;

    public BookProduct(  int productId, String name, float price,String author, String publisher) {
        super(productId, name, price);
        this.author = author;
        this.publisher = publisher;
    }
     public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
   
}
