package com.example.test3.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Products")
public class Product {
    @Id
    @Column(name = "PRODUCT_ID",length = 100)
    @GeneratedValue(strategy = GenerationType.IDENTITY) //ID yi teker teker arttırma.
    public int id;
    @Column(name = "PRODUCT_NAME")
    public String name;
    @Column(name = "PRODUCT_STOCK")
    public String stock;
    @Column(name = "PRODUCT_DESCRIPTION")
    public String description;
    @Column(name = "PRODUCT_PRICE")
    public double price;


}
