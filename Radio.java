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

    public int[] getSlotAM() {
        return this.slotAM;
    }

    public void setSlotAM(int[] slotAM) {
        this.slotAM = slotAM;
    }

    public double[] getSlotFM() {
        return this.slotFM;
    }

    public void setSlotFM(double[] slotFM) {
        this.slotFM = slotFM;
    }

    public boolean isEncendido() {
        return this.encendido;
    }

    public boolean getEncendido() {
        return this.encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }


    public Radio() {
        frequence = "AM";
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


    public void on() {
        // TODO Auto-generated method stub
        this.encendido = true;
    }

    public void off() {
        // TODO Auto-generated method stub
        this.encendido = false;
    }

    public boolean isOn() {
        // TODO Auto-generated method stub
        return encendido;
    }
    public void setFrequence(String freq) {
        // TODO Auto-generated method stub
    }

    public String getFrequence() {
        // TODO Auto-generated method stub
        return "";
    }

    public void Forward() {
        // TODO Auto-generated method stub
    }

    public void Backward() {
        // TODO Auto-generated method stub
    }

    public double getFMActualStation() {
        // TODO Auto-generated method stub
        return 23.3;
    }

    public void setFMActualStation(double actualStation) {
        // TODO Auto-generated method stub
    }

    public int getAMActualStation() {
        // TODO Auto-generated method stub
        return 2;
    }

    public void setAMActualStation(int actualStation) {
        // TODO Auto-generated method stub
    }

    public void saveFMStation(double actualStation, int slot) {
        // TODO Auto-generated method stub
    }

    public void saveAMStation(double actualStation, int slot) {
        // TODO Auto-generated method stub
    }

    public double getDMSlot(int slot) {
        // TODO Auto-generated method stub
        return 23.3;
    }

    public int getAMSlot(int slot) {
        // TODO Auto-generated method stub
        return 3;
    }
    
}