package com.example.juego1;

import com.jme3.app.SimpleApplication;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;

public class GameMain extends SimpleApplication {

    @Override
    public void simpleInitApp() {

        Box caja = new Box(1,1,1);

        Geometry cubo = new Geometry("Cubo", caja);

        Material material = new Material(assetManager,
                "Common/MatDefs/Misc/Unshaded.j3md");

        material.setColor("Color", ColorRGBA.Blue);

        cubo.setMaterial(material);

        rootNode.attachChild(cubo);
    }
}
