package dragonball;

public class Sayajin extends PersonagemDragonBall implements Transformavel{

    private int nivelMaximoSSJ, temRabo;

    public Sayajin(String nome, int idade, String sexo, String poderEspecial, int temporada, double ki ) {
        super(nome, idade, sexo, poderEspecial, temporada, ki);
        this.nivelMaximoSSJ = 1;
    }
    @Override
    public String toString(){
        String infoPersonagem = super.toString();
        String infoSayajin = String.format(" | Nivel MáximoSSJ: %s | Tem rabo", this.nivelMaximoSSJ);
        return infoPersonagem + infoSayajin;
    }

    public double calcularPoder(){
        double poderTotal = this.ki*(1+nivelMaximoSSJ * 0.1);
        return poderTotal;//tirar duvida de como formatar esta budega//
    }
    
    // o importado//
    public void transformar(int nivel){
        if(this.nome.toLowerCase().equals("goku") || this.nome.toLowerCase().equals("vegeta")){
            if(nivel <= 5){
                this.nivelMaximoSSJ = nivel;
                System.out.printf("{{ %s }} transformou para super sayajin nível {{ %s }}\n",
                this.nome, this.nivelMaximoSSJ);
            }
        }
        else if(nivel <= 3){
            this.nivelMaximoSSJ = nivel;
            System.out.printf("{{ %s }} transformou para super sayajin nível {{ %s }}\n",
            this.nome, this.nivelMaximoSSJ);
        }
        else{
            System.out.println("Não foi possível transformar esse Sayajin");
        }

    }



}
