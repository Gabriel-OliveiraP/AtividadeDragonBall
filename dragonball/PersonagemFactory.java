package dragonball;
public class PersonagemFactory {
    public static void main(String[] args) {
    
    Terraqueo gabriel = new Terraqueo("Gabriel", 18, "Masculino", "Nenhum", 10, 200
    , "Brasil", "Belo Horizonte");
    Sayajin goku = new Sayajin("Goku", 25, "Masculino", "Gamehameha",2, 9000.1);
    Sayajin gohan = new Sayajin("Gohan", 7, "Masculino", "Espada Iluminada",2, 9000.1);
    Namekuseijin dende = new Namekuseijin("Dende", 19, "Masculino", "Teleporte",2, 9000.1, 8, true);
    Sayajin kuririn = new Sayajin("Kuririn", 26, "Masculino", "Morte instantanea(de si mesmo)",2, 9000.1);
    goku.transformar(5);
    gohan.transformar(5);
    gohan.transformar(3);
    kuririn.transformar(2);
    System.out.println(dende.fazerDesejo(" \n MEU DESEJO É PODER INFINITO AHHAHHAHAHAH \n"));
    System.out.println(gabriel);
    System.out.println(goku);
    System.out.println(dende);
    }
}
