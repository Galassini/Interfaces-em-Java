package qintess.academiajava.aplicacao;

import javax.swing.JOptionPane;

import qintess.academiajava.figura.Circulo;
import qintess.academiajava.figura.Figura;
import qintess.academiajava.figura.Retangulo;

public class AppFiguras {
	public static void main(String[] args) {
		
		// Definindo retângulos
		Retangulo retangulo1 = new Retangulo(10,5);
		JOptionPane.showMessageDialog(null, "Área do retângulo: " + retangulo1.calcularArea());
		
		Figura figura1 = new Retangulo(1, 1);
		figura1 = new Circulo(5);
		
		//Determinando a classe do objeto instanciado a partir da variável.
		String classe = figura1.getClass().getSimpleName();
		
		JOptionPane.showMessageDialog(null, "Área do objeto " + classe +
				": " + figura1.calcularArea()); 
		
	}
}