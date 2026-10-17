package com.adityax.homeservices.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "home_services")
public class HomeService {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    @Column(nullable = false) private String name;
    @Column(nullable = false, length = 1000) private String description;
    @Column(nullable = false) private double startingPrice;
    @Column(nullable = false) private double rating;
    protected HomeService() {}
    public HomeService(String name, String description, double startingPrice, double rating) {
        this.name=name; this.description=description; this.startingPrice=startingPrice; this.rating=rating;
    }
    public Long getId(){return id;} public String getName(){return name;} public String getDescription(){return description;}
    public double getStartingPrice(){return startingPrice;} public double getRating(){return rating;}
}
