package app.service.helpers;

import app.domain.enums.DocumentTypeEnum;
import app.domain.enums.PagoTypeEnum;
import app.service.Validations.FormTypeValidator;

public class SetPagoType {
    public static String getDocType(){
        int option = FormTypeValidator.intValidator("seleccione"+
                "1. Pago Realizado"+
                "2. Pendiente de pago");
        String value = "";
        switch (option){
            case 1:
                value = PagoTypeEnum.PAGO_REALIZADO.getValue();
                break;
            case 2:
                value = PagoTypeEnum.PENDIENTE_PAGO.getValue();
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                break;
        }
        return value;
    }
}
