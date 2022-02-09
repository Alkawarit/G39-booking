package se.lexicon.aladdin.g39booking.model.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

import java.util.Objects;

import static se.lexicon.aladdin.g39booking.model.constants.EntityConstants.GENERATOR;
import static se.lexicon.aladdin.g39booking.model.constants.EntityConstants.UUID_GENERATOR;

@Entity
public class ContactInfo {
    @Id
    @GeneratedValue(generator = GENERATOR)
    @GenericGenerator(name = GENERATOR, strategy = UUID_GENERATOR)
    @Column(updatable = false)
    private String id;
    @Column(unique = true)
    private String email;
    @Column(unique = true,nullable = true)
    private String phone;

    public ContactInfo() {
    }

    public ContactInfo(String id, String email, String phone) {
        this.id = id;
        this.email = email;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactInfo that = (ContactInfo) o;
        return Objects.equals(id, that.id) && Objects.equals(email, that.email) && Objects.equals(phone, that.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, phone);
    }

    @Override
    public String toString() {
        return "ContactInfo{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
