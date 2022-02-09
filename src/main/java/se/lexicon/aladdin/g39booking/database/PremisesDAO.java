package se.lexicon.aladdin.g39booking.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import se.lexicon.aladdin.g39booking.model.entity.Premises;

public interface PremisesDAO extends JpaRepository<Premises, String> {

    long countUsagesByAddressId(@Param("addressId") String addressId);

}
