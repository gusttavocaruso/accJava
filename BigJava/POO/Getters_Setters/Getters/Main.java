public class Main {

  public static void main(String[] args) {

    Carro objCarro = new Carro("Creta", "Hyundai", 2021); 
 
    System.out.println("O nome do carro é: " + objCarro.getNome());
    System.out.println("A montadora do carro é: " + objCarro.getMontadora());
    System.out.println("O ano do carro é: " + objCarro.getAno());

  }

}
