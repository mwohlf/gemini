package net.wohlfart.gemini;

import lombok.AllArgsConstructor;
import net.wohlfart.gemini.database.entities.Subject;
import net.wohlfart.gemini.database.repositories.CredetialRepository;
import net.wohlfart.gemini.database.repositories.PrincipalRepository;
import net.wohlfart.gemini.database.repositories.SubjectRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@AllArgsConstructor
public class SetupAdminLogin {

    public static final String ADMIN = "admin";

    private final CredetialRepository credetialRepository;

    private final PrincipalRepository principalRepository;

    private final SubjectRepository subjectRepository;

    @PostConstruct
    public void setupAdminLogin() {
        // create the admin user:
        subjectRepository.deleteByName(ADMIN);
        final Subject admin = Subject.builder()
            .name(ADMIN)
            // TODO...
            .build()
            ;
        subjectRepository.save(admin);
    }

}
