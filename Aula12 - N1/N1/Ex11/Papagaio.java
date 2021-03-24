package N1Ex11;

public class Papagaio {
    private String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    @Override
    public String toString(){
        return "A cor da pena do papagaio é: " + this.corPena;
    }
}
