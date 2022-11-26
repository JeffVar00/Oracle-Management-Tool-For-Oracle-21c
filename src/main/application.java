package main;

import vista.Login;


public class application{

    public static void main(String[] args){

        Login ventana = new Login(); //Abre la ventana de la clase Respaldos
        ventana.cargarUsuarios();
        ventana.setVisible(true);
    }
    
}
