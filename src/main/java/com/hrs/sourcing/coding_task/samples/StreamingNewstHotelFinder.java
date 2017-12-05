package com.hrs.sourcing.coding_task.samples;

import com.hrs.sourcing.coding_task.Address;
import com.hrs.sourcing.coding_task.Hotel;
import com.hrs.sourcing.coding_task.NewestHotelStreetFinder;

import java.util.Optional;
import java.util.Set;
import java.util.function.BinaryOperator;

import static java.util.Comparator.comparing;

public class StreamingNewstHotelFinder implements NewestHotelStreetFinder {
    @Override
    public Optional<Address> findStreetNameOfTheMostRecentBuildHotel(Set<Hotel> hotels) {
        return hotels.stream()
                .reduce(BinaryOperator.maxBy(comparing(Hotel::getBuildingDate)))
                .map(Hotel::getAddress);
    }
}
