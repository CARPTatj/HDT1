/*
 * @author: Alina CARÍAS (22539), Daniel Machic (22), Marcos Díaz (221102)
 * @Date: 16/01/2023
 * Sección: 40
 * Clase interfaz: contiene todos los métodos que usará la radio
 */
public interface iRadio{
    /**
	 * Este metodo enciende la radio
	 */
    public void on();

    /**
	 * Este metodo apaga la radio
	 */
    public void off();

    /***
	 * Este metodo nos indica si la radio esta encendida o apagada
	 * @return true si la radio esta encendida y false cuando la radio este apagada
	 */
    public boolean isOn();

    /***
	 * Este metodo nos ayuda a establecer la frecuencia, recibe un parametro llamado freq que puede "AM" o "FM"
	 * @param freq La frecuencia la cual puede ser AM o FM, de lo contrario error.
	 */
    public void setFrequence(String freq) throws Exception;

    /**
	 * Este metodo obtiene una frecuencia
	 * @return una frecuencia AM o FM
	 */
    public String getFrequence();

    /**
	 * Este metodo avanza en el dial de las emisoras
	 */
    public void Forward();

    /**
	 * Este metodo retrocede en el dial de las emisoras
	 */
    public void Backward();

    /**
	 * Este metodo obtiene la estacion FM actual
	 */
    public double getFMActualStation();

    /**
	 * Este metodo establece una estacion FM
	 * @param actualStation
	 */
    public void setFMActualStation(double actualStation);

    /**
	 * Este metodo obtiene la estacion AM actual
	 */
    public int getAMActualStation();

    /**
	 * Este metodo establece una estacion AM
	 * @param actualStation
	 */
    public void setAMActualStation(int actualStation);

    /**
	 * Este metodo guarda una estacion FM en un boton
	 * @param actualStation
	 * @param slot
	 */
    public void saveFMStation(double actualStation, int slot);


    /**
	 * Este metodo guarda una estacion AM en un boton
	 * @param actualStation
	 * @param slot
	 */
    public void saveAMStation(double actualStation, int slot);


    /**
	 * Este metodo establece una estacion FM guardada en un boton
	 * @param slot
	 */
    public double getFMSlot(int slot);

    /**
	 * Este metodo establece una estacion AM guardada en un boton
	 * @param slot
	 */
    public int getAMSlot(int slot);
}