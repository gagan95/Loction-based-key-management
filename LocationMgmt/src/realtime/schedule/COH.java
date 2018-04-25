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

public class COH extends ApplicationFrame {


    public COH(final String title) {

        super(title);

        final XYDataset dataset = createDataset();
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        setContentPane(chartPanel);
      

    }

   
    private XYDataset createDataset() {
 final XYSeries series1 = new XYSeries("Diff EDF");
        series1.add(2,10);
        series1.add(4,6);
        series1.add(6,8);
        series1.add(8,7);
        series1.add(10,6);
        series1.add(12,5.6);
        series1.add(14,6);
        series1.add(16,8);
        series1.add(18,7);
        series1.add(20,7.6);



//
        final XYSeries series2 = new XYSeries("Hierarchical");
        series2.add(2,6);
        series2.add(4,8);
        series2.add(6,7);
        series2.add(8,5);
        series2.add(10,7);
        series2.add(12,9.2);
        series2.add(14,8.5);
        series2.add(16,8);
        series2.add(18,9);
        series2.add(20,8.6);


        final XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series1);
        dataset.addSeries(series2);
      
      


        return dataset;

    }

    private JFreeChart createChart(final XYDataset dataset) {

        // create the chart...
        final JFreeChart chart = ChartFactory.createXYLineChart(
            "Traffic OverHead",      // chart title
            "Bandwidth(mbps)",// x axis label
            "Traffic Overhead(%)",  // y axis label
            dataset,// data
            PlotOrientation.VERTICAL,
            true,                     
            true,                     
            false                     
        );

        chart.setBackgroundPaint(Color.white);
        
        final XYPlot plot = chart.getXYPlot();
        plot.setBackgroundPaint(Color.lightGray);
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);

        final XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesLinesVisible(0,true);
        renderer.setSeriesShapesVisible(1, true);
        plot.setRenderer(renderer);

        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        rangeAxis.setRange(1,12);//y axis
 

        return chart;

    }

    public static void main(final String[] args) {

        final COH e = new COH("Control OverHead");
        e.pack();
        RefineryUtilities.centerFrameOnScreen(e);
        e.setVisible(true);

    }

}
