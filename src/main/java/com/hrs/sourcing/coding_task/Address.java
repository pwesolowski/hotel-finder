package com.hrs.sourcing.coding_task;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Getter
@Builder
public class Address {
    private Integer id;
    private String city;
    private String street;
}
