package se.lexicon.aladdin.g39booking.model.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.lang.model.element.Name;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static se.lexicon.aladdin.g39booking.model.constants.EntityConstants.GENERATOR;
import static se.lexicon.aladdin.g39booking.model.constants.EntityConstants.UUID_GENERATOR;

@Entity
public class Patient {
    @Id
    @GeneratedValue(generator = GENERATOR)
    @GenericGenerator(name = GENERATOR, strategy = UUID_GENERATOR)
    @Column(name = "id",updatable = false)
    private String id;
    @Column(name = "pnr", unique = true, length = 20)
    private String pnr;
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "fk_contact_info_id")
    private ContactInfo contactInfo;

    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "fk_app_user_id", table = "patient")
    private AppUser userCredentials;

@OneToMany(
        cascade = {CascadeType.REFRESH, CascadeType.DETACH},
        fetch = FetchType.LAZY,mappedBy = "patient"
)
    private List<Booking> vaccineBookingType;
    public Patient() {
    }

    public Patient(String id, String pnr, String firstName, String lastName, LocalDate birthday) {
        this.id = id;
        this.pnr = pnr;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
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

    public AppUser getUserCredentials() {
        return userCredentials;
    }

    public void setUserCredentials(AppUser userCredentials) {
        this.userCredentials = userCredentials;
    }
}
