
package ConexionUNO;

import com.panamahitek.ArduinoException;
import com.panamahitek.PanamaHitek_Arduino;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEventListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Enumeration;
import jssc.SerialPortException;


public class ConexionSerial implements SerialPortEventListener{
    PanamaHitek_Arduino ino = new PanamaHitek_Arduino();

    String[] tempData = new String[10];
    public SerialPort serialPort;
    public static final String PORT_NAMES[] = {"COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9"};
    public static BufferedReader input;
    public static OutputStream output;

    public static int TIME_OUT = 1;
    public static final int DATA_RATE = 9600;

    public void initialize() {
        //Encontrar Puertos
        CommPortIdentifier port = null;
        Enumeration<?> e = CommPortIdentifier.getPortIdentifiers();
        while (e.hasMoreElements()) {
            CommPortIdentifier cuPortIdentifier = (CommPortIdentifier) e.nextElement();
            for (String portName : PORT_NAMES) {
                if (cuPortIdentifier.getName().equals(portName)) {
                    port = cuPortIdentifier;
                    break;
                }
            }

        }
        if (port == null) {
            System.err.println("No se encontro ningun puerto");
            return;
        }
        try {
            //revisar funcionalidad
//            serialPort = (SerialPort) port.open(this.getClass().getName(), TIME_OUT);
//            serialPort.setSerialPortParams(DATA_RATE, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
//
//            input = new BufferedReader(new InputStreamReader(serialPort.getInputStream()));
//            output = serialPort.getOutputStream();
            ino.arduinoTX("COM6", DATA_RATE);
//
//            serialPort.addEventListener(this);
//            serialPort.notifyOnDataAvailable(true);
        } catch (Exception exception) {

        }

    }

    public synchronized void serialEvent(gnu.io.SerialPortEvent spe) {
        try {
            String velocidad = input.readLine();
            String piston = input.readLine();
            
            tempData[0] = velocidad;
            tempData[1] = velocidad;
            tempData[2] = velocidad;
                       
        } catch (Exception e) {
            System.err.println(e.toString());
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
    
    public String[] getDataInput() {
        return tempData;
    }

    public synchronized void Close(){
        if (serialPort != null) {
            serialPort.removeEventListener();
            serialPort.close();
        }
    }
    
    
}
