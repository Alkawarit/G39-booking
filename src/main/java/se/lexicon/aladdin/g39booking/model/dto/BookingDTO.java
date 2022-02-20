package se.lexicon.aladdin.g39booking.model.dto;

import se.lexicon.aladdin.g39booking.model.entity.Patient;
import se.lexicon.aladdin.g39booking.model.entity.Premises;

import java.io.Serializable;
import java.time.LocalDateTime;

public class BookingDTO implements Serializable {

    private String id;
    private LocalDateTime dateTime;
    private double price;
    private String administratorId;
    private String vaccineType;
    private boolean vacant;
    private Patient patient;
    private Premises premises;

    public BookingDTO(String id,
                      LocalDateTime dateTime,
                      double price,
                      String administratorId,
                      String vaccineType,
                      boolean vacant,
                      Patient patient,
                      Premises premises) {
        this.id = id;
        this.dateTime = dateTime;
        this.price = price;
        this.administratorId = administratorId;
        this.vaccineType = vaccineType;
        this.vacant = vacant;
        this.patient = patient;
        this.premises = premises;
    }

    public BookingDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAdministratorId() {
        return administratorId;
    }

    public void setAdministratorId(String administratorId) {
        this.administratorId = administratorId;
    }

    public String getVaccineType() {
        return vaccineType;
    }

    public void setVaccineType(String vaccineType) {
        this.vaccineType = vaccineType;
    }

    public boolean isVacant() {
        return vacant;
    }

    public void setVacant(boolean vacant) {
        this.vacant = vacant;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Premises getPremises() {
        return premises;
    }

    public void setPremises(Premises premises) {
        this.premises = premises;
    }

}
