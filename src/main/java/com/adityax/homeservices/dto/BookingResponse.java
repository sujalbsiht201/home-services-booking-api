package com.adityax.homeservices.dto;
import com.adityax.homeservices.entity.Booking;
import java.time.LocalDate;
public record BookingResponse(Long id, Long serviceId, String serviceName, String name, String phone, String address, LocalDate date, String timeSlot, String status) {
    public static BookingResponse from(Booking b) { return new BookingResponse(b.getId(), b.getService().getId(), b.getService().getName(), b.getName(), b.getPhone(), b.getAddress(), b.getDate(), b.getTimeSlot(), b.getStatus()); }
}
