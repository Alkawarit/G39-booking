package se.lexicon.aladdin.g39booking.model.dto;

import se.lexicon.aladdin.g39booking.model.entity.Booking;
import se.lexicon.aladdin.g39booking.model.entity.ContactInfo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class PatientDTO implements Serializable {

    private String id;
    private String pnr;
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private ContactInfo contactInfo;
    private List<Booking> vaccineBookingType;

    public PatientDTO(String id,
                      String pnr,
                      String firstName,
                      String lastName,
                      LocalDate birthday,
                      ContactInfo contactInfo,
                      List<Booking> vaccineBookingType) {
        this.id = id;
        this.pnr = pnr;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.contactInfo = contactInfo;
        this.vaccineBookingType = vaccineBookingType;
    }

    public PatientDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public List<Booking> getVaccineBookingType() {
        return vaccineBookingType;
    }

    public void setVaccineBookingType(List<Booking> vaccineBookingType) {
        this.vaccineBookingType = vaccineBookingType;
    }
}
