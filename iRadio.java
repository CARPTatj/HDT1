/*
 * @author: Alina CARÍAS (22539), Daniel Machic (22), Marcos Díaz (22)
 * @Date: 16/01/2023
 * Sección: 40
 * Clase interfaz: contiene todos los métodos que usará la radio
 */
public interface iRadio{
    public void on();
    public void off();
    public boolean isOn();
    public void setFrequence(String freq) throws Exception;
    public String getFrequence();
    public void Forward();
    public void Backward();
    public double getFMActualStation();
    public void setFMActualStation(double actualStation);
    public int getAMActualStation();
    public void setAMActualStation(int actualStation);
    public void saveFMStation(double actualStation, int slot);
    public void saveAMStation(int actualStation, int slot);
    public double getFMSlot(int slot);
    public int getAMSlot(int slot);
}