package com.hrs.sourcing.coding_task;

import org.junit.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

import static java.util.Arrays.asList;
import static java.util.Collections.singleton;
import static org.assertj.core.api.Assertions.assertThat;

public class NewestHotelStreetFinderTest {
    private NewestHotelStreetFinder newestHotelAddressFinder = null;
    private AtomicInteger idGenerator = new AtomicInteger(0);

    @Test
    public void should_return_address_for_newest_hotel() {
        //given
        final Address addressToFind = Address.builder()
                .id(5)
                .city("Warsaw")
                .street("Mazowiecka")
                .build();
        final Set<Hotel> exampleHotels = new HashSet<>(asList(
                hotel(year(2005), addressToFind),
                hotel(
                        year(1970),
                        Address.builder()
                                .id(5)
                                .city("Warsaw")
                                .street("Pulawska")
                                .build())));

        //when
        final Optional<Address> address = newestHotelAddressFinder.findStreetNameOfTheMostRecentBuildHotel(exampleHotels);

        //then
        assertThat(address).contains(addressToFind);
    }

    @Test
    public void should_find_nothing_when_no_hotels() {
        final Optional<Address> result = newestHotelAddressFinder.findStreetNameOfTheMostRecentBuildHotel(new HashSet<>());

        assertThat(result).isEmpty();
    }

    @Test
    public void should_return_nothing_when_address_is_missing() {
        final Address missingAddress = null;
        final Set<Hotel> exampleHotels = singleton(hotel(year(1970), missingAddress));

        final Optional<Address> address = newestHotelAddressFinder.findStreetNameOfTheMostRecentBuildHotel(exampleHotels);

        assertThat(address).isEmpty();
    }

    private Hotel hotel(int yearOfConstruction, Address address) {
        return Hotel.builder()
                .hotelId(idGenerator.incrementAndGet())
                .buildingDate(LocalDate.of(yearOfConstruction, 1, 30))
                .hotelName("someName")
                .address(address)
                .build();
    }

    private int year(int year) {
        return year;
    }
}