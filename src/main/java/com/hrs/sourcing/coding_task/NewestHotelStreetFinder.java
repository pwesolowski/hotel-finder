package com.hrs.sourcing.coding_task;

import java.util.Optional;
import java.util.Set;


public interface NewestHotelStreetFinder {

    /**
     * Return Street of hotel that has highest build date.
     *
     * @param hotels hotels to search
     * @return hotel street
     */
    Optional<Address> findStreetNameOfTheMostRecentBuildHotel(Set<Hotel> hotels);

}
