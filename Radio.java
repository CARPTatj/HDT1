/*
 * @author: Alina CARÍAS (22539), Daniel Machic (22), Marcos Díaz (22)
 * @Date: 16/01/2023
 * Sección: 40
 * Clase case que implementa la interfaz: clase controladora, crea los métodos que se utilizarán en la principal.
 */
public class Radio implements iRadio {

    private String frequence;
    private double FMActualStation;
    private int AMActualStation;
    private int[] slotAM;
    private double[] slotFM;
    private boolean encendido;

    /**
     * Parametros de la clase Radio
     * @param frequence almacena la frecuencia de la radio
     * @param FMActualStation almacena la estacion actual de la emisora FM
     * @param AMActualStation almacena la estacion actual de la emisora AM
     * @param slotAM almacena una emisora AM en un espacio (boton)
     * @param slotFM almacena una emisora FM en un espacio (boton)
     * @param encendido almacena el estado de la radio
     */

     public Radio() {
        frequence = "";
        FMActualStation = 97.9;
        AMActualStation = 540;
        slotAM = new int [12];
        slotFM = new double [12];
        encendido = true;
    }


    public Radio(String frequence, double FMActualStation, int AMActualStation, int[] slotAM, double[] slotFM, boolean encendido) {
        this.frequence = frequence;
        this.FMActualStation = FMActualStation;
        this.AMActualStation = AMActualStation;
        this.slotAM = slotAM;
        this.slotFM = slotFM;
        this.encendido = encendido;
    }

    /** 
     * @return int[]
     */
    public int[] getSlotAM() {
        return this.slotAM;
    }

    
    /** 
     * @param slotAM
     */
    public void setSlotAM(int[] slotAM) {
        this.slotAM = slotAM;
    }

    
    /** 
     * @return double[]
     */
    public double[] getSlotFM() {
        return this.slotFM;
    }

    
    /** 
     * @param slotFM
     */
    public void setSlotFM(double[] slotFM) {
        this.slotFM = slotFM;
    }

    
    /** 
     * @return boolean
     */
    public boolean isEncendido() {
        return this.encendido;
    }

    
    /** 
     * @return boolean
     */
    public boolean getEncendido() {
        return this.encendido;
    }

    
    /** 
     * @param encendido
     */
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    /**
     * Metodos de la interface de iRadio
     */

    public void on() {
        // TODO Auto-generated method stub
        encendido = true;
    }

    public void off() {
        // TODO Auto-generated method stub
        encendido = false;
    }

    /** 
     * @return boolean
     */
    public boolean isOn() {
        // TODO Auto-generated method stub
        return encendido;
    }
    
    /** 
     * @param freq
     */
    public void setFrequence(String freq) {
        // TODO Auto-generated method stub
        if (freq == "AM"){
            freq.equalsIgnoreCase("AM");
            this.frequence = freq.toUpperCase();
        }
        if (freq == "FM"){
            freq.equalsIgnoreCase("FM");
            this.frequence = freq.toUpperCase();
        }
    }

    /** 
    * @return String
    */
    public String getFrequence() {
        // TODO Auto-generated method stub
        return frequence;
    }

    public void Forward() {
        // TODO Auto-generated method stub
        if(frequence == "FM" && FMActualStation == 107.9){
            FMActualStation = 87.9;
        }else if(frequence == "FM" && FMActualStation < 107.9){
            FMActualStation = FMActualStation + 0.2;
        }

        if(frequence == "AM" && AMActualStation == 1610){
            AMActualStation = 530;
        }else if( frequence == "AM" && AMActualStation < 1610){
            AMActualStation = AMActualStation - 10;
        }
    }

    public void Backward() {
        // TODO Auto-generated method stub
        if(frequence == "FM" && FMActualStation == 87.9){
            FMActualStation = 107.9;
        }else if(frequence == "FM" && FMActualStation > 87.9){
            FMActualStation = FMActualStation - 0.2;
        }

        if(frequence == "AM" && AMActualStation == 530){
            AMActualStation = 1610;
        }else if( frequence == "AM" && AMActualStation > 530){
            AMActualStation = AMActualStation - 10;
        }
    }

    /** 
    * @return double
     */
    public double getFMActualStation() {
        // TODO Auto-generated method stub
        return FMActualStation;
    }

    /** 
    * @param actualStation
     */
    public void setFMActualStation(double actualStation) {
        // TODO Auto-generated method stub
        
    }

    /** 
    * @return int
    */
    public int getAMActualStation() {
        // TODO Auto-generated method stub
        return AMActualStation;
    }

    /** 
    * @param actualStation
    */
    public void setAMActualStation(int actualStation) {
        // TODO Auto-generated method stub
    }

    /** 
    * @param actualStation
    * @param slot
    */
    public void saveFMStation(double actualStation, int slot) {
        // TODO Auto-generated method stub
    }

    /** 
    * @param actualStation
    * @param slot
     */
    public void saveAMStation(double actualStation, int slot) {
        // TODO Auto-generated method stub
    }

    /** 
    * @param slot
     * @return double
     */
    public double getDMSlot(int slot) {
        // TODO Auto-generated method stub
        return 23.3;
    }

    /** 
     * @param slot
     * @return int
    */
    public int getAMSlot(int slot) {
        // TODO Auto-generated method stub
        return 3;
    }
    
}