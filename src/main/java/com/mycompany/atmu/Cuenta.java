/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atmu;

/**
 *
 * @author s1290
 */
public class Cuenta {

    private float saldo;
    private int numeroDeCuenta;
    private int nip;
    Cliente clienteObj;

    //Constructor: inicializa el estado del objeto
    public Cliente getCliente() {
        return this.clienteObj;
    }

    public void setCliente(Cliente cliente) {
        this.clienteObj = cliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        if (numeroDeCuenta > 9999 && numeroDeCuenta < 100000) {
            this.numeroDeCuenta = numeroDeCuenta;
        } else {
            System.out.println("Ingrese un numero de cuenta válido.");
        }
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public void agregarSaldo(float cantidad) {
        setSaldo(getSaldo() + cantidad);
        System.out.println("Saldo actual: " + getSaldo());

    }

}
