import java.util.Scanner;

/*
 * @author: Alina CARÍAS (22539), Daniel Machic (22), Marcos Díaz (22)
 * @Date: 16/01/2023
 * Sección: 40
 * Clase Princiapl: es la unica que interactua con el usuario
 */
public class Principal{
    public static void main(String[] args) {
        Radio radio = new Radio();
        Scanner teclado = new Scanner(System.in);
        String menu = "==Bienvenido a la Radio==\n" +
        "Seleccione Lo que desea hacer\n" +
        "1. Prender la radio\n" +
        "2. Cambiar de AM a FM\n" +
        "3. Avanzar emisoras\n" +
        "4. Guardar Emisora\n" + 
        "5. Seleccionar Emisora\n" +
        "6. Apagar radio";
        int opcion = 1;
        while (opcion>=1 && opcion<6){
            try{
                System.out.println(menu);
                opcion = teclado.nextInt();
            }
            catch (Exception e){
                teclado.nextLine();
                System.out.println("\nDebe ingresar un número valido\n");
                opcion = 1;

            }
        }

    }
}