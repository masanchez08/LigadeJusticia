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
public class WonderWoman implements DatosBasicos, Superfuerza, Volar, Velocidad, Ingenio {

    public void raza() {
        System.out.println("Es una princesa guerrera de las Amazonas\n ");
        System.out.println("Su nombre real es Diana de Temiscira\n");
    }
     public void descripcion() {
        System.out.println("Género: Femenino \n 1,80 m (5 ft 11 in) \n Peso: 75 kg (165 lb)\n");

    }


    public void golpear() {
        System.out.println("Gracias a su fuerza sobrehumana, puede golpear de manera certera. Generando daños en sus contrincantes \n");
    }
    public void resistencia(){
        System.out.println("Resiste grandes cantidades de fuerza bruta y es una gran luchadora cuerpo a cuerpo\n");
    }

   
    public void esquivar() {
        System.out.println("Esquiva con gran precision los ataques de sus enemigos\n ");
    }

    public void correr() {
        System.out.println("La velocidad promedio de una bala es de alrededor de 760 m/s y ella es capaz de esquivarlas o desviarlas fácilmente. La velocidad de reacción está arraigada en ella por los años de ser una guerrera. \n");
    }
    public void despegar(){
        System.out.println("Ya que no vuela por su propia cuenta,su despegue se debe a los grandes saltos que da. \n");
        
    }
    public void vuelo(){
        System.out.println("Puede desplazarse por el aire en una gran longitud, gracias a la fuerza de sus saltos\n");
    }
    public void herramientas(){
        System.out.println("No puede volar como tal, por eso se le ve andar en su Jet Invisible.\n");
    }
    public void pensar(){
        System.out.println("Posee una increíble inteligencia, pues ella tiene conocimiento de magia, ciencias, sabe más de 10 idiomas y es considerada una de los miembros más sabios e inteligentes de la Liga de la Justicia\n");
    }
    public void Hdepoder(){
        System.out.println("Utiliza brazaletes protectores (capaces de detener balas, ademas pueden crear una ola de fuerza de conmoción que es capaz de hacer fuertes ondas de sonido que perturben a seres como Superman al hacerle sangrar sus propios oídos).\n Tambien, utiliza artefactos como el cinturón de fuerza, la tiara telepática y el lazo de la verdad.\n");
    }
}
