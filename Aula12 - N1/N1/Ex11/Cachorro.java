package N1Ex11;

public class Cachorro {
    private String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public String toString(){
        return "A cor do pelo do cachorro é: " + this.corPelo;
    }
}