import java.util.Scanner;

public class Diagnostico {

	public static void main(String[] args) {
		
		Avaliacao avaliacaoGustavo = new Avaliacao();
		avaliacaoGustavo.calcularIMC(90, 1.88);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o peso: ");
		String peso = scan.next();
		
		System.out.print("Digite a altura: ");
		String altura = scan.next();
		
		scan.close();
		
		float pesoF = Float.parseFloat(peso);
		float alturaF = Float.parseFloat(altura);

		Avaliacao avaliacaoUsuario = new Avaliacao();
		avaliacaoUsuario.calcularIMC(pesoF, alturaF);

	}

}
