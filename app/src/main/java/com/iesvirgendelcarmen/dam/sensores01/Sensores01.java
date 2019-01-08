package com.iesvirgendelcarmen.dam.sensores01;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class Sensores01 extends AppCompatActivity {

    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensores01);
        texto = findViewById(R.id.texto_1);

        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> sensorList = sensorManager.getSensorList(Sensor.TYPE_ALL);

        for(Sensor sensor : sensorList){
            texto.append(sensor.getName() + "\n");
        }

    }
}
