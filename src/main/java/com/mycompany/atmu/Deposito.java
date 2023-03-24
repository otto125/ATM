/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atmu;

/**
 *
 * @author s1290
 */
public class Deposito extends Transaccion {

    float saldo;

    public void Transacciones() {
        
        float deposito;

      
        pantallaObj.mostrarMensaje("-------------------------------------------------");
        pantallaObj.mostrarMensaje("Ingrese la cantidad de dinero a depositar");
        pantallaObj.mostrarMensaje("si desea cancelar la transaccion, oprima el numero 0 ");
        pantallaObj.mostrarMensaje("-------------------------------------------------");
        deposito = tecladoObj.recibirEntrada();

        if (deposito == 0) {
            pantallaObj.mostrarMensaje("-------------------------------------------------");
            pantallaObj.mostrarMensaje("Transacción cancelada.");
            pantallaObj.mostrarMensaje("-------------------------------------------------");
            return;
        }

        deposito /= 100;
        cuentaObj.agregarSaldo(deposito);
        saldo = cuentaObj.getSaldo();

        pantallaObj.mostrarMensaje("-------------------------------------------------");
        pantallaObj.mostrarMensaje("Se ha depositado UM " + deposito + " con éxito. Su saldo actual es UM: " + saldo);
        pantallaObj.mostrarMensaje("-------------------------------------------------");
    }
}
