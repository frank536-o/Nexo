package app.service.helpers;

import app.domain.enums.DocumentTypeEnum;
import app.service.Validations.FormTypeValidator;

public class SetDocumentType {
    public static String getDocType() {
        String value = "";
        boolean opcionValida = false;
        while (!opcionValida) {
            int option = FormTypeValidator.intValidator("seleccione tipo de documento: \n" +
                    "1. Cédula \n" +
                    "2. Tarjeta de Identidad \n" +
                    "3. Cédula de Extrajeria \n" +
                    "4. Pasaporte \n");
            switch (option) {
                case 1:
                    value = DocumentTypeEnum.CEDULA_CIUDADANIA.getValue();
                    opcionValida = true;
                    break;
                case 2:
                    value = DocumentTypeEnum.TARJETA_IDENTIDAD.getValue();
                    opcionValida = true;
                    break;
                case 3:
                    value = DocumentTypeEnum.CEDULA_EXTRANJERIA.getValue();
                    opcionValida = true;
                    break;
                case 4:
                    value = DocumentTypeEnum.PASAPORTE.getValue();
                    opcionValida = true;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
        return value;
    }
}