package net.wohlfart.gemini.database;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * The JAAS framework defines the term subject to represent the source of a request.
 * A subject may be any entity, such as a person or service.
 * A subject is represented by the
 * @see javax.security.auth.Subject class.
 *
 * A {@code Subject} represents a grouping of related information for a single entity, such as a person.
 * Such information includes the Subject's identities as well as its security-related attributes
 * (passwords and cryptographic keys, for example).
 */
@Entity
public class Subject {

    @Id
    @GenericGenerator(name = "sequenceGenerator",
            strategy = "org.hibernate.id.enhanced.TableGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter( name = "segment_value", value = "SUBJECT"),
                    @org.hibernate.annotations.Parameter( name = "initial_value", value = "10"),
                    @org.hibernate.annotations.Parameter( name = "table_name", value = "SEQUENCES")
            })
    @GeneratedValue(generator = "sequenceGenerator")
    private Long id;

    @Column(name = "NAME")
    private String name;



}
