package com.adityax.homeservices.service;
import com.adityax.homeservices.dto.BookingRequest;
import com.adityax.homeservices.dto.BookingResponse;
import com.adityax.homeservices.entity.Booking;
import com.adityax.homeservices.entity.HomeService;
import com.adityax.homeservices.exception.ResourceNotFoundException;
import com.adityax.homeservices.repository.BookingRepository;
import com.adityax.homeservices.repository.HomeServiceRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service
public class BookingService {
    private final BookingRepository bookings; private final HomeServiceRepository services;
    public BookingService(BookingRepository bookings, HomeServiceRepository services) { this.bookings=bookings; this.services=services; }
    @Transactional
    public BookingResponse create(BookingRequest request) {
        HomeService service=services.findById(request.serviceId()).orElseThrow(() -> new ResourceNotFoundException("Service not found with id: " + request.serviceId()));
        Booking booking=new Booking(service, request.name().trim(), request.phone(), request.address().trim(), request.date(), request.timeSlot().trim());
        return BookingResponse.from(bookings.save(booking));
    }
    @Transactional(readOnly=true)
    public List<BookingResponse> getAll() { return bookings.findAll().stream().map(BookingResponse::from).toList(); }
}
