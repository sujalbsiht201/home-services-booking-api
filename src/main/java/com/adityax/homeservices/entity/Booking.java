package com.adityax.homeservices.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "bookings")
public class Booking {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    @ManyToOne(optional = false, fetch = FetchType.LAZY) @JoinColumn(name="service_id", nullable=false) private HomeService service;
    @Column(nullable=false) private String name;
    @Column(nullable=false, length=10) private String phone;
    @Column(nullable=false, length=1000) private String address;
    @Column(nullable=false) private LocalDate date;
    @Column(name="time_slot", nullable=false) private String timeSlot;
    @Column(nullable=false) private String status = "PENDING";
    protected Booking() {}
    public Booking(HomeService service, String name, String phone, String address, LocalDate date, String timeSlot) {
        this.service=service; this.name=name; this.phone=phone; this.address=address; this.date=date; this.timeSlot=timeSlot; this.status="PENDING";
    }
    public Long getId(){return id;} public HomeService getService(){return service;} public String getName(){return name;}
    public String getPhone(){return phone;} public String getAddress(){return address;} public LocalDate getDate(){return date;}
    public String getTimeSlot(){return timeSlot;} public String getStatus(){return status;}
}
