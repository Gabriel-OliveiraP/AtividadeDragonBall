package dragonball;

public abstract class PersonagemDragonBall {
    protected String nome, sexo, poderEspecial;
    protected int idade, temporada;
    protected double ki;

    @Override
    public String toString(){
        String info = String.format("%s | Sexo %s | %s anos  | Temporada %s | Poder Especial: %s ", getNome(), getSexo(), getIdade(),
        getTemporada(), getPoderEspecial() );
        return info;
    }

    public PersonagemDragonBall(String nome, int idade, String sexo, String poderEspecial, int temporada,
            double ki) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.poderEspecial = poderEspecial;
        this.temporada = temporada;
        this.ki = ki;
    }

    public abstract double calcularPoder();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPoderEspecial() {
        return poderEspecial;
    }

    public void setPoderEspecial(String poderEspecial) {
        this.poderEspecial = poderEspecial;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public double getKi() {
        return ki;
    }

    public void setKi(double ki) {
        this.ki = ki;
    }

}