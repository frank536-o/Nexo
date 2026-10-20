package app.service.helpers;

import app.domain.Calificacion;
import app.domain.enums.CalificacionTypeEnum;
import app.domain.enums.DocumentTypeEnum;
import app.service.Validations.FormTypeValidator;

public class SetCalificacionType { public static String getDocType(){
    int option = FormTypeValidator.intValidator("seleccione"+
            "1.Muy Malo"+
            "2. Malo"+
            "3. Regular"+
            "4. Bueno"+
            "5. Muy Bueno");
    String value = "";
    switch (option){
        case 1:
            value = CalificacionTypeEnum.UNO.getValue();
            break;
        case 2:
            value = CalificacionTypeEnum.DOS.getValue();
            break;
        case 3:
            value = CalificacionTypeEnum.TRES.getValue();
            break;
        case 4:
            value = CalificacionTypeEnum.CUATRO.getValue();
            break;
        case 5:
            value = CalificacionTypeEnum.CINCO.getValue();
        default:
            System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            break;
    }
    return value;
}
}
