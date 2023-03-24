/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atmu;

/**
 *
 * @author s1290
 */
public class ATM extends Transaccion {

    public ATM() {

        this.inicializar();
        this.menuDeOPciones();
    }

    private void inicializar() {
        int numeroDeCuenta;
        int numeroDeNip;
        int MenuDeOpciones;

        // numero de cuenta 
        System.out.println("-------------------------------------------------");
        pantallaObj.mostrarMensaje("Bienvenido ");
        System.out.println("-------------------------------------------------");

        pantallaObj.mostrarMensaje("Ingrese su numero de cuenta ");
        numeroDeCuenta = tecladoObj.recibirEntrada();
        System.out.println("su numero de cuenta es " + numeroDeCuenta);

        //numero de Nip
        pantallaObj.mostrarMensaje("Ingrese su numero de NIP");
        numeroDeNip = tecladoObj.recibirEntrada();
        System.out.println("su numero de NIP es " + numeroDeNip);

    }

    private void menuDeOPciones() {
        int monto = 0;
        int seleccion;

        do {
            do {
                System.out.println("-------------------------------------------------");
                pantallaObj.mostrarMensaje("Menu de opciones");
                System.out.println("-------------------------------------------------");
                pantallaObj.mostrarMensaje("1 - ver mi saldo");
                pantallaObj.mostrarMensaje("2 - Retirar efectivo");
                pantallaObj.mostrarMensaje("3 - Depositar fondos");
                pantallaObj.mostrarMensaje("4 - salir");
                pantallaObj.mostrarMensaje("Escriba una opcion: ");
                seleccion = tecladoObj.recibirEntrada();
                if (seleccion >= 1 && seleccion <= 4) {
                    monto = 1;
                } else {
                    System.out.println("-------------------------------------------------");
                    System.out.println("Opción no disponible, vuelva a intentar por favor.");
                    System.out.println("-------------------------------------------------");
                }
            } while (monto == 0);

            switch (seleccion) {
                
                case 1:
                    pantallaObj.mostrarMensaje("-------------------------------------------------");
                    pantallaObj.mostrarMensaje("Saldo disponible: UM " + cuentaObj.getSaldo());
                    pantallaObj.mostrarMensaje("-------------------------------------------------");
                    break;

                case 2:

                    Transaccion retirar = new Retiro();
                    retirar.Transacciones();
                    break;

                case 3:

                    Transaccion mensajero = new Deposito();
                    mensajero.Transacciones();
                    break;

                case 4:

                    System.out.println("--------------------------");
                    System.out.println("¡Gracias!, vuelva pronto.");
                    System.out.println("--------------------------");
                    monto = 2;
                    break;
            }

        } while (monto != 2);
    }


    /*
    
  public  void depositar(int monto) { }
  public  void acreditar(int monto) { }
  public  void mostrarSaldo(int numeroDeCuenta) { }
  public  void retirar(int monto) { }
  public  void debitar(int monto) { }
  public  boolean autenticar(int nip, int numeroDeCuenta) { return true; }

     */
}
