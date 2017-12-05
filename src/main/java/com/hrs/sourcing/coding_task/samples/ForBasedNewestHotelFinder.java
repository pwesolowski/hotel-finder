package com.hrs.sourcing.coding_task.samples;

import com.hrs.sourcing.coding_task.Address;
import com.hrs.sourcing.coding_task.Hotel;
import com.hrs.sourcing.coding_task.NewestHotelStreetFinder;

import java.util.Optional;
import java.util.Set;

public class ForBasedNewestHotelFinder implements NewestHotelStreetFinder {
    @Override
    public Optional<Address> findStreetNameOfTheMostRecentBuildHotel(Set<Hotel> hotels) {
        Hotel latest = null;

        for (Hotel h : hotels) {
            if (latest == null) {
                latest = h;
            }

            if (h.getBuildingDate().isAfter(latest.getBuildingDate())) {
                latest = h;
            }
        }

        return Optional.ofNullable(latest).map(Hotel::getAddress);
    }
}
