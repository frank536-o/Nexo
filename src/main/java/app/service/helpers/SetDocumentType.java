package app.service.helpers;

import app.domain.enums.DocumentTypeEnum;
import app.service.Validations.FormTypeValidator;

public class SetDocumentType {
    public static String getDocType(){
        int option = FormTypeValidator.intValidator("seleccione tipo de documento: \n"+
                "1. Cédula \n"+
                "2. Tarjeta de Identidad \n"+
                "3. Cédula de Extrajeria \n"+
                "4. Pasaporte \n");
        String value = "";
        switch (option){
            case 1:
                value = DocumentTypeEnum.CEDULA_CIUDADANIA.getValue();
                break;
            case 2:
                value = DocumentTypeEnum.TARJETA_IDENTIDAD.getValue();
                break;
            case 3:
                value = DocumentTypeEnum.CEDULA_EXTRANJERIA.getValue();
                break;
            case 4:
                value = DocumentTypeEnum.PASAPORTE.getValue();
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                break;
        }
        return value;
    }
}
