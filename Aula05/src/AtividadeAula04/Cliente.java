
package AtividadeAula04;

public class Cliente {
    private String nome;
    private int idade;
    private double renda;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
    
    public String calcularIdade()
    {   
        String idadeACalcular;
        if(this.idade >= 18){
            idadeACalcular = "O cliente é MAIOR de idade";
        }
        else
        {
            idadeACalcular = "O cliente é MENOR de idade";
        }
        return idadeACalcular;
        
    }
    
    public String calcularRenda()
    {   
        String rendaACalcular;
        if(this.renda >= 15000){
            rendaACalcular = "O cliente é RICO";
        }
        else
        {
            rendaACalcular = "O cliente é POBRE";
        }
        return rendaACalcular;
        
    }
}
