import java.util.Scanner;

/*
 * @author: Alina CARÍAS (22539), Daniel Machic (22118), Marcos Díaz (22)
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
        while(salida  == false){
            System.out.println("MENU DE FUNCIONALIDADES");
            System.out.println("1. Encender\n");
            System.out.println("2. Cambiar de AM a FM\n");
            System.out.println("3. Avanzar emisoras\n");
            System.out.println("4. Guardar Emisora\n");
            System.out.println("5. Seleccionar Emisora\n");
            System.out.println("6. Apagar radio");            
            System.out.println("7. Salida");
            opcion = Integer.parseInt(teclado.nextLine());

            if(opcion == 1){
                radio.encenderApagar();
            }else if(opcion == 2){

            }else if(opcion == 3){

            }else if(opcion == 4){

            }else if(opcion == 5){

            }else if(opcion == 6){

            }else if(opcion == 7){

            }else{
                System.out.println("Opción no valida, intente nuevamente...");
            }

            switch(opcion){

                case 1:
                    
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
                accion = 0;
                    System.out.println("1. Subir");
                    System.out.println("2. Bajar");

                    accion = Integer.parseInt(teclado.nextLine());

                    if(accion != 1){
                        radio.Backward(-10);
                    }else{
                        radio.Forward(10);
                    }                    
                break;
                    

                case 4:
                    

                break;

                case 5:
                    break;
                    default:
                        System.out.println("Se apagó la radio");

                    break;
                }
            }
    
        }
    }