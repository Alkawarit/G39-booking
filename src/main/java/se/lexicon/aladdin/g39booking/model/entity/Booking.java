package se.lexicon.aladdin.g39booking.model.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

import static se.lexicon.aladdin.g39booking.model.constants.EntityConstants.GENERATOR;
import static se.lexicon.aladdin.g39booking.model.constants.EntityConstants.UUID_GENERATOR;

@Entity
public class Booking {
    @Id
    @GeneratedValue(generator = GENERATOR)
    @GenericGenerator(name = GENERATOR, strategy = UUID_GENERATOR)
    @Column(updatable = false)
    private String id;
    private LocalDateTime dateTime;
    private double price;
    private String administratorId;
    private String vaccineType;
    private boolean vacant;
    @ManyToOne(
            cascade = {CascadeType.DETACH,CascadeType.REFRESH},
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "fk_patient_id", table = "booking")
    private Patient patient;
    @ManyToOne(
            cascade = {CascadeType.DETACH, CascadeType.REFRESH},
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "fk_premises_id")
    private Premises premises;

    public Booking() {
    }

    public Booking(String id, LocalDateTime dateTime, double price, String administratorId, String vaccineType, boolean vacant) {
        this.id = id;
        this.dateTime = dateTime;
        this.price = price;
        this.administratorId = administratorId;
        this.vaccineType = vaccineType;
        this.vacant = vacant;
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

    public String getAdministrator() {
        return administratorId;
    }

    public void setAdministrator(String administrator) {
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
        setVacant(this.patient==null);
    }

    public Premises getPremises() {
        return premises;
    }

    public void setPremises(Premises premises) {
        this.premises = premises;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return Double.compare(booking.price, price) == 0 && vacant == booking.vacant && Objects.equals(id, booking.id) && Objects.equals(dateTime, booking.dateTime) && Objects.equals(administratorId, booking.administratorId) && Objects.equals(vaccineType, booking.vaccineType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateTime, price, administratorId, vaccineType, vacant);
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id='" + id + '\'' +
                ", dateTime=" + dateTime +
                ", price=" + price +
                ", administrator='" + administratorId + '\'' +
                ", vaccineType='" + vaccineType + '\'' +
                ", vacant=" + vacant +
                '}';
    }
}
