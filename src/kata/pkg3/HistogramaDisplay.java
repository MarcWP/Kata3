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

    private final Histogram<String> histo;

    public HistogramaDisplay(Histogram<String> histo) {
        super("HISTOGRAMA");
        this.histo = histo;
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
        for(String key : histo.keySet()){
            dataset.addValue(histo.get(key),"",key);
        }
        return dataset;

    }

    public void execute(){
        setVisible(true);
    }
    }

