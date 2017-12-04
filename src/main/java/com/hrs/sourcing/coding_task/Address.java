package com.hrs.sourcing.coding_task;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
class Address {
    private Integer id;
    private String city;
    private String street;

}
