public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFichaTecnica() {
    System.out.println("Modelo do carro: " + modelo);
    System.out.println("Cor do carro: " + cor);
    System.out.println("Ano do carro: " + ano);
}

    int calculaIdade() {
        return 2024 - ano;

     }
}