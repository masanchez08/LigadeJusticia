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
public class SuperMan implements Superfuerza,DatosBasicos {
public void raza(){
    System.out.println("Pertenece a la raza Kryptoniana. Su nombre real es Kal-El \n");
}  
public void descripcion(){
    System.out.println("Género: Masculino \n Altura: 6' 3 1.93cms \n Peso: 235 lbs (107 kg) \n");

}
public void golpear(){
    System.out.println("Gracias a su fuerza sobrehumana, puede golpear de manera certera. Generando daños en sus contrincantes \n");
}
public void alzar(){
    System.out.println("Puede alzar cualquier cosa desde varias toneladas hasta planetas enteros \n");
}   
public void resistencia(){
    System.out.println("La resistencia de Superman es ilimitada, siempre y cuando se mantenga bajo la luz solar. \n");
}    
    
}
