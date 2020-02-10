import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.chart.*;

public class Main extends Application {
	@Override public void start(Stage stage) {
		stage.show(); // ウィンドウを表示
		Group root = new Group(); // Groupを作成
		Scene scene = new Scene(root, 640, 480); // Sceneを作成
		stage.setScene(scene); // Sceneを追加

		NumberAxis xAxis = new NumberAxis(); // X座標の値
		NumberAxis yAxis = new NumberAxis(); // Y座標の値
		xAxis.setLabel("月"); // X軸のラベルを設定

		// 折れ線グラフを作成
		LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
		lineChart.setTitle("年間成績"); // 折れ線グラフのタイトルを設定

		XYChart.Series series = new XYChart.Series(); // データを保存するクラスを作成
		series.setName("勝ち数"); // データの説明

		// データを作成
		int[] data = new int[12];
		data[ 0] = 10;
		data[ 1] = 11;
		data[ 2] = 10;
		data[ 3] = 12;
		data[ 4] =  6;
		data[ 5] =  5;
		data[ 6] =  7;
		data[ 7] = 11;
		data[ 8] =  5;
		data[ 9] = 14;
		data[10] =  8;
		data[11] =  9;

		// Seriesにデータを設定
		for(int i = 0;i < data.length;i++) {
			series.getData().add(new XYChart.Data(i + 1, data[i]));
		}

		root.getChildren().add(lineChart); // Groupに折れ線グラフを追加
		lineChart.getData().add(series); // 折れ線グラフにデータを追加
	}
}
