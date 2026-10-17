package com.adityax.homeservices.service;
import com.adityax.homeservices.dto.ServiceResponse;
import com.adityax.homeservices.entity.HomeService;
import com.adityax.homeservices.exception.ResourceNotFoundException;
import com.adityax.homeservices.repository.HomeServiceRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ServiceService {
    private final HomeServiceRepository repository;
    public ServiceService(HomeServiceRepository repository) { this.repository=repository; }
    public List<ServiceResponse> getAll(String search) {
        List<HomeService> services = (search == null || search.isBlank()) ? repository.findAll() : repository.findByNameContainingIgnoreCase(search.trim());
        return services.stream().map(ServiceResponse::from).toList();
    }
    public ServiceResponse getById(Long id) {
        return repository.findById(id).map(ServiceResponse::from).orElseThrow(() -> new ResourceNotFoundException("Service not found with id: " + id));
    }
}
