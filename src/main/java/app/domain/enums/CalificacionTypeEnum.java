package app.domain.enums;

import app.domain.Calificacion;

public enum CalificacionTypeEnum {
    UNO("Muy Malo"),
    DOS("Malo"),
    TRES("Regular"),
    CUATRO ("Bueno"),
    CINCO ("Muy Bueno"),
    ;

    private final String value;

    CalificacionTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

