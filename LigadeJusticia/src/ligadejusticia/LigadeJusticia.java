/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ligadejusticia;

import LigaLogica.AquaMan;
import LigaLogica.Flash;
import LigaLogica.SuperMan;
import LigaLogica.WonderWoman;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class LigadeJusticia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Seleccione el personaje  ");
        System.out.println(" 1.Aquaman  ");
        System.out.println(" 2.Superman   ");
        System.out.println(" 3.Wonderwoman  ");
        System.out.println(" 4.Flash  ");
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        switch (num) {
            case 1:
                AquaMan a = new AquaMan();
                a.raza();
                a.descripcion();
                a.vuelo();
                a.resistencia();
                a.agilidad();
                a.telepatia();
                a.Hdepoder();
                break;
            case 2:
                SuperMan s = new SuperMan();
                s.raza();
                s.descripcion();
                s.golpear();
                s.alzar();
                s.resistencia();
                break;
            case 3:
                WonderWoman w = new WonderWoman();
                w.raza();
                w.descripcion();
                w.golpear();
                w.esquivar();
                w.correr();
                w.vuelo();
                w.resistencia();
                w.pensar();
                w.herramientas();
                w.despegar();
                w.Hdepoder();
                break;
            case 4:
                Flash f = new Flash ();
                f.raza();
                f.descripcion();
                f.agilidad();
                f.rapidez();
                
                

        }

    }

}
