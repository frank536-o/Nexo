
package app.view;

import app.domain.Billetera;
import app.service.inputport.BilleteraService;

import java.util.Scanner;

public class BilleteraView {

    private final BilleteraService billeteraService;
    private final Scanner sc = new Scanner(System.in);

    public BilleteraView(BilleteraService billeteraService) {
        this.billeteraService = billeteraService;
    }

    public void buscarBilletera() {
        System.out.print("Ingrese el id de la billetera: ");
        int idBilletera = sc.nextInt();
        sc.nextLine();

        Billetera billetera = billeteraService.selectBilleteraById(idBilletera);
        if (billetera != null) {
            System.out.println("*** BILLETERA ***");
            System.out.println("ID Billetera: " + billetera.getId_Billetera());
            System.out.println("ID Cliente: " + (billetera.getId_Cliente() != null ? billetera.getId_Cliente() : "N/A"));
            System.out.println("ID Prestador: " + (billetera.getId_Prestador() != null ? billetera.getId_Prestador() : "N/A"));
            System.out.println("Saldo actual: $" + billetera.getSaldo());
        } else {
            System.out.println("No se encontró ninguna billetera con ese id.");
        }
    }

    public void recargarSaldo() {
        System.out.print("Ingrese el id de la billetera a recargar: ");
        int idBilletera = sc.nextInt();

        Billetera billetera = billeteraService.selectBilleteraById(idBilletera);
        if (billetera == null) {
            System.out.println("No se encontró ninguna billetera con ese id.");
            sc.nextLine();
            return;
        }

        System.out.print("Ingrese el monto a recargar: ");
        double monto = sc.nextDouble();
        sc.nextLine();

        if (monto <= 0) {
            System.out.println("El monto debe ser mayor a cero.");
            return;
        }

        double nuevoSaldo = billetera.getSaldo() + monto;
        Billetera actualizada = billeteraService.actualizarBilletera(idBilletera, nuevoSaldo);

        if (actualizada != null) {
            System.out.println("Recarga exitosa. Nuevo saldo: $" + actualizada.getSaldo());
        }
    }
}
