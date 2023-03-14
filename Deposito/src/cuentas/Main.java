package cuentas;

/**
 * Clase que contiene el metodo main para probar la funcionalidad de la clase
 * CCuenta
 *
 * @author David
 */
public class Main {

    /**
     * Metodo main para probar la funcionalidad de la clase CCuenta
     *
     * @param args argumentos pasados a la aplicacion
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        //Anado un print para verificar que se actualiza el contenido en GIT
        System.out.println("Este mensaje debe agregarse "
                + " al proyecto enlazado en GIT");

        cuenta1 = new CCuenta("Antonio López",
                "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es" + saldoActual);

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

    /**
     * Agregamos el nuevo metodo llamado operativa_cuenta esta clase contiene el
     * metodo estativo "operativa_cuenta" el cual permite realizar operaciones
     * bancarias en una cuenta de cliente
     *
     * @param cuenta de la clase CCuenta
     * @param cantidad de tipo float
     */

    public static void operativa_cuenta(CCuenta cuenta, float cantidad) {
        try {
            cuenta.retirar(cantidad);
            System.out.println("Se han retirado " + cantidad + " euros");
        } catch (Exception e) {
            System.out.println("Fallo al retirar " + cantidad + " euros");
        }
        try {
            cuenta.ingresar(cantidad);
            System.out.println("Se han ingresado " + cantidad + " euros");
        } catch (Exception e) {
            System.out.println("Fallo al ingresar " + cantidad + " euros");
        }
    }

}
