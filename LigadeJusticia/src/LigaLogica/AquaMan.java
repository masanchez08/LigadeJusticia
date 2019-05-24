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
public class AquaMan implements DatosBasicos,Superfuerza,Velocidad,Volar,Comunicacion,Otros {
    public void raza(){
        System.out.println("Aquaman es mitad humano,mitad atlante.");
    }
    public void descripcion(){
        System.out.println("Género: Masculino \n Altura: 6' 4 1.95cms \n Peso: 235 lbs (107 kg) \n ");
    }
    public void resistencia(){
        System.out.println("Puede soportar grandes pesos, es capaz de levantar al animal mas pesado del mundo.\n");
    }
   public void agilidad(){
       System.out.println("Puede nadar a velocidades muy altas, al igual que correr de manera veloz, incluso puede nadar hasta en contra de la corriente de rios y cascadas caudalosas, como las cataratas del Niágara. \n");
   }         
   public void telepatia(){
       System.out.println("Es capaz de comunicarse con los animales por medio de la telepatia");
       
   } 
    public void vuelo(){
        System.out.println("Gracias a la bendicion de Poseidon, este perosnaje puede volar");
    }
   public void Hdepoder(){
       System.out.println("Utiliza el Tridente de Poseidon, que ademas de servirle como arma, por medio de este, puede manejar el agua, hacer bolas de fuego y crear tempestades.\n");
   }
}
