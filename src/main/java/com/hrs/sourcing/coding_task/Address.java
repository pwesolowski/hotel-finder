package com.hrs.sourcing.coding_task;


import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@Builder
public class Address {
    private String city;
    private String street;
}
