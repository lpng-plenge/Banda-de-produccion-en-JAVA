
package ConexionUNO;

import com.panamahitek.ArduinoException;
import com.panamahitek.PanamaHitek_Arduino;
import gnu.io.SerialPort;
import java.util.logging.Level;
import java.util.logging.Logger;
import jssc.SerialPortException;


public class ConexionSerial {
    PanamaHitek_Arduino ino = new PanamaHitek_Arduino();

    public SerialPort serialPort;
    public static final String PORT_NAMES[] = {"COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9"};
    public static final int DATA_RATE = 9600;
    
    public void initialize() {
        
        try {
            ino.arduinoTX(PORT_NAMES[4], DATA_RATE);
        } catch (ArduinoException ex) {
            Logger.getLogger(ConexionSerial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void serialStop(){
        try {
            ino.sendData("0");
        } catch (ArduinoException|SerialPortException ex) {
        }
    }
    
    public void serialStart(){
        try {
            ino.sendData("1");
        } catch (ArduinoException|SerialPortException ex) {
        }
    }
    public void serialSucces(){
        try {
            ino.sendData("2");
        } catch (ArduinoException | SerialPortException ex) {
        }
    }
    public void serialChecking(){
        try {
            ino.sendData("3");
        } catch (ArduinoException | SerialPortException ex) {
        }
    }
    public void arduinoConection(){
        try {
            ino.killArduinoConnection();
        } catch (ArduinoException ex) {
            Logger.getLogger(ConexionSerial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
