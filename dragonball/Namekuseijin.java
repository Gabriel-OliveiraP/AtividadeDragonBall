package dragonball;
public class Namekuseijin extends PersonagemDragonBall{
    private int quantidadeEsferas;
    boolean podeCurar = true;
    public Namekuseijin(String nome, int idade, String sexo, String poderEspecial, double temporada,
    double ki,int quantidadeEsferas, boolean podeCurar){
        super(nome, idade, sexo, poderEspecial, quantidadeEsferas, ki);
        this.podeCurar = podeCurar;
        this.quantidadeEsferas = quantidadeEsferas;
    }
    @Override
    public String toString(){
        String personagem = super.toString();
        String namek = String.format("| Quantidade de esferas: %s | Pode curar", this.quantidadeEsferas);
        return personagem + namek;
    }
    public double calcularPoder() {
            return (ki*(podeCurar? 0.2 : 0));
        }
    public String fazerDesejo(String desejo){
        String lingua[] = desejo.split(" ");
        String total = "";
        for(int i = lingua.length ; i != 0 && i >= -1; i--){
            total += lingua[i-1] + " ";
        }
        return total;
    }
}
