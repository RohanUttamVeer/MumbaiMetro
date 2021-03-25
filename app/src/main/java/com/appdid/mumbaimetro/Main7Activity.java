package com.appdid.mumbaimetro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Main7Activity extends AppCompatActivity {

    TextView textResult;
    Spinner spinnerSource;
    Spinner spinnerDestination;

    String source;
    String destination;
    int cost = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        setTitle("Single Journey");
        // Views
        textResult = (TextView) findViewById(R.id.res);
        spinnerSource = (Spinner) findViewById(R.id.spinne_source);
        spinnerDestination = (Spinner) findViewById(R.id.spinner_destination);

        // Spinner Drop down elements
        List<String> locations = new ArrayList<String>();
        locations.add("VERSOVA");
        locations.add("D.N. NAGAR");
        locations.add("AZAD NAGAR");
        locations.add("ANDHERI");
        locations.add("WESTERN EXPRESS HIGHWAY");
        locations.add("CHAKALA (J.B. NAGAR)");
        locations.add("AIRPORT ROAD");
        locations.add("MAROL NAKA");
        locations.add("SAKI NAKA");
        locations.add("ASALPHA");
        locations.add("JAGRUTI NAGAR");
        locations.add("GHATKOPAR");


        // Initialize
        source = locations.get(0);
        destination = locations.get(0);

        // Creating adapter for spinner
        ArrayAdapter<String> adapterSpinnerSource = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, locations);
        ArrayAdapter<String> adapterSpinnerDestination = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, locations);

        // attaching data adapter to spinners
        spinnerSource.setAdapter(adapterSpinnerSource);
        spinnerDestination.setAdapter(adapterSpinnerDestination);

        // Spinner item select listener
        spinnerSource.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                // Source location
                source = parent.getItemAtPosition(position).toString();

                calculateCost();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinnerDestination.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                // Destination location
                destination = parent.getItemAtPosition(position).toString();

                calculateCost();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void calculateCost() {

        if ((source.equals("VERSOVA") && destination.equals("VERSOVA"))
                || (source.equals("D.N. NAGAR") && destination.equals("D.N. NAGAR"))) {

            cost = 0;
        }else if ((source.equals("AZAD NAGAR") && destination.equals("AZAD NAGAR"))
                || (source.equals("ANDHERI") && destination.equals("ANDHERI"))) {

            cost = 0;

        }else if ((source.equals("WESTERN EXPRESS HIGHWAY") && destination.equals("WESTERN EXPRESS HIGHWAY"))
                || (source.equals("CHAKALA (J.B. NAGAR)") && destination.equals("CHAKALA (J.B. NAGAR)"))) {

            cost = 0;

        }else if ((source.equals("AIRPORT ROAD") && destination.equals("AIRPORT ROAD"))
                || (source.equals("MAROL NAKA") && destination.equals("MAROL NAKA"))) {

            cost = 0;

        }else if ((source.equals("SAKI NAKA") && destination.equals("SAKI NAKA"))
                || (source.equals("ASALPHA") && destination.equals("ASALPHA"))) {

            cost = 0;

        }else if ((source.equals("JAGRUTI NAGAR") && destination.equals("JAGRUTI NAGAR"))
                || (source.equals("GHATKOPAR") && destination.equals("GHATKOPAR"))) {

            cost = 0;
//1
        }else if ((source.equals("VERSOVA") && destination.equals("D.N. NAGAR"))
                || (source.equals("D.N. NAGAR") && destination.equals("VERSOVA"))) {


            cost = 10;
            //2
        }else if ((source.equals("VERSOVA") && destination.equals("AZAD NAGAR"))
                || (source.equals("AZAD NAGAR") && destination.equals("VERSOVA"))) {

            cost = 20;
            //3
        }else if ((source.equals("VERSOVA") && destination.equals("ANDHERI"))
                || (source.equals("ANDHERI") && destination.equals("VERSOVA"))) {

            cost = 20;
            //4
        }else if ((source.equals("VERSOVA") && destination.equals("WESTERN EXPRESS HIGHWAY"))
                || (source.equals("WESTERN EXPRESS HIGHWAY") && destination.equals("VERSOVA"))) {

            cost = 20;
//5
        }else if ((source.equals("VERSOVA") && destination.equals("CHAKALA (J.B. NAGAR)"))
                || (source.equals("CHAKALA (J.B. NAGAR)") && destination.equals("VERSOVA"))) {

            cost = 30;
//6

        }else if ((source.equals("VERSOVA") && destination.equals("AIRPORT ROAD"))
                || (source.equals("AIRPORT ROAD") && destination.equals("VERSOVA"))) {

            cost = 30;
//7
        }else if ((source.equals("VERSOVA") && destination.equals("MAROL NAKA"))
                || (source.equals("MAROL NAKA") && destination.equals("VERSOVA"))) {

            cost = 30;
//8
        }else if ((source.equals("VERSOVA") && destination.equals("SAKI NAKA"))
                || (source.equals("SAKI NAKA") && destination.equals("VERSOVA"))) {

            cost = 30;
//9
        }else if ((source.equals("VERSOVA") && destination.equals("ASALPHA"))
                || (source.equals("ASALPHA") && destination.equals("VERSOVA"))) {

            cost = 40;
//10
        }else if ((source.equals("VERSOVA") && destination.equals("JAGRUTI NAGAR"))
                || (source.equals("JAGRUTI NAGAR") && destination.equals("VERSOVA"))) {

            cost = 40;
//11
        }else if ((source.equals("VERSOVA") && destination.equals("GHATKOPAR"))
                || (source.equals("GHATKOPAR") && destination.equals("VERSOVA"))) {

            cost = 40;

            //2
        }else if ((source.equals("D.N. NAGAR") && destination.equals("AZAD NAGAR"))
                || (source.equals("AZAD NAGAR") && destination.equals("D.N. NAGAR"))) {

            cost = 10;
            //3
        }else if ((source.equals("D.N. NAGAR") && destination.equals("ANDHERI"))
                || (source.equals("ANDHERI") && destination.equals("D.N. NAGAR"))) {

            cost = 20;
            //4
        }else if ((source.equals("D.N. NAGAR") && destination.equals("WESTERN EXPRESS HIGHWAY"))
                || (source.equals("WESTERN EXPRESS HIGHWAY") && destination.equals("D.N. NAGAR"))) {

            cost = 20;
//5
        }else if ((source.equals("D.N. NAGAR") && destination.equals("CHAKALA (J.B. NAGAR)"))
                || (source.equals("CHAKALA (J.B. NAGAR)") && destination.equals("D.N. NAGAR"))) {

            cost = 20;
//6

        }else if ((source.equals("D.N. NAGAR") && destination.equals("AIRPORT ROAD"))
                || (source.equals("AIRPORT ROAD") && destination.equals("D.N. NAGAR"))) {

            cost = 30;
//7
        }else if ((source.equals("D.N. NAGAR") && destination.equals("MAROL NAKA"))
                || (source.equals("MAROL NAKA") && destination.equals("D.N. NAGAR"))) {

            cost = 30;
//8
        }else if ((source.equals("D.N. NAGAR") && destination.equals("SAKI NAKA"))
                || (source.equals("SAKI NAKA") && destination.equals("D.N. NAGAR"))) {

            cost = 30;
//9
        }else if ((source.equals("D.N. NAGAR") && destination.equals("ASALPHA"))
                || (source.equals("ASALPHA") && destination.equals("D.N. NAGAR"))) {

            cost = 30;
//10
        }else if ((source.equals("D.N. NAGAR") && destination.equals("JAGRUTI NAGAR"))
                || (source.equals("JAGRUTI NAGAR") && destination.equals("D.N. NAGAR"))) {

            cost = 40;
//11
        }else if ((source.equals("D.N. NAGAR") && destination.equals("GHATKOPAR"))
                || (source.equals("GHATKOPAR") && destination.equals("D.N. NAGAR"))) {

            cost = 40;

            //3
        }else if ((source.equals("AZAD NAGAR") && destination.equals("ANDHERI"))
                || (source.equals("ANDHERI") && destination.equals("AZAD NAGAR"))) {

            cost = 10;
            //4
        }else if ((source.equals("AZAD NAGAR") && destination.equals("WESTERN EXPRESS HIGHWAY"))
                || (source.equals("WESTERN EXPRESS HIGHWAY") && destination.equals("AZAD NAGAR"))) {

            cost = 20;
//5
        }else if ((source.equals("AZAD NAGAR") && destination.equals("CHAKALA (J.B. NAGAR)"))
                || (source.equals("CHAKALA (J.B. NAGAR)") && destination.equals("AZAD NAGAR"))) {

            cost = 20;
//6

        }else if ((source.equals("AZAD NAGAR") && destination.equals("AIRPORT ROAD"))
                || (source.equals("AIRPORT ROAD") && destination.equals("AZAD NAGAR"))) {

            cost = 20;
//7
        }else if ((source.equals("AZAD NAGAR") && destination.equals("MAROL NAKA"))
                || (source.equals("MAROL NAKA") && destination.equals("AZAD NAGAR"))) {

            cost = 20;
//8
        }else if ((source.equals("AZAD NAGAR") && destination.equals("SAKI NAKA"))
                || (source.equals("SAKI NAKA") && destination.equals("AZAD NAGAR"))) {

            cost = 30;
//9
        }else if ((source.equals("AZAD NAGAR") && destination.equals("ASALPHA"))
                || (source.equals("ASALPHA") && destination.equals("AZAD NAGAR"))) {

            cost = 30;
//10
        }else if ((source.equals("AZAD NAGAR") && destination.equals("JAGRUTI NAGAR"))
                || (source.equals("JAGRUTI NAGAR") && destination.equals("AZAD NAGAR"))) {

            cost = 30;
//11
        }else if ((source.equals("AZAD NAGAR") && destination.equals("GHATKOPAR"))
                || (source.equals("GHATKOPAR") && destination.equals("AZAD NAGAR"))) {

            cost = 40;
            //4
        }else if ((source.equals("ANDHERI") && destination.equals("WESTERN EXPRESS HIGHWAY"))
                || (source.equals("WESTERN EXPRESS HIGHWAY") && destination.equals("ANDHERI"))) {

            cost = 10;
//5
        }else if ((source.equals("ANDHERI") && destination.equals("CHAKALA (J.B. NAGAR)"))
                || (source.equals("CHAKALA (J.B. NAGAR)") && destination.equals("ANDHERI"))) {

            cost = 20;
//6

        }else if ((source.equals("ANDHERI") && destination.equals("AIRPORT ROAD"))
                || (source.equals("AIRPORT ROAD") && destination.equals("ANDHERI"))) {

            cost = 20;
//7
        }else if ((source.equals("ANDHERI") && destination.equals("MAROL NAKA"))
                || (source.equals("MAROL NAKA") && destination.equals("ANDHERI"))) {

            cost = 20;
//8
        }else if ((source.equals("ANDHERI") && destination.equals("SAKI NAKA"))
                || (source.equals("SAKI NAKA") && destination.equals("ANDHERI"))) {

            cost = 20;
//9
        }else if ((source.equals("ANDHERI") && destination.equals("ASALPHA"))
                || (source.equals("ASALPHA") && destination.equals("ANDHERI"))) {

            cost = 30;
//10
        }else if ((source.equals("ANDHERI") && destination.equals("JAGRUTI NAGAR"))
                || (source.equals("JAGRUTI NAGAR") && destination.equals("ANDHERI"))) {

            cost = 30;
//11
        }else if ((source.equals("ANDHERI") && destination.equals("GHATKOPAR"))
                || (source.equals("GHATKOPAR") && destination.equals("ANDHERI"))) {

            cost = 30;
            //5
        }else if ((source.equals("WESTERN EXPRESS HIGHWAY") && destination.equals("CHAKALA (J.B. NAGAR)"))
                || (source.equals("CHAKALA (J.B. NAGAR)") && destination.equals("WESTERN EXPRESS HIGHWAY"))) {

            cost = 10;
//6

        }else if ((source.equals("WESTERN EXPRESS HIGHWAY") && destination.equals("AIRPORT ROAD"))
                || (source.equals("AIRPORT ROAD") && destination.equals("WESTERN EXPRESS HIGHWAY"))) {

            cost = 20;
//7
        }else if ((source.equals("WESTERN EXPRESS HIGHWAY") && destination.equals("MAROL NAKA"))
                || (source.equals("MAROL NAKA") && destination.equals("WESTERN EXPRESS HIGHWAY"))) {

            cost = 20;
//8
        }else if ((source.equals("WESTERN EXPRESS HIGHWAY") && destination.equals("SAKI NAKA"))
                || (source.equals("SAKI NAKA") && destination.equals("WESTERN EXPRESS HIGHWAY"))) {

            cost = 20;
//9
        }else if ((source.equals("WESTERN EXPRESS HIGHWAY") && destination.equals("ASALPHA"))
                || (source.equals("ASALPHA") && destination.equals("WESTERN EXPRESS HIGHWAY"))) {

            cost = 20;
//10
        }else if ((source.equals("WESTERN EXPRESS HIGHWAY") && destination.equals("JAGRUTI NAGAR"))
                || (source.equals("JAGRUTI NAGAR") && destination.equals("WESTERN EXPRESS HIGHWAY"))) {

            cost = 30;
//11
        }else if ((source.equals("WESTERN EXPRESS HIGHWAY") && destination.equals("GHATKOPAR"))
                || (source.equals("GHATKOPAR") && destination.equals("WESTERN EXPRESS HIGHWAY"))) {

            cost = 30;
//6

        }else if ((source.equals("CHAKALA (J.B. NAGAR)") && destination.equals("AIRPORT ROAD"))
                || (source.equals("AIRPORT ROAD") && destination.equals("CHAKALA (J.B. NAGAR)"))) {

            cost = 10;
//7
        }else if ((source.equals("CHAKALA (J.B. NAGAR)") && destination.equals("MAROL NAKA"))
                || (source.equals("MAROL NAKA") && destination.equals("CHAKALA (J.B. NAGAR)"))) {

            cost = 10;
//8
        }else if ((source.equals("CHAKALA (J.B. NAGAR)") && destination.equals("SAKI NAKA"))
                || (source.equals("SAKI NAKA") && destination.equals("CHAKALA (J.B. NAGAR)"))) {

            cost = 20;
//9
        }else if ((source.equals("CHAKALA (J.B. NAGAR)") && destination.equals("ASALPHA"))
                || (source.equals("ASALPHA") && destination.equals("CHAKALA (J.B. NAGAR)"))) {

            cost = 20;
//10
        }else if ((source.equals("CHAKALA (J.B. NAGAR)") && destination.equals("JAGRUTI NAGAR"))
                || (source.equals("JAGRUTI NAGAR") && destination.equals("CHAKALA (J.B. NAGAR)"))) {

            cost = 20;
//11
        }else if ((source.equals("CHAKALA (J.B. NAGAR)") && destination.equals("GHATKOPAR"))
                || (source.equals("GHATKOPAR") && destination.equals("CHAKALA (J.B. NAGAR)"))) {

            cost = 30;
//7
        }else if ((source.equals("AIRPORT ROAD") && destination.equals("MAROL NAKA"))
                || (source.equals("MAROL NAKA") && destination.equals("AIRPORT ROAD"))) {

            cost = 10;
//8
        }else if ((source.equals("AIRPORT ROAD") && destination.equals("SAKI NAKA"))
                || (source.equals("SAKI NAKA") && destination.equals("AIRPORT ROAD"))) {

            cost = 10;
//9
        }else if ((source.equals("AIRPORT ROAD") && destination.equals("ASALPHA"))
                || (source.equals("ASALPHA") && destination.equals("AIRPORT ROAD"))) {

            cost = 20;
//10
        }else if ((source.equals("AIRPORT ROAD") && destination.equals("JAGRUTI NAGAR"))
                || (source.equals("JAGRUTI NAGAR") && destination.equals("AIRPORT ROAD"))) {

            cost = 20;
//11
        }else if ((source.equals("AIRPORT ROAD") && destination.equals("GHATKOPAR"))
                || (source.equals("GHATKOPAR") && destination.equals("AIRPORT ROAD"))) {

            cost = 20;

            //8
        }else if ((source.equals("MAROL NAKA") && destination.equals("SAKI NAKA"))
                || (source.equals("SAKI NAKA") && destination.equals("MAROL NAKA"))) {

            cost = 10;
//9
        }else if ((source.equals("MAROL NAKA") && destination.equals("ASALPHA"))
                || (source.equals("ASALPHA") && destination.equals("MAROL NAKA"))) {

            cost = 20;
//10
        }else if ((source.equals("MAROL NAKA") && destination.equals("JAGRUTI NAGAR"))
                || (source.equals("JAGRUTI NAGAR") && destination.equals("MAROL NAKA"))) {

            cost = 20;
//11
        }else if ((source.equals("MAROL NAKA") && destination.equals("GHATKOPAR"))
                || (source.equals("GHATKOPAR") && destination.equals("MAROL NAKA"))) {

            cost = 20;
            //9
        }else if ((source.equals("SAKI NAKA") && destination.equals("ASALPHA"))
                || (source.equals("ASALPHA") && destination.equals("SAKI NAKA"))) {

            cost = 10;
//10
        }else if ((source.equals("SAKI NAKA") && destination.equals("JAGRUTI NAGAR"))
                || (source.equals("JAGRUTI NAGAR") && destination.equals("SAKI NAKA"))) {

            cost = 10;
//11
        }else if ((source.equals("SAKI NAKA") && destination.equals("GHATKOPAR"))
                || (source.equals("GHATKOPAR") && destination.equals("SAKI NAKA"))) {

            cost = 20;
            //10
        }else if ((source.equals("ASALPHA") && destination.equals("JAGRUTI NAGAR"))
                || (source.equals("JAGRUTI NAGAR") && destination.equals("ASALPHA"))) {

            cost = 10;
//11
        }else if ((source.equals("ASALPHA") && destination.equals("GHATKOPAR"))
                || (source.equals("GHATKOPAR") && destination.equals("ASALPHA"))) {

            cost = 10;
            //11
        }else if ((source.equals("JAGRUTI NAGAR") && destination.equals("GHATKOPAR"))
                || (source.equals("GHATKOPAR") && destination.equals("JAGRUTI NAGAR"))) {

            cost = 10;
        }

        // Output

        textResult.setText(String.valueOf(cost));
    }

}
