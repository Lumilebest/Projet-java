package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Controller {

    private Picture picture = new Picture();
    private Stage stage;

    @FXML
    private ImageView imageView;

    protected void setStage(Stage stage){
        this.stage = stage;
    }

    @FXML
    protected void chooseImageButton() {
        picture.setImageFC(this.stage);

        if ( picture.getImage() != null ){
            this.imageView.setImage(this.picture.getImage());
        }

    }
    @FXML
    protected  void rotateRightImageButton(){
        this.picture.transform(Picture.Transfo.ROTATER);

        if ( picture.getImage() != null){
            this.imageView.setImage(this.picture.getImage());
        }
    }

    @FXML
    protected  void rotateLeftImageButton(){
        this.picture.transform(Picture.Transfo.ROTATEL);

        if ( picture.getImage() != null){
            this.imageView.setImage(this.picture.getImage());
        }
    }

    @FXML
    protected void axeXImageButton(){
        this.picture.transform(Picture.Transfo.AXEX);

        if ( picture.getImage() != null){
            this.imageView.setImage(this.picture.getImage());
        }
    }

    @FXML
    protected void axeYImageButton(){
        this.picture.transform(Picture.Transfo.AXEY);

        if ( picture.getImage() != null){
            this.imageView.setImage(this.picture.getImage());
        }
    }

    @FXML
    protected void echangeFiltreImage(){
        this.picture.transform(Picture.Transfo.ECHANGE);

        if ( picture.getImage() != null){
            this.imageView.setImage(this.picture.getImage());
        }
    }

    @FXML
    protected void sepiaFiltreImage(){
        this.picture.transform(Picture.Transfo.SEPIA);

        if ( picture.getImage() != null){
            this.imageView.setImage(this.picture.getImage());
        }
    }

    @FXML
    protected void BlackWhiteFiltreImage(){
        this.picture.transform(Picture.Transfo.BLACKWHITE);

        if ( picture.getImage() != null){
            this.imageView.setImage(this.picture.getImage());
        }
    }

    @FXML
    protected void PrewittFiltreImage(){
        this.picture.transform(Picture.Transfo.PREWITT);

        if ( picture.getImage() != null){
            this.imageView.setImage(this.picture.getImage());
        }
    }




}