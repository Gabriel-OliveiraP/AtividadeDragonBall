package dragonball;

public class Terraqueo extends PersonagemDragonBall{
    private String pais, cidade;

    public Terraqueo(String nome, int idade, String sexo, String poderEspecial, double temporada,
            double ki, String pais, String cidade) {
        super(nome, idade, sexo, poderEspecial, idade, ki);
        this.cidade = cidade;
        this.pais = pais;
            }
    @Override
    public String toString(){
    String personagem = super.toString();
    String terraqueo = String.format("| País: %s | Cidade: %s ",this.pais, this.cidade );
    return personagem + terraqueo;
    }
    public double calcularPoder(){
        return this.ki;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    

}
