package com.example.mutata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class activity_cultura extends AppCompatActivity {

    ImageView fotoActividad;
    TextView tituloActividad, descripcionActividad, descripcionCultura, textoActividadCultura;


    Actividad cultural;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultura);

        fotoActividad=findViewById(R.id.fotoActividadCultura);
        tituloActividad=findViewById(R.id.tituloActividadCultura);
        descripcionCultura=findViewById(R.id.descripcionCultura);

        cultural=(Actividad) getIntent().getSerializableExtra("cultural");

        //fotoActividad.setImageResource(cultural.getFotoActividad());
        tituloActividad.setText(cultural.getDescripcionActividad());
        descripcionCultura.setText(cultural.getDescripcionCultura());



    }
}