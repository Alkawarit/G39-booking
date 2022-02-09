package se.lexicon.aladdin.g39booking.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import se.lexicon.aladdin.g39booking.model.entity.Address;

import java.util.Optional;

public interface AddressDAO extends JpaRepository<Address, String> {

    @Query("SELECT a FROM Address a WHere upper(a.streetAddress) = upper(:street) AND a.zipCode = :zip AND upper(a.city) = upper(:city) ")
    Optional<Address> findByStreetZipcodeAndCity (@Param("street") String street, @Param("zip") String zip, @Param("city") String city);

}
