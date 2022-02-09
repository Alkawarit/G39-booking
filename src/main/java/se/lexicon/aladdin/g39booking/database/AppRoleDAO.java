package se.lexicon.aladdin.g39booking.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import se.lexicon.aladdin.g39booking.model.constants.UserRole;
import se.lexicon.aladdin.g39booking.model.entity.AppRole;

import java.util.Optional;

public interface AppRoleDAO  extends JpaRepository<AppRole, String > {

    @Query("SELECT r FROM AppRole r WHERE r.userRole = :role")
    Optional<AppRole> findByUserRole (@Param("role") UserRole userRole);
}
