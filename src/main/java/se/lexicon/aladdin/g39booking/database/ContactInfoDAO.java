package se.lexicon.aladdin.g39booking.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import se.lexicon.aladdin.g39booking.model.entity.ContactInfo;

import java.util.Optional;

public interface ContactInfoDAO extends JpaRepository<ContactInfo, String > {


    Optional<ContactInfo> findByEmail(@Param("email") String email);
}
