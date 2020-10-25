package com.example.myreciclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Persona> personas;


    private void inicializarDatos(){
        personas = new ArrayList<>();
        personas.add(new Persona("Ricardo Gareca", "62 años de edad", "Peru","Ricardo Alberto Gareca (Tapiales, Buenos Aires; 10 de febrero de 1958) es un exfutbolista y actual entrenador argentino que se desempeñó como delantero. Actualmente es el entrenador de la selección peruana de fútbol, con la que ha conseguido una medalla de bronce en la Copa América 2015, la clasificación a la Copa Mundial de 2018 después tras 36 años de ausencia y la medalla de plata en la Copa América 2019.\n" +
                "\n" +
                "Fue formado en Boca Juniors, debutando con este equipo en 1978. Pasó en 1981 a Sarmiento de Junín donde se destacó como goleador y fue reintegrado a Boca en 1982, permaneció en este club hasta 1984. Tras un breve paso por River Plate, llegó en 1985 al América de Cali, consiguiendo dos campeonatos en 1985 y 1986. En 1989 retornó a Argentina para jugar por el Vélez Sarsfield, club del que es hincha, y finalizó su carrera futbolística en Independiente de Avellaneda con el que logró la Supercopa Sudamericana 1994."
                ,R.drawable.gareca));
        personas.add(new Persona("Jefferson Farfán", "35 años de edad", "Libre", "Jefferson Agustín Farfán Guadalupe (Villa El Salvador, Provincia de Lima, Perú, 26 de octubre de 1984) es un futbolista peruano. Juega como delantero y actualmente se encuentra sin equipo. Es internacional con la selección peruana de fútbol desde 2003. Es considerado por la prensa especializada como uno de los jugadores más importantes en la historia reciente del fútbol peruano."
                ,R.drawable.farfan));
        personas.add(new Persona("Paolo Guerrero", "36 años de edad", "Sport Club Internacional", "José Paolo Guerrero Gonzales (Lima, Perú, 1 de enero de 1984) es un futbolista peruano. Juega como delantero centro y su equipo actual es el SC Internacional del Campeonato Brasileño de Serie A. Es internacional absoluto con la Selección del Perú desde el 2004, de la cual es máximo goleador histórico. Es uno de los jugadores miembro del Club de los 100 de la FIFA, formado por aquellos futbolistas con más de cien partidos internacionales con su selección."
                ,R.drawable.guerrero));
        personas.add(new Persona("Andre Carrillo", "29 años de edad", "Al-Hilal FC", "André Martín Carrillo Díaz (Lima, Provincia de Lima, 14 de junio de 1991) es un futbolista peruano.3\u200BJuega como extremo derecho y su equipo actual es el Al Hilal FC de la Liga Profesional Saudí. Es internacional con la selección nacional de Perú desde 2011, con la que ha logrado dos bronces consecutivos durante la Copa América de 2011 y 2015, además de ser subcampeón con Perú en la Copa América 2019.\n" +
                "\n" +
                "Destaca por ser desequilibrante en el ataque, dotado de velocidad y dominio técnico, y caracterizado por sus amagues y gambetas."
                ,R.drawable.carrillo));
        personas.add(new Persona("Pedro Aquino", "25 años de edad", "Club León", "Pedro Jesús Aquino Sánchez (Lima, Provincia de Lima, Perú, 13 de abril de 1995) es un futbolista peruano. Juega como mediocentro defensivo y su equipo actual es el Club León de la Primera División de México.\n" +
                "\n" +
                "Es internacional absoluto con la Selección de fútbol del Perú desde 2016, logro disputar la Copa Mundial de Fútbol de 2018. Entre 2011 y 2013 fue internacional en categorías inferiores con Perú."
                ,R.drawable.aquino));
        personas.add(new Persona("Yoshimar Yotun", "30 años de edad", "Cruz Azul Fútbol Club", "Víctor Yoshimar Yotún Flores (Callao, Región Callao, Perú, 7 de abril de 1990) es un futbolista peruano. Juega como mediocentro y su equipo actual es el Cruz Azul de la Primera División de México. Es internacional absoluto con la Selección de Perú desde el 2011\n" +
                "\n" +
                "Con la selección peruana, tiene como preseas: la medalla de plata del subcampeonato conseguida en la Copa América Brasil 2019 y dos medallas de bronce en las ediciones Argentina 2011 y Chile 2015. Es el octavo jugador con más presencias (92 partidos), y el segundo máximo asistente con 10 pases de gol."
                ,R.drawable.yotun));
        personas.add(new Persona("Luis Advincula", "30 años de edad", "Rayo Vallecano de Madrid", "Luis Jan Piers Advíncula Castrillón (El Carmen, región Ica, 2 de marzo de 1990) apodado «El Rayo», es un futbolista peruano. Juega como lateral derecho y su equipo actual es el Rayo Vallecano de la Segunda División de España.\n" +
                "\n" +
                "Es internacional con la selección peruana desde 2010, de la cual es el décimo jugador histórico con más presencias (89 partidos). Ha participado en 3 ediciones de la Copa América: Argentina 2011, Chile 2015, consiguiendo en ambas la medalla de bronce y una medalla de plata en Brasil 2019.\n" +
                "\n" +
                "En un estudio realizado por la FIFA en 2018, se entregó la nómina de los 10 futbolistas más rápidos del mundo, donde Advincula fue el futbolista más veloz del mundo con una velocidad promedio de 36,3 km/h, por delante de Gareth Bale. En el año 2019 fue el cuarto jugador más veloz con una velocidad promedio de 36,15 km/h."
                ,R.drawable.advincula));
        personas.add(new Persona("Pedro Gallese", "30 años de edad", "Orlando City Soccer Club", "Pedro David Gallese Quiroz (Lima, Perú, 23 de febrero de 1990) es un futbolista peruano. Juega como guardameta y actualmente milita en el Orlando City de la MLS de Estados Unidos. Es el guardameta de la Selección de fútbol del Perú desde 2014. Donde tiene como preseas la medalla del subcampeonato en la Copa América 2019 y una medalla de bronce conseguida en la Copa América 2015."
                ,R.drawable.gallese));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView =(RecyclerView)findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);

        GridLayoutManager gridLayoutManager =
                new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);

        inicializarDatos();

        RVAdapter rvAdapter = new RVAdapter(personas,getApplicationContext());
        recyclerView.setAdapter(rvAdapter);

    }
}