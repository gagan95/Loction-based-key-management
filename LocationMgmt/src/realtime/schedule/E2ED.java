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
//import org.jfree.ui.Spacer;


public class E2ED extends ApplicationFrame {

    
    public E2ED(final String title) {

        super(title);

        final XYDataset dataset = createDataset();
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        setContentPane(chartPanel);
         

    }

   
    private XYDataset createDataset() {
 final XYSeries series1 = new XYSeries("Diff EDF");
          series1.add(10,12);
        series1.add(20,15);
        series1.add(30,22);
        series1.add(40,28);
        series1.add(50,26);
        series1.add(60,30);
        series1.add(70,33);
        series1.add(80,35);
        series1.add(90,43);
        series1.add(100,46);


//
        final XYSeries series2 = new XYSeries("Hierarchical");
        series2.add(10,17);
        series2.add(20,22);
        series2.add(30,24);
        series2.add(40,26);
        series2.add(50,31);
        series2.add(60,37);
        series2.add(70,39);
        series2.add(80,43);
        series2.add(90,48);
        series2.add(100,51);


        final XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series1);
        dataset.addSeries(series2);
      
      


        return dataset;

    }

    private JFreeChart createChart(final XYDataset dataset) {

        // create the chart...
        final JFreeChart chart = ChartFactory.createXYLineChart(
            "AVERAGE END To END DELAY",      // chart title
            "Traffic loads(Packet Flow)",                      // x axis label
            "Delay in Time(ms)",                      // y axis label
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
        rangeAxis.setRange(5,60);//y axis
 

        return chart;

    }

    public static void main(final String[] args) {

        final E2ED e = new E2ED("AVERAGE END To END DELAY(ms)");
        e.pack();
        RefineryUtilities.centerFrameOnScreen(e);
        e.setVisible(true);

    }

}
