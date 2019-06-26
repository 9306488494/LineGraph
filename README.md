To use the Line graph just follow the following steps:

First Step- Implement dependancy 

	dependencies {
	        implementation 'com.github.9306488494:LineGraph:Tag'
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

LineG.GValue(String val1, String val2, String val3,String val4,String val5, GraphView graphID);
