package net.wohlfart.gemini.database.repositories;

import net.wohlfart.gemini.database.entities.Principal;
import net.wohlfart.gemini.database.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrincipalRepository extends JpaRepository<Principal, Long> {
}
