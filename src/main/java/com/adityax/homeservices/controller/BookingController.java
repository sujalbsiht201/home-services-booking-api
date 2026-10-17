package com.adityax.homeservices.controller;
import com.adityax.homeservices.dto.BookingRequest;
import com.adityax.homeservices.dto.BookingResponse;
import com.adityax.homeservices.service.BookingService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    private final BookingService service;
    public BookingController(BookingService service) { this.service=service; }
    @PostMapping @ResponseStatus(HttpStatus.CREATED) public BookingResponse create(@Valid @RequestBody BookingRequest request) { return service.create(request); }
    @GetMapping public List<BookingResponse> getAll() { return service.getAll(); }
}
