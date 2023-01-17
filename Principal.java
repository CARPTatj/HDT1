import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/*
 * @author: Alina CARÍAS (22539), Daniel Machic (22118), Marcos Díaz (221102)
 * @author: Alina CARÍAS (22539), Daniel Machic (22), Marcos Díaz (221102)
 * @Date: 16/01/2023
 * Sección: 40
 * Clase Princiapl: es la unica que interactua con el usuario
 */
public class Principal{
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Radio radio = new Radio();
        Scanner teclado = new Scanner(System.in);

        /**
         * Menu de opciones de la radio
         */
        String menu = "==Bienvenido a la Radio==\n" +
        "Seleccione Lo que desea hacer\n" +
        "1. Prender la radio\n" +
        "2. Cambiar de AM a FM\n" +
        "3. Avanzar emisoras\n" +
        "4. Retroceder emisoras\n" +
        "5. Guardar Emisora\n" + 
        "6. Seleccionar Emisora\n" +
        "7. Apagar radio\n" +
        "8. Salir";
        int opcion = 1;
        boolean encendido = false;
        int op = 0;
        String a = "";
        while (opcion>=1 && opcion<=7){
            try{
                System.out.println(menu);
                opcion = teclado.nextInt();
                teclado.nextLine();
                switch(opcion){
                    case 1:
                        System.out.println("La radio esta encendida");
                        encendido = true;
                        System.out.println(encendido);
                    break;
                    case 2:
                        System.out.println("Coloque AM(1) o FM(2), dependiendo lo que desea escuchar");
                        op = teclado.nextInt();
                        teclado.nextLine();
                        if (op==1){
                            System.out.println("Esta es la frecuencia AM" + radio.getFrequence());
                        }
                        if (op==2){
                            System.out.println("Esta es la frecuencia FM" + radio.getFrequence());
                        }
                    break;
                    case 3:
        
                    break;
                    case 4:
                    break;
                    case 5:
                    break;
                    case 6:
                    break;
                    case 7:
                        if(encendido == true){
                            System.out.println("Deseas apagar la radio?");
                            a = teclado.nextLine();
                            if(a.equals("Si")){
                                System.out.println("La radio esta apagada");
                                encendido = false;
                            }else if(a.equals("No")){
                                System.out.println("La radio seguira encendida");
                            }
                        }else if(encendido == false){
                            System.out.println("La radio ya esta apagada");
                        }
                    break;
                    case 8:
                        System.out.println("Gracias por usar el programa");
                    break;
                    default:
                        System.out.println("Entrada incorrecta, vuelve a intentarlo");
                    break;
                }
            }
            catch (Exception e){
                teclado.nextLine();
                System.out.println("\nDebe ingresar un número valido\n");
                opcion = 1;

            }
        }

    }
}