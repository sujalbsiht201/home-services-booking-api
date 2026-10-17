package com.adityax.homeservices.dto;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
public record BookingRequest(
    @NotNull(message="Service ID is required") @Positive(message="Service ID must be positive") Long serviceId,
    @NotBlank(message="Name cannot be empty") String name,
    @NotBlank(message="Phone is required") @Pattern(regexp="^[0-9]{10}$", message="Phone must be exactly 10 digits") String phone,
    @NotBlank(message="Address cannot be empty") String address,
    @NotNull(message="Date is required") @FutureOrPresent(message="Date cannot be in the past") LocalDate date,
    @NotBlank(message="Time slot cannot be empty") String timeSlot
) {}
