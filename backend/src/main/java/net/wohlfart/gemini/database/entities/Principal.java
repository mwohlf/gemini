package net.wohlfart.gemini.database.entities;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * A subset of subject that is represented by an account, role or other unique identifier.
 * When we get to the level of implementation details, principals are the unique keys we use
 * in access control lists. They may represent human users, automation, applications, connections, groups...
 */
@Data
@Entity
public class Principal {

    @Id
    @GenericGenerator(name = "sequenceGenerator",
        strategy = "org.hibernate.id.enhanced.TableGenerator",
        parameters = {
            @org.hibernate.annotations.Parameter( name = "segment_value", value = "PRINCIPAL"),
            @org.hibernate.annotations.Parameter( name = "initial_value", value = "10"),
            @org.hibernate.annotations.Parameter( name = "table_name", value = "SEQUENCES")
        })
    @GeneratedValue(generator = "sequenceGenerator")
    private Long id;

}
