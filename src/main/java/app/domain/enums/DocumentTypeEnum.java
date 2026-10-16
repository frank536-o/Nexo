package app.domain.enums;

public enum DocumentTypeEnum {
    CEDULA_CIUDADANIA("Cédula"),
    TARJETA_IDENTIDAD("Tarjeta de Identidad "),
    CEDULA_EXTRANJERIA("Cédula de Extranjería"),
    PASAPORTE("Pasaporte");

    private final String value;

    DocumentTypeEnum(String Value){this.value = value;}

    public String getValue() {return value;}
}
