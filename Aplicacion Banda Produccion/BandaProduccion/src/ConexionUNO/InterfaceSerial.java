package ConexionUNO;

import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Enumeration;

public class InterfaceSerial implements SerialPortEventListener {

    public SerialPort serialPort;
    String[] tempData = new String[3];
    public static final String PORT_NAMES[] = {"COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9"};
    public static BufferedReader input;
    public static OutputStream output;

    public static int TIME_OUT = 1;
    public static final int DATA_RATE = 9600;

    public void initialize() {
//        Encontrar Puertos
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
//            revisar funcionalidad
            serialPort = (SerialPort) port.open(this.getClass().getName(), TIME_OUT);
            serialPort.setSerialPortParams(DATA_RATE, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);

            input = new BufferedReader(new InputStreamReader(serialPort.getInputStream()));
            output = serialPort.getOutputStream();

            serialPort.addEventListener(this);
            serialPort.notifyOnDataAvailable(true);
        } catch (Exception exception) {

        }

    }

    @Override
    public synchronized void serialEvent(SerialPortEvent spe) {
        try {
            String lineaEntrada1 = input.readLine();
            String lineaEntrada2 = input.readLine();
            String lineaEntrada3 = input.readLine();

            tempData[0] = lineaEntrada1;
            tempData[1] = lineaEntrada2;
            tempData[2] = lineaEntrada3;
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    public String[] getDataInput() {
        return tempData;
    }
    
    public synchronized void Close(){
        if(serialPort != null){
        serialPort.removeEventListener();
        serialPort.close();
    }
        
    }
}
