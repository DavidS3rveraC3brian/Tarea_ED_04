package cuentas;

/**
 * Clase CCuenta que dearrolla la logica del funcionamiento junto a sus
 * atributos de tipo privado para encapsular la informacion y sus metodos que
 * anaden las funcionalidades de este programa
 *
 * @author David
 */
public class CCuenta {

    //Los atributos de la clase CCuenta encapsulados de tipo private
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor de la clase CCuenta. Crea una nueva instancia de la clase con
     * los valores iniciales proporcionados para el nombre, número de cuenta,
     * saldo y tipo de interés.
     *
     * @param nom El nombre del titular de la cuenta.
     * @param cue El número de cuenta de la cuenta.
     * @param sal El saldo inicial de la cuenta.
     * @param tipo El tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    /**
     * Devuelve el número de cuenta de la cuenta.
     *
     * @return El número de cuenta de la cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Modifica el número de cuenta de la cuenta.
     *
     * @param cuenta El nuevo número de cuenta para la cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     *
     * @return El saldo actual de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Modifica el saldo actual de la cuenta.
     *
     * @param saldo El nuevo saldo para la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Asigna un nombre de titular a la cuenta.
     *
     * @param nom El nombre del titular de la cuenta.
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    /**
     * Devuelve el nombre del titular de la cuenta.
     *
     * @return El nombre del titular de la cuenta.
     */
    public String obtenerNombre() {
        return getNombre();
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     *
     * @return El saldo actual de la cuenta.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Devuelve la suma total del ingreso + saldo diponible dando lugar al nuevo
     * saldo actualizado
     *
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**
     * Devuelve el resultado de la resta entre el saldo actual y el saldo
     * retirado dando lugar al nuevo saldo disponible actualizado
     *
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }

    /**
     * Devuelve el numero de la cuenta bancaria
     *
     * @return
     */
    public String obtenerCuenta() {
        return cuenta;
    }

    /**
     * Devuelve el nombre del titular de la cuenta bancaria
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el nombre del titular de la cuenta bancaria
     *
     * @param nombre el nuevo nombre del titular de la cuenta bancaria
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el tipo de interes de la cuenta bancaria
     *
     * @return tipo de interes de la cuenta bancaria
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interes de la cuenta bancaria
     *
     * @param tipoInterés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

}
