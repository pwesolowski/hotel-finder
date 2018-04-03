package com.hrs.sourcing.coding_task;

import com.hrs.sourcing.coding_task.samples.ForBasedNewestHotelFinder;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static java.util.Arrays.asList;
import static java.util.Collections.singleton;
import static org.assertj.core.api.Assertions.assertThat;

public class NewestHotelStreetFinderTest {
    private NewestHotelStreetFinder newestHotelAddressFinder = null;

    @Test
    public void should_return_address_for_newest_hotel() {
        //given
        final Address addressToFind = address("Warsaw", "Pulawska");
        final Set<Hotel> exampleHotels = new HashSet<>(asList(
                hotel(year(2005), addressToFind),
                hotel(year(1970), address("Poznan", "Piotrowska"))));

        //when
        final Optional<Address> address = newestHotelAddressFinder.findAddressOfTheMostRecentlyBuildHotel(exampleHotels);

        //then
        assertThat(address).contains(addressToFind);
    }

    @Test
    public void should_find_nothing_when_no_hotels() {
        final Optional<Address> result = newestHotelAddressFinder.findAddressOfTheMostRecentlyBuildHotel(Collections.emptySet());

        assertThat(result).isEmpty();
    }

    @Test
    public void should_return_nothing_when_address_is_missing() {
        final Address missingAddress = null;
        final Set<Hotel> exampleHotels = singleton(hotel(year(1970), missingAddress));

        final Optional<Address> address = newestHotelAddressFinder.findAddressOfTheMostRecentlyBuildHotel(exampleHotels);

        assertThat(address).isEmpty();
    }

    private Address address(String city, String street) {
        return Address.builder()
                .city(city)
                .street(street)
                .build();
    }

    private Hotel hotel(int yearOfConstruction, Address address) {
        return Hotel.builder()
                .buildingDate(LocalDate.of(yearOfConstruction, 1, 30))
                .hotelName("someName")
                .address(address)
                .build();
    }

    private int year(int year) {
        return year;
    }
}