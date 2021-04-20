package com.example.mutata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Actividad> listaDeDatos= new ArrayList<>();
    RecyclerView listaRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaRecyclerView=findViewById(R.id.listaRecyclerView);
        listaRecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        crearListado();

        AdaptadorLista adaptador= new AdaptadorLista(listaDeDatos);
        listaRecyclerView.setAdapter(adaptador);

    }

    private void crearListado() {
        listaDeDatos.add(new Actividad(R.drawable.jaikerazabi,"RESGUARDO INDIGENA", "Jaikerazabi - Etnia Embera","El resguardo indígena Jaikerazabi, custodiado por la imponente Serranía de Abibe, se encuentra ubicado en Mutatá, municipio del Urabá Antioqueño. En este territorio se han agrupado aproximadamente 83 familias Embera, provenientes de diversas comunidades de la región, quienes se vieron obligados a abandonar sus territorios de origen hace dos décadas."));
        listaDeDatos.add(new Actividad(R.drawable.bedo,"RIOS","Rios Bedo y Puenteadero","Este lugar esconde sin duda, mucha belleza hídrica; ríos cristalinos, cascadas, grandes charcos y mucho bosque en una ruta de un hermoso paraíso Antioqueño."));
        listaDeDatos.add(new Actividad(R.drawable.fiesta, "FIESTAS DEL RIO","Las mas tradicionales","Las fiestas del Río, las más tradicionales del distrito, se celebran en junio con un festival de danzas folclóricas, encuentros deportivos, cabalgata regional, rumba con orquesta, jornadas culturales, muestras gastronómicas y artesanales y el disfrute del río Mutatá, considerado el más limpio de la región."));
    }


}