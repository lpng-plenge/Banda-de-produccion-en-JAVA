//https://www.jfree.org/jfreechart/api/javadoc/index-all.html
package Clases;
import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


public class GraphicsX {

    public void piston(int entrada1, int entrada2, JPanel Panel) {
        XYSeries serie= new XYSeries("Actividad");
        XYSeriesCollection coleccion = new XYSeriesCollection();
        
        String data1 = "Segundos";
        String data2 = "0-1";
        serie.add(0,0);
        serie.add(entrada1, entrada2);
        coleccion.addSeries(serie);
        
        JFreeChart chart= ChartFactory.createXYLineChart("Piston Activo", data1, data2, coleccion, PlotOrientation.VERTICAL, true, true, false);
           
        Panel.removeAll();
        Panel.repaint();
        Panel.setLayout(new java.awt.BorderLayout());
        Panel.add(new ChartPanel(chart));
        Panel.validate();
    }
    
    public void velocidadBanda(int entrada1, int entrada2, JPanel  Panel){
        XYSeries serie= new XYSeries("Velocidad Banda");
        XYSeriesCollection coleccion = new XYSeriesCollection();
        

        String data1 = "Segundos";
        String data2 = "Hz";
        serie.add(0,0);
        serie.add(entrada1, entrada2);
        coleccion.addSeries(serie);
        
        JFreeChart chart= ChartFactory.createXYLineChart("Velocidad Banda", data1, data2, coleccion, PlotOrientation.VERTICAL, true, true, false);
        chart.setBorderPaint(new Color(21,127,251));
        
        Panel.removeAll();
        Panel.repaint();
        Panel.setLayout(new java.awt.BorderLayout());
        Panel.add(new ChartPanel(chart));
        Panel.validate();
    }

}
