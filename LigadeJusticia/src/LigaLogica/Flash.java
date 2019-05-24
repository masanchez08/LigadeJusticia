/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LigaLogica;

/**
 *
 * @author user
 */
public class Flash implements Ingenio,Velocidad,Comunicacion,DatosBasicos {
    public void raza(){
        System.out.println("Flash es un mutante producto de la mezcla de un rayo y quimicos");
        System.out.println("Su nombre real es Barry Allen");
    }
    public void descripcion(){
        System.out.println("Género: Masculino \n Altura: 5' 8 1.73cms \n Peso: 160 lbs (80 kg) \n");
    }
    public void agilidad(){
        System.out.println("Es el hombre más rápido vivo. \nEs mas rápido que la velocidad de la luz, esto le ayuda para poder viajar en el tiempo, tambien gracias a esto puede correr sobre el agua y escalar paredes.\n");
                
    }
    public void rapidez(){
        System.out.println("Es capaz de hablar rápido, útil para evitar que una charla sea escuchada.\n");
    }
}
