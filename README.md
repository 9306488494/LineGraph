To use the Line graph just follow the following steps:

First Step- Implement dependancy 

	dependencies {
	        implementation 'com.github.9306488494:LineGraph:0.1.1'
	}

Second Step :Implement Maven repository

allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

Third Step : Implement Layout

   <com.jjoe64.graphview.GraphView
        android:layout_width="match_parent"
        android:layout_height="200dip"
        android:id="@+id/graph" />

Forth step : use the method 
// for Line Graph
LineG.GValue(val1,val2,val3,val4,val5,graphViewID);
// For Bar Graph
LineG.BarGraph(val1,val2,val3,val4,val5,graphViewid,spacing_betwen_graph,top_color_as_RED);

so programe will be ;


public class Map extends AppCompatActivity {
    String val1,val2,val3,val4,val5;
    private GraphView graph;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        graph = (GraphView) findViewById(R.id.graph);

        val1="5";
        val2="2";
        val3="4";
        val4="2";
        val5="10";


        LineG.GValue(val1, val2, val3,val4,val5, graph);


    }
}

