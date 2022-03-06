package ConexionUNO;

import com.panamahitek.ArduinoException;
import com.panamahitek.PanamaHitek_Arduino;
import gnu.io.SerialPort;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jssc.SerialPortException;

public class ConexionSerial {

    PanamaHitek_Arduino ino = new PanamaHitek_Arduino();

    public SerialPort serialPort;
    public static final int DATA_RATE = 9600;

    public void initialize() {
        int i=0;
        List<String> dato;
        String puertos="";
        try {
            if(ino.isMessageAvailable()){
                
                dato=ino.getSerialPorts();
                puertos=dato.get(i);
            }
        } catch (SerialPortException ex) {
            
        } catch (ArduinoException ex) {
        }
        
        try {
            ino.arduinoTX(puertos, DATA_RATE);
            System.out.println("conectado");
        } catch (ArduinoException ex) {
        }


    }

    public void serialStop() {
        try {
            ino.sendData("0");
        } catch (ArduinoException | SerialPortException ex) {
        }
    }

    public void serialIn() {
        try {
            ino.sendData("1");
        } catch (ArduinoException | SerialPortException ex) {
        }
    }

    public void serialSucces() {
        try {
            ino.sendData("2");
        } catch (ArduinoException | SerialPortException ex) {
        }
    }

    public void serialDefectuoso() {
        try {
            ino.sendData("3");
        } catch (ArduinoException | SerialPortException ex) {
        }
    }

    public void serialStart() {
        try {
            ino.sendData("4");
        } catch (ArduinoException | SerialPortException ex) {
        }
    }

    public void arduinoConection() {
        try {
            ino.killArduinoConnection();
        } catch (ArduinoException ex) {
            Logger.getLogger(ConexionSerial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
