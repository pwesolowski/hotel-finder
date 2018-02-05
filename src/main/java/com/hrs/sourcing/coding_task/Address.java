package com.hrs.sourcing.coding_task;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@Builder
public class Address {
    private Integer id;
    private String city;
    private String street;
}
