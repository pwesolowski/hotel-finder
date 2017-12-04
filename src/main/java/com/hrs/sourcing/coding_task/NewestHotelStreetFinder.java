package com.hrs.sourcing.coding_task;

import java.util.Set;


public interface NewestHotelStreetFinder {

    /**
     * Return Street of hotel that has highest build date.
     * @param hotels hotels to search
     * @return hotel street, default returns '-'
     */
    String findStreetNameOfTheMostRecentBuildHotel(Set<Hotel> hotels);

}
