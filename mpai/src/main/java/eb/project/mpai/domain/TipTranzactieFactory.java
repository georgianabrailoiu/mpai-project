package eb.project.mpai.domain;

public class TipTranzactieFactory {
    public static AbstractFactory inchiriaza(boolean vaInchiria){
        if(vaInchiria){
            return new Inchiriere();
        }
        else return new Cumparare();
    }
}
