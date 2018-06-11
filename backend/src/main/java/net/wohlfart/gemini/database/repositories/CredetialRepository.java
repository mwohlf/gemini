package net.wohlfart.gemini.database.repositories;

import net.wohlfart.gemini.database.entities.Credential;
import net.wohlfart.gemini.database.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CredetialRepository extends JpaRepository<Credential, Long> {
}
