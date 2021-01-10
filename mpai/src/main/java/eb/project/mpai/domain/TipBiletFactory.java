package eb.project.mpai.domain;

import eb.project.mpai.domain.enums.Tip;
import eb.project.mpai.domain.enums.TipBilet;

public class TipBiletFactory {

    public static AbstractFactory rezerva(TipBilet tipBilet){
        if(tipBilet == TipBilet.NORMAL){
            return new BiletNormal();
        }
        else return new BiletVIP();
    }
}
