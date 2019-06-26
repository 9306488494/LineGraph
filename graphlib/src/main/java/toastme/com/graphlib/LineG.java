package toastme.com.graphlib;

import android.content.Context;
import android.graphics.Color;
import android.view.View;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.ValueDependentColor;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

/**
 * Created by Yeshveer on 6/26/2019.
 */

public class LineG {
    public static void GValue(String val1, String val2, String val3,String val4,String val5, GraphView graphID) {


        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{
                new DataPoint(0, Double.parseDouble(val1)),
                new DataPoint(1, Double.parseDouble(val2)),
                new DataPoint(2, Double.parseDouble(val3)),
                new DataPoint(3, Double.parseDouble(val4)),
                new DataPoint(4, Double.parseDouble(val5))
        });
        graphID.addSeries(series);
    }
    // draw bar graph
    public static void BarGraph(String val1, String val2, String val3,String val4,String val5, GraphView graphID,String spacing,String topColor) {

        BarGraphSeries<DataPoint> series = new BarGraphSeries<>(new DataPoint[]{
                new DataPoint(0,Double.parseDouble(val1)),
                new DataPoint(1,Double.parseDouble(val2)),
                new DataPoint(2,Double.parseDouble(val3)),
                new DataPoint(3,Double.parseDouble(val4)),
                new DataPoint(4,Double.parseDouble(val5))
        });
        graphID.addSeries(series);

// styling
        series.setValueDependentColor(new ValueDependentColor<DataPoint>() {
            @Override
            public int get(DataPoint data) {
                return Color.rgb((int) data.getX() * 255 / 4, (int) Math.abs(data.getY() * 255 / 6), 100);
            }
        });

        series.setSpacing(Integer.parseInt(spacing));

// draw values on top
        series.setDrawValuesOnTop(true);
        series.setValuesOnTopColor(Integer.parseInt("Color"+"."+topColor));
//series.setValuesOnTopSize(50);
    }



}
