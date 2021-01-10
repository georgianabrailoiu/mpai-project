package eb.project.mpai.domain;

import java.util.ArrayList;
import java.util.List;

public class History extends AbstractHistory{


   public History(){

   }

    public History(List<String> continut){
        this.continut=continut;
    }
    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public List<String> getContinut() {


       return continut;

    }









/*
    String[] continut;

    public History(){

    }

    public History(String[] continut){
       this.continut=continut;
    }

    public void addContinut(String[] continut){
        this.continut=continut;
    }



    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String[] getContinut() {
        return this.continut;
    }

 */
}
