//https://www.jfree.org/jfreechart/api/javadoc/index-all.html
package Clases;
import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;


public class GraphicsX {
    public void createHistogramm(float[] canal, JPanel Panel, Color color){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        String serie = "Canal ";
        String serie2 = "Minutos";
        String serie3 = "Datos";
        
        dataset.addValue(canal[0], serie, ""+0);
        dataset.addValue(canal[1], serie2, ""+0);
        dataset.addValue(canal[2], serie3, ""+0);
        
        JFreeChart chart = ChartFactory.createBarChart3D("Grafica De Radio Frecuencia", null, null, dataset, PlotOrientation.VERTICAL,true, true, false);
        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        
        renderer.setSeriesPaint(0, color);
        chart.setAntiAlias(true);
        chart.setBackgroundPaint(new Color(240,240,240));
           
        Panel.removeAll();
        Panel.repaint();
        Panel.setLayout(new java.awt.BorderLayout());
        Panel.add(new ChartPanel(chart));
        Panel.validate();
        
    }
    
}
