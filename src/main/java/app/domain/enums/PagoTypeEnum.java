package app.domain.enums;

public enum PagoTypeEnum {
    PAGO_REALIZADO("Pago Realizado"),
    PENDIENTE_PAGO("Pendiente de pago"),
    ;

    private final String value;

    PagoTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

