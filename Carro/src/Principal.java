public class Principal {
    public static void main(String[] args){
        Carro meuCarro = new Carro();

        meuCarro.modelo = "Kia Soul";
        meuCarro.cor = "Branco";
        meuCarro.ano = 2013;

        meuCarro.exibeFichaTecnica();

       System.out.println("Idade do carro: " + meuCarro.calculaIdade() + "anos");
    }
}
