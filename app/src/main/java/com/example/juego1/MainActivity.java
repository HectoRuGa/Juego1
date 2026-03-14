package com.example.juego1;

import android.os.Bundle;
import com.jme3.app.AndroidHarness;
import android.util.Log;

public class MainActivity extends AndroidHarness {

    public MainActivity() {

        appClass = "com.example.juego1.GameMain";

        eglBitsPerPixel = 24; // profundidad de color 16 millones de colres
        eglAlphaBits = 0; // define la transparencia 0: desactivado 8:activadp
        eglDepthBits = 16; // El depth buffer se usa para saber qué objeto está delante y cuál detrás en un mundo 3D.
        // 16 calidad media
        // 24 alto consumo
        eglSamples = 0; // Define suavizado de bordes (antialiasing).

        exitDialogTitle = "Salir";
        exitDialogMessage = "Desea salir del juego?";
        eglStencilBits = 0; // efectos especiales avanzados sombras, reflejos

        Log.v("jMonkeyEngine","Iniciando juego");

    }

}