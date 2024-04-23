/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommercesystem;

public class Customer {
   private int customrId;
   private String name;
   private String address;

    public int getCustomrId() {
        return customrId;
    }

    public void setCustomrId(int customrId) {
        if(customrId>=0)
        this.customrId = customrId;
        else 
             this.customrId =Math.abs(customrId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
