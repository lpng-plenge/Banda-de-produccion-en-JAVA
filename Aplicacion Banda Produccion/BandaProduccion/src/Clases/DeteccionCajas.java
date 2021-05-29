package Clases;

import BandaProduccion.ControlProduccion;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.videoio.VideoCapture;

public class DeteccionCajas implements Runnable {

    //variables globales
    double negro = 0, blanco = 0, total = 0,rango=80;//defectuoso 
    private double [] value = new double[2];
    // Harscascade
    public static String sources = "D:\\Usuarios\\Luis Pablo Personal y Creativo\\Documentos\\GitHub\\JAVA-Banda-Produccion\\haarcascades\\cascade.xml"; //fotografias xml
    CascadeClassifier faceDetector = new CascadeClassifier(sources);

    @Override
    public void run() {
        VideoCapture capture = new VideoCapture(1);
        capture.open(0);

        MatOfRect rostros = new MatOfRect();
        MatOfByte mem = new MatOfByte();

        Mat frame = new Mat();
        Mat frame_gray = new Mat();
        //Mat RCI =null;
        Rect[] facesArray;
        Graphics g;
        BufferedImage buff = null;
        while (capture.read(frame) && ControlProduccion._activarVideo) {
            if (frame.empty()) {
                System.out.println("No hay Conexion con la camara");
                break;
            } else {
                try {
                    //almacenar valores
                    double valores[] = new double[3];
                    //Saturacion
                    long Umbral = 5000000;
                    int[] color = new int[2];
                    color[0] = new Color(255, 255, 255).getRGB();
                    color[1] = new Color(0, 0, 0).getRGB();
                    
                    //Procesos de reconocimiento
                    g = ControlProduccion.jPanelVideo.getGraphics();
                    Imgproc.cvtColor(frame, frame_gray, Imgproc.COLOR_BGR2GRAY);
                    Imgproc.equalizeHist(frame_gray, frame_gray);

                    faceDetector.detectMultiScale(frame_gray, rostros,
//                            1.1,
//                            2,
                            5,
                            91,
                            0 ,
                            new Size(100, 100)
                    );
                    facesArray = rostros.toArray();
                    //System.out.println("Numero de rostros" + facesArray.length);
                    valores[0]=facesArray.length;
                    //detector
                    for (int i = 0; i < facesArray.length; i++) {
                        Point centerPoint = new Point(
                                (facesArray[i].x + facesArray[i].width * 0.5),
                                (facesArray[i].y + facesArray[i].height * 0.5)
                        );
                        Imgproc.ellipse(frame,
                                centerPoint,
                                new Size(facesArray[i].width * 0.5, facesArray[i].height * 0.5),
                                0,
                                0,
                                360,
                                new Scalar(255, 255, 255),
                                4,
                                8,
                                0
                        );
                        Mat faceROIMat = frame_gray.submat(facesArray[i]);
                        Imgproc.putText(frame,
                                "Ancho: " + faceROIMat.width() + "Alto: " + faceROIMat.height() + "x= " + facesArray[i].x + "y= " + facesArray[i].y,
                                new Point(facesArray[i].x, facesArray[i].y - 20),
                                1,
                                1,
                                new Scalar(255, 255, 255)
                        );
                    }
                    int no = facesArray.length;
                    //Mandar al label si se identifica
                    ControlProduccion.txtNumeroEncontradas.setText(String.valueOf(no));

                    Imgcodecs.imencode(".jpg", frame, mem);
                    Image img;

                    img = ImageIO.read(new ByteArrayInputStream(mem.toArray()));
                    buff = (BufferedImage) img;
                    //cambio de color de la imagen
                    for (int i = 0; i < buff.getWidth(); i++) {
                        for (int j = 0; j < buff.getHeight(); j++) {
                            if (buff.getRGB(i, j) < -Umbral * 2) {
                                //dar un cero
                                buff.setRGB(i, j, color[0]);
                                //activar el piston
                                blanco++;
                            } else {
                                buff.setRGB(i, j, color[1]);
                                negro++;
                            }
                            total = negro + blanco;
                            valores[1]= porcentaje(total, negro);
                        }
                    }
                    setValores(valores);
                    if (ControlProduccion._cambioPestana) {
                        ControlProduccion.jPanelVideo.removeAll();
                    } else {
                        //renderizado
                        g.drawImage(buff, 0, 0, ControlProduccion.jPanelVideo.getWidth(), ControlProduccion.jPanelVideo.getHeight(), 0, 0, buff.getWidth(), buff.getHeight(), null);
                    }
                    
                } catch (IOException ex) {
                    //Logger.getLogger(DaemonThread.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
        if (!ControlProduccion._activarVideo) {
            capture.release();
            ControlProduccion.jPanelVideo.removeAll();
            ControlProduccion.txtNumeroEncontradas.setText("");
            ControlProduccion.txtPorcentaje.setText("");
        }
    }

    public double porcentaje(double total, double negro) {
        double porcentaje = (negro / total) * 100;
        double pfinal = Math.round(porcentaje * 1000) / 1000;
        ControlProduccion.txtPorcentaje.setText(String.valueOf(pfinal));
        
        return pfinal;
    }
    public void setValores(double[] value){
        this.value = value;
    }
    public double[] getValores(){
        return value;
    }
    
}
