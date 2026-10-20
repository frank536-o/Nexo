package app.service.helpers;

import app.domain.enums.PagoTypeEnum;
import app.domain.enums.ReservaTypeEnum;
import app.service.Validations.FormTypeValidator;

public class SetReservaType {    public static String getDocType(){
    int option = FormTypeValidator.intValidator("seleccione"+
            "1. Reserva Disponible"+
            "2. Reservado"+
            "3. Reserva Cancelada");
    String value = "";
    switch (option){
        case 1:
            value = ReservaTypeEnum.RESERVA_DISPONIBLE.getValue();
            break;
        case 2:
            value = ReservaTypeEnum.RESERVADO.getValue();
            break;
        case 3:
            value = ReservaTypeEnum.RESERVA_CANCELADA.getValue();
        default:
            System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            break;
    }
    return value;
}
}

