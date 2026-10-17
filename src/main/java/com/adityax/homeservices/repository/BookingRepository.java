package com.adityax.homeservices.repository;
import com.adityax.homeservices.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BookingRepository extends JpaRepository<Booking, Long> {}
