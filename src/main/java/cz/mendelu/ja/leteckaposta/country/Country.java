package cz.mendelu.ja.leteckaposta.country;

import lombok.Data;

import java.util.Collection;

@Data
public class Country {

    private final String cca3;
    private Collection<Country> borders;
    private City capital;

}
