package com.mycompany.atmu;

/**
 *
 * @author s1290
 */
public class Retiro extends Transaccion {

    public void Transacciones() {

        int montoRetiro;
        int monto = 0;
        do {
            do {
                pantallaObj.mostrarMensaje("1 - ver mi saldo");
                pantallaObj.mostrarMensaje("Menu de Retiro");
                pantallaObj.mostrarMensaje("1 - $20");
                pantallaObj.mostrarMensaje("2 - $40");
                pantallaObj.mostrarMensaje("3 - $60");
                pantallaObj.mostrarMensaje("4 - $100");
                pantallaObj.mostrarMensaje("5 - $200");
                pantallaObj.mostrarMensaje("6 - Cancelar transaccion");
                pantallaObj.mostrarMensaje("Elija un monto de retiro: ");

                montoRetiro = tecladoObj.recibirEntrada();
                if (montoRetiro > 6) {
                    pantallaObj.mostrarMensaje("-------------------------------------------------");
                    pantallaObj.mostrarMensaje("Error: opción inválida.");
                    pantallaObj.mostrarMensaje("-------------------------------------------------");
                }

            } while (montoRetiro < 1 || montoRetiro > 6);

            switch (montoRetiro) {
                case 1:
                    monto = 20;
                    break;
                case 2:
                    monto = 40;
                    break;
                case 3:
                    monto = 60;
                    break;
                case 4:
                    monto = 100;
                    break;
                case 5:
                    monto = 200;
                    break;
                case 6:
                    pantallaObj.mostrarMensaje("-------------------------------------------------");
                    pantallaObj.mostrarMensaje("Transaccion cancelada");
                    pantallaObj.mostrarMensaje("-------------------------------------------------");
                    return;

            }

            if (monto > cuentaObj.getSaldo()) {
                pantallaObj.mostrarMensaje("-------------------------------------------------");
                pantallaObj.mostrarMensaje("No cuenta con saldo suficiente para realizar esta transaccion");
                pantallaObj.mostrarMensaje("-------------------------------------------------");
            } else {
                cuentaObj.setSaldo(cuentaObj.getSaldo() - monto);
                pantallaObj.mostrarMensaje("-------------------------------------------------");
                pantallaObj.mostrarMensaje("Retiro exitoso de UM " + monto);
                pantallaObj.mostrarMensaje("Tu saldo Actual es de: " + cuentaObj.getSaldo());
                pantallaObj.mostrarMensaje("Por favor, recuerda tomar tu dinero.");
                pantallaObj.mostrarMensaje("-------------------------------------------------");
            }

        } while (monto != 0);

    }

}
