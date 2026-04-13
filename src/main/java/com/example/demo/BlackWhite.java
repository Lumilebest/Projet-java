package com.example.demo;

import javafx.scene.paint.Color;

public class BlackWhite extends FiltreS{
    @Override
    protected Color transform(Color color) {
        double gray = (color.getBlue()+ color.getGreen()+ color.getRed())/3;
        return new Color(gray,gray,gray,color.getOpacity());
    }
}
