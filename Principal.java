import java.util.Scanner;

/*
 * @author: Alina CARÍAS (22539), Daniel Machic (22), Marcos Díaz (22)
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
        String menu = "==Bienvenido a la Radio==\n" +
        "Seleccione Lo que desea hacer\n" +
        "1. Prender la radio\n" +
        "2. Cambiar de AM a FM\n" +
        "3. Avanzar emisoras\n" +
        "4. Retroceder emisoras\n" +
        "5. Guardar Emisora\n" + 
        "6. Seleccionar Emisora\n" +
        "7. Apagar radio";
        int opcion = 1;
        int op = 0;
        while (opcion>=1 && opcion<6){
            try{
                System.out.println(menu);
                opcion = teclado.nextInt();
                teclado.nextLine();
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
                    break;
                    case 4:
                    break;
                    case 5:
                    break;
                    case 6:
                    break;
                    case 7:
                    break;
                    default:
                        System.out.println("Se apagó la radio");

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