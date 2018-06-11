package net.wohlfart.gemini.database.entities;

import lombok.Data;
import net.wohlfart.gemini.database.CredentialType;
import net.wohlfart.gemini.database.util.MapToStringConverter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Map;

/**
 * A credential may contain information used to authenticate the subject to new services. Such credentials include
 * passwords, Kerberos tickets, and public key certificates. Credentials might also contain data
 * that enables the subject to perform certain activities.
 *
 * Credetial can be a way to authenticate a Subject or user
 */
@Data
@Entity
public class Credential {

    @Id
    @GenericGenerator(name = "sequenceGenerator",
        strategy = "org.hibernate.id.enhanced.TableGenerator",
        parameters = {
            @org.hibernate.annotations.Parameter( name = "segment_value", value = "CREDETIONAL"),
            @org.hibernate.annotations.Parameter( name = "initial_value", value = "10"),
            @org.hibernate.annotations.Parameter( name = "table_name", value = "SEQUENCES")
        })
    @GeneratedValue(generator = "sequenceGenerator")
    private Long id;

    @Enumerated(EnumType.STRING)
    private CredentialType credentialType;

    @Convert(converter = MapToStringConverter.class)
    private Map<String, String> config;

}
