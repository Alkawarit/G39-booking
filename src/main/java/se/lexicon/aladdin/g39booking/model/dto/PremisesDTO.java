package se.lexicon.aladdin.g39booking.model.dto;

import se.lexicon.aladdin.g39booking.model.entity.Address;
import se.lexicon.aladdin.g39booking.model.entity.Booking;

import java.io.Serializable;
import java.util.List;

public class PremisesDTO implements Serializable {

    private String id;
    private String name;
    private Address address;
    private List<Booking> bookings;

    public PremisesDTO() {
    }

    public PremisesDTO(String id, String name, Address address, List<Booking> bookings) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.bookings = bookings;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
