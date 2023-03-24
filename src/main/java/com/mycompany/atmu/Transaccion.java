/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atmu;

/**
 *
 * @author s1290
 */
public abstract class Transaccion {

    

    Dispensador dispensadorObj;
    Pantalla pantallaObj;
    RanuraDeDeposito ranuraDeDepositoObj;
    Teclado tecladoObj;
    Cuenta cuentaObj;

    public Transaccion() {
        this.dispensadorObj = new Dispensador();
        this.pantallaObj = new Pantalla();
        this.ranuraDeDepositoObj = new RanuraDeDeposito();
        this.tecladoObj = new Teclado();
        this.cuentaObj = new Cuenta();

    }

    public void Transacciones() {
    }

}
