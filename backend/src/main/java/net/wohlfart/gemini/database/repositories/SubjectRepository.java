package net.wohlfart.gemini.database.repositories;

import net.wohlfart.gemini.database.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {

    void deleteByName(String admin);

}
