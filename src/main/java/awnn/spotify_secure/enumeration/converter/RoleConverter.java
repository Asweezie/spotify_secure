package awnn.spotify_secure.enumeration.converter;

import awnn.spotify_secure.enumeration.Authority;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.stream.Stream;

@Converter(autoApply = true)
public class RoleConverter implements AttributeConverter<Authority, String> {

    @Override
    public String convertToDatabaseColumn(Authority authority) {
        if (authority == null) {
            return null;
        }
        return authority.getValue();
    }

    @Override
    public Authority convertToEntityAttribute(String dbCode) {
        if (dbCode == null) {
            return null;
        }
        return Stream.of(Authority.values())
                .filter(authority -> authority.getValue().equals(dbCode))
                .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
