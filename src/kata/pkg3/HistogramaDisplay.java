/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata.pkg3;

import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author usuario
 */
public class HistogramaDisplay extends ApplicationFrame {

public HistogramaDisplay(){
super("HISTOGRAMA");
setContentPane(createPanel());
pack();
}



private ChartPanel createPanel(){
    ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
    chartPanel.setPreferredSize(new Dimension(500,450));
    return chartPanel;

}

private JFreeChart createChart (DefaultCategoryDataset dataset){
    JFreeChart chart = ChartFactory.createBarChart("Histograma de dominios", "DOMINIOS", "Nº Email", dataset, PlotOrientation.VERTICAL, true, true, false);
    return chart;
}

private DefaultCategoryDataset createDataset(){
    DefaultCategoryDataset dataset =new DefaultCategoryDataset();
    dataset.addValue(10,"ENE","gmail.com");
    dataset.addValue(6,"ENE","ulpgc.es");        
    dataset.addValue(4,"ENE","ull.es");        
    dataset.addValue(9,"ENE","hotmail.com");    
    dataset.addValue(8,"FEB","gmail.com");
    dataset.addValue(4,"FEB","ulpgc.es");        
    dataset.addValue(2,"FEB","ull.es");        
    dataset.addValue(10,"FEB","hotmail.com");    
    dataset.addValue(3,"MAR","gmail.com");
    dataset.addValue(5,"MAR","ulpgc.es");        
    dataset.addValue(8,"MAR","ull.es");        
    dataset.addValue(10,"MAR","hotmail.com");  
    return dataset;
}

public void execute(){
    setVisible(true);
}
}

