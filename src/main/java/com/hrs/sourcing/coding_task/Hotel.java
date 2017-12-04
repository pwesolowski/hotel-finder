package com.hrs.sourcing.coding_task;


import lombok.Builder;
import lombok.Data;
import java.time.LocalDate;

@Data
@Builder
class Hotel {

    private int hotelId;
    private String hotelName;
    private Address address;
    private LocalDate buildingDate;

}
