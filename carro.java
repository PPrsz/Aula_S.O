public class carro {

    public String marca = "McLaren";
    String cor = "Prata";
    int velocidade = 231;

    public String printar() {
        return marca + cor + velocidade;
    }

    void acelerar() {

        velocidade+=15;
        System.out.println("A velocidade atual é:" + velocidade + "KM/H");
    }


    public String mostrarCarro() {

        return "Marca do carro: " + this.marca + "com a cor atual" + this.cor + "esta na velocidade" + this.velocidade+ "KM/H";      
    }
}