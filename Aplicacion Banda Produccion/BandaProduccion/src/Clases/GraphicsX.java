//https://www.jfree.org/jfreechart/api/javadoc/index-all.html
package Clases;
import java.awt.BasicStroke;
import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.renderer.xy.XYStepRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


public class GraphicsX {

    public void piston(int[] entrada1, JPanel Panel) {
        XYSeries serie= new XYSeries("Actividad");
        XYSeriesCollection coleccion = new XYSeriesCollection();
        
        String data1 = "Segundos";
        String data2 = "Defectuosos";
        
        serie.add(0,0);
        serie.add(entrada1[0], entrada1[1]);
        coleccion.addSeries(serie);
        
        JFreeChart chart= ChartFactory.createXYLineChart("Piston Activo", data1, data2, coleccion, PlotOrientation.VERTICAL, true, true, false);
        
        XYPlot plot = chart.getXYPlot();
        XYLineAndShapeRenderer renderer = new XYStepRenderer();
        renderer.setSeriesPaint(0, Color.RED);
        renderer.setSeriesStroke(0, new BasicStroke(4.0f));
        plot.setRenderer(renderer);
        
        Panel.removeAll();
        Panel.repaint();
        Panel.setLayout(new java.awt.BorderLayout());
        Panel.add(new ChartPanel(chart));
        Panel.validate();
    }
    
    public void velocidadBanda(int[] Canal, JPanel  Panel){
        
        XYSeries serie= new XYSeries("Velocidad Banda");
        XYSeriesCollection coleccion = new XYSeriesCollection();
        

        String data1 = "Segundos";
        String data2 = "Revoluciones";
        
        serie.add(0,0);
        serie.addOrUpdate(Canal[0], Canal[1]);
        coleccion.addSeries(serie);
        
        JFreeChart chart= ChartFactory.createXYLineChart("Velocidad Banda", data1, data2, coleccion, PlotOrientation.VERTICAL, true, true, false);
        
        XYPlot plot = chart.getXYPlot();
        XYLineAndShapeRenderer renderer = new XYStepRenderer();
        renderer.setSeriesPaint(0, Color.BLUE);
        renderer.setSeriesStroke(0, new BasicStroke(4.0f));
        plot.setRenderer(renderer);
        
        Panel.removeAll();
        Panel.repaint();
        Panel.setLayout(new java.awt.BorderLayout());
        Panel.add(new ChartPanel(chart));
        Panel.validate();
    }

}
