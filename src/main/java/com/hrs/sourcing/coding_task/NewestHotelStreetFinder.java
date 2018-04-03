package com.hrs.sourcing.coding_task;

import java.util.Optional;
import java.util.Set;


public interface NewestHotelStreetFinder {
    Optional<Address> findAddressOfTheMostRecentlyBuildHotel(Set<Hotel> hotels);
}
