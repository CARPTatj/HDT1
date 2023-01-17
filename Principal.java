import java.util.Scanner;

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
        String menu = "==Bienvenido a la Radio==\n" +
        "Seleccione Lo que desea hacer\n" +
        "1. Cambiar de AM a FM\n" +
        "2. Avanzar o retroceder emisoras\n" +
        "3. Guardar Emisora\n" + 
        "4. Seleccionar Emisora\n" +
        "5. Apagar radio";
        int opcion = 1;
        int op = 0;
        while (opcion>=1 && opcion<6){
            try{
                System.out.println("Quiere encender la radio? Si o no");
                String respuesta ="si";
                if (respuesta == "si"){
                    System.out.println(menu);
                    opcion = teclado.nextInt();
                    teclado.nextLine();
                    switch(opcion){
                        case 1:
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
                        case 2:
                            int accion = 0;
                            System.out.println("1. Subir");
                            System.out.println("2. Bajar");
        
                            accion = Integer.parseInt(teclado.nextLine());
        
                            if(accion != 1){
                                radio.Backward();
                                radio.getFrequence();
                                System.out.println("Se ha bajado la estacion");
                            }else{
                                radio.Forward();
                                radio.getFrequence();
                                System.out.println("Se ha subido la estacion");
                            } 
                        break;
                        case 3:
                            if (radio.getFrequence() == "AM"){
                                System.out.println("Seleccione en que slot desea guardar la emisora (1-12)");
                                int numero = teclado.nextInt();
                                teclado.nextLine();
                                radio.saveAMStation(radio.getAMActualStation(), numero); 
                                System.out.println("La emisora ha sido guardadda exitosamente");

                            }
                            else if (radio.getFrequence() == "FM"){
                                System.out.println("Seleccione en que slot desea guardar la emisora (1-12)");
                                int numero = teclado.nextInt();
                                teclado.nextLine();
                                radio.saveAMStation(radio.getFMActualStation(), numero); 
                                System.out.println("La emisora ha sido guardadda exitosamente");
                            }
                        break;
                        case 4:
                        break;
                        case 5:
                            radio.off();
                            System.out.println("Vuelva a usar la radio pronto");
                        break;
                        default:
                            System.out.println("Se apagó la radio");
    
                        break;
                }
            }
                else{
                    System.out.println("\nSe apago la radio.");
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