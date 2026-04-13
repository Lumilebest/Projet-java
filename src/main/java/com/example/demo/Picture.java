package com.example.demo;

import javafx.scene.image.Image;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class Picture {
    private Image image;

    public enum Transfo {
        ROTATER, ROTATEL, AXEX, AXEY, ECHANGE, SEPIA, BLACKWHITE, PREWITT
    };

    public void setImageFC(Stage stage) {
        //initialise le FileChooser
        FileChooser fileC = new FileChooser();
        fileC.setTitle("Choisis une image");
        fileC.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Images", "*.jpg", "*.jpeg", "*.png", "*.gif", "*.bmp")
        );

        //donne un repertoire courant au filechooser
        File dossier = new File("src/main/resources/images");

        if (dossier.exists()) {
            fileC.setInitialDirectory(dossier);
        } else {
            fileC.setInitialDirectory(new File("C:/"));
        }

        //prend le lien recolter par le file chooser
        File imageLink = fileC.showOpenDialog(stage);
        if (imageLink != null) {
            this.image = new Image(imageLink.toURI().toString());
        }
    }

    public void transform(Transfo t){
        if (this.image != null) {
            Transformation transformation;
            switch (t) {
                case ROTATER:
                    transformation = new RotateR();
                    break;
                case AXEX:
                    transformation = new AxeX();
                    break;
                case AXEY:
                    transformation = new AxeY();
                    break;
                case ECHANGE:
                    transformation = new Echange();
                    break;
                case BLACKWHITE:
                    transformation = new BlackWhite();
                case SEPIA:
                    transformation = new Sepia();
                    break;
                case PREWITT:
                    transformation = new Prewitt();
                    break;
                default:
                    transformation = new RotateL();
                    break;
            }

            this.image = transformation.apply(this.image);
        }
    }


    public Image getImage(){
        return this.image;
    }
}
