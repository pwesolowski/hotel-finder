package com.hrs.sourcing.coding_task;


import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder
public class Hotel {
    private int hotelId;
    private String hotelName;
    private Address address;
    private LocalDate buildingDate;
}
