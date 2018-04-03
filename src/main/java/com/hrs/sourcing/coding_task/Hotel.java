package com.hrs.sourcing.coding_task;


import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.time.LocalDate;

@ToString
@Getter
@Builder
public class Hotel {
    private String hotelName;

    @Nullable
    private Address address;

    @Nonnull
    private LocalDate buildingDate;
}
