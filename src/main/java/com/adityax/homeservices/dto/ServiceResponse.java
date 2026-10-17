package com.adityax.homeservices.dto;
import com.adityax.homeservices.entity.HomeService;
public record ServiceResponse(Long id, String name, String description, double startingPrice, double rating) {
    public static ServiceResponse from(HomeService s) { return new ServiceResponse(s.getId(), s.getName(), s.getDescription(), s.getStartingPrice(), s.getRating()); }
}
