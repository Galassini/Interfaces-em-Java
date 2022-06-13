 package qintess.academiajava.aplicacao;

import javax.swing.JOptionPane;

import qintess.academiajava.classes.DocumentoCnpj;
import qintess.academiajava.classes.DocumentoCpf;
import qintess.academiajava.classes.Funcionario;
import qintess.academiajava.classes.Pessoa;
import qintess.academiajava.enumeracoes.Sexo;

public class AppPessoas {
	public static void main(String[] args) {
		Pessoa p1 = new
				Funcionario(
						new DocumentoCpf("12345678901"),
				
				"Gabriela", 30, Sexo.FEMININO, 
				"Professor", 
				1300);
		
		Pessoa p2 = new Funcionario(
				new DocumentoCnpj("39182006000162"),
				"Jose", 50,
				Sexo.MASCULINO,
				"Consultor",
				5000);
		
		
		JOptionPane.showMessageDialog(null, p1.mostrar());
		JOptionPane.showMessageDialog(null, p2.mostrar());
	}
}
   

