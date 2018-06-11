package net.wohlfart.gemini.database.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Converter
public class MapToStringConverter implements AttributeConverter<Map<String, String>, String> {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(Map<String, String> data) {
        String value = "";
        try {
            value = MAPPER.writeValueAsString(data);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return value;
    }

    @Override
    public Map<String, String> convertToEntityAttribute(String data) {
        Map<String, String> mapValue = new HashMap<>();
        TypeReference<HashMap<String, Object>> typeRef = new TypeReference<HashMap<String, Object>>() {};
        try {
            mapValue = MAPPER.readValue(data, typeRef);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return mapValue;
    }

}
