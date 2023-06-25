package com.example.ResturentModel.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Restaurant {
    private Integer restaurantId;
    private  String restaurantName;
    private String address;
    private String number;
    private String specialty;
    private String total_staff;
}
