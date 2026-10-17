package com.adityax.homeservices.controller;
import com.adityax.homeservices.dto.ServiceResponse;
import com.adityax.homeservices.service.ServiceService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/services")
public class ServiceController {
    private final ServiceService service;
    public ServiceController(ServiceService service) { this.service=service; }
    @GetMapping public List<ServiceResponse> getAll(@RequestParam(required=false) String search) { return service.getAll(search); }
    @GetMapping("/{id}") public ServiceResponse getById(@PathVariable Long id) { return service.getById(id); }
}
