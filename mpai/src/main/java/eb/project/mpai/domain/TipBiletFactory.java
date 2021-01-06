package eb.project.mpai.domain;

import eb.project.mpai.domain.enums.Tip;
import eb.project.mpai.domain.enums.TipBilet;

public class TipBiletFactory {
    public static AbstractFactory rezerva(TipBilet tipBilet, float pret, int nrLoc){
        if(tipBilet == TipBilet.NORMAL){
            return new BiletNormal( pret,  nrLoc);
        }
        else return new BiletVIP(pret,  nrLoc);
    }
}
