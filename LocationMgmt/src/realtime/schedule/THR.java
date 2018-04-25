/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package realtime.schedule;

import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author Nirmalan
 */
public class THR extends ApplicationFrame {
   
    public THR(final String title) {

        super(title);

        final XYDataset dataset = createDataset();
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        setContentPane(chartPanel);
         

    }

    
    private XYDataset createDataset() {
        final XYSeries series1 = new XYSeries("Diff EDF");
        series1.add(10,1.5);
        series1.add(20,1.9);
        series1.add(30,2.5);
        series1.add(40,2.8);
        series1.add(50,3.3);
        series1.add(60,3.7);
        series1.add(70,4.7);
        series1.add(80,5.4);
        series1.add(90,6.7);
        series1.add(100,7.8);


//
        final XYSeries series2 = new XYSeries("Hierarchical");
        series2.add(10,1.8);
        series2.add(20,2.3);
        series2.add(30,2.9);
        series2.add(40,3.7);
        series2.add(50,4.8);
        series2.add(60,5.7);
        series2.add(70,6.4);
        series2.add(80,7.1);
        series2.add(90,8.2);
        series2.add(100,8.7);
 

        final XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series1);
        dataset.addSeries(series2);
        
        return dataset;

    }

    private JFreeChart createChart(final XYDataset dataset) {

        // create the chart...
        final JFreeChart chart = ChartFactory.createXYLineChart(
            "THROUGHPUT",      // chart title
            "Number of Nodes", // x axis label
            "Packet(mbps)",    // y axis label
            dataset,                  // data
            PlotOrientation.VERTICAL,
            true,                     
            true,                     
            false                     
        );

        chart.setBackgroundPaint(Color.white);
        
        final XYPlot plot = chart.getXYPlot();
        plot.setBackgroundPaint(Color.lightGray);
    //    plot.setAxisOffset(new Spacer(Spacer.ABSOLUTE, 5.0, 5.0, 5.0, 5.0));
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);

        final XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesLinesVisible(0,true);
        renderer.setSeriesShapesVisible(1, true);
        plot.setRenderer(renderer);

        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
//        rangeAxis.setRange(1000,9000);//y axis
 

        return chart;

    }

    public static void main(final String[] args) {

        final THR g1 = new THR("THROUGHPUT");
        g1.pack();
        RefineryUtilities.centerFrameOnScreen(g1);
        g1.setVisible(true);

    }
    
}
