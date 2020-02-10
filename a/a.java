/**
 * 折れ線グラフの作成(createLineChartメソッド)
 */
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.plot.PlotOrientation;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import org.jfree.chart.ChartPanel;

public class Test1_1 extends JFrame{
  public static void main(String[] args) {
    Test1_1 frame = new Test1_1();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 500, 500);
    frame.setTitle("グラフサンプル");
    frame.setVisible(true);
  }

  Test1_1(){
    DefaultCategoryDataset data = new DefaultCategoryDataset();
    JFreeChart chart =
      ChartFactory.createLineChart("輸入量",
                                   "年度",
                                   "トン(t)",
                                   data,
                                   PlotOrientation.VERTICAL,
                                   true,
                                   false,
                                   false);

    ChartPanel cpanel = new ChartPanel(chart);
    getContentPane().add(cpanel, BorderLayout.CENTER);
  }
}
