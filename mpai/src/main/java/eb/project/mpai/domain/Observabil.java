package eb.project.mpai.domain;

import eb.project.mpai.domain.interfaces.Handler;

import java.util.*;

public abstract class Observabil {
    ArrayList<Handler> listaObservatori = new ArrayList<>();

    public void addUtilizatori(Handler utilizator) {
        listaObservatori.add(utilizator);
    }
    public void removeUtilizator(Handler h) { listaObservatori.remove(h);}

    public void notifyObservers(String tipBilet){
        if(listaObservatori != null){
           for(Handler h : listaObservatori){
               h.render(tipBilet);
            }
        }
    }

}
