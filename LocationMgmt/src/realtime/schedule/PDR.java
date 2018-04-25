/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package realtime.schedule;

/**
 *
 * @author Nirmalan
 */

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



public class PDR extends ApplicationFrame {

    
    public PDR(final String title) {

        super(title);

        final XYDataset dataset = createDataset();
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        setContentPane(chartPanel);
         

    }

    /**
     * Creates a sample dataset.
     *
     * @return a sample dataset.
     */
    private XYDataset createDataset() {
 final XYSeries series1 = new XYSeries("Diff EDF");
        series1.add(10,65);
        series1.add(20,69);
        series1.add(30,72);
        series1.add(40,74);
        series1.add(50,76);
        series1.add(60,77);
        series1.add(70,71);
        series1.add(80,73);
        series1.add(90,78);
        series1.add(100,81);


//
        final XYSeries series2 = new XYSeries("Hierarchical");
        series2.add(10,70);
        series2.add(20,72);
        series2.add(30,73);
        series2.add(40,71);
        series2.add(50,74);
        series2.add(60,76);
        series2.add(70,81);
        series2.add(80,83);
        series2.add(90,85);
        series2.add(100,84);
 

        final XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series1);
        dataset.addSeries(series2);
      
      


        return dataset;

    }

    private JFreeChart createChart(final XYDataset dataset) {

       
        final JFreeChart chart = ChartFactory.createXYLineChart(
            "PACKET DELIVERY RATIO",      // chart title
            "Time(s)",                      // x axis label
            "PDR(%)",                      // y axis label
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
        rangeAxis.setRange(50,100);//y axis
 

        return chart;

    }

    public static void main(final String[] args) {

        final PDR p = new PDR("PACKET DELIVERY RATIO");
        p.pack();
        RefineryUtilities.centerFrameOnScreen(p);
        p.setVisible(true);

    }

}
