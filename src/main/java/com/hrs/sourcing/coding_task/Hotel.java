package com.hrs.sourcing.coding_task;


import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@ToString
@Getter
@Builder
public class Hotel {
    private String hotelName;
    private Address address;
    private LocalDate buildingDate;
}
