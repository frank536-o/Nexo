package app.domain.enums;

public enum ReservaTypeEnum {
    RESERVA_DISPONIBLE("Reserva Disponible"),
    RESERVADO("Reservado"),
    RESERVA_CANCELADA("Reserva Cancelada"),
    ;

    private final String value;

    ReservaTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

