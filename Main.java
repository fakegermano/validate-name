

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	boolean valido = true;

	/* Recebe entradas. */
	System.out.println("Primeiro nome:");
	String nome = scanner.nextLine();
	System.out.println("Sobrenome:");
	String sobrenome = scanner.nextLine();
	System.out.println("Endereco:");
	String endereco = scanner.nextLine();
	System.out.println("Cidade:");
	String cidade = scanner.nextLine();
	System.out.println("Estado:");
	String estado = scanner.nextLine();
	System.out.println("CEP:");
	String cep = scanner.nextLine();
	System.out.println("Telefone:");
	String telefone = scanner.nextLine();

	/* Valida entrada. */
	System.out.println("\nResultado da validacao:");
	if (!ValidaEntrada.validaNome(nome)) {
	    valido = false;
	    System.out.println("Primeiro nome invalido");
	}
	if (!ValidaEntrada.validaSobrenome(sobrenome)) {
	    valido = false;
	    System.out.println("Sobrenome invalido");
	}
	if (!ValidaEntrada.validaEndereco(endereco)) {
	    valido = false;
	    System.out.println("Endereco invalido");
	}
	if (!ValidaEntrada.validaCidade(cidade)) {
	    valido = false;
	    System.out.println("Cidade invalida");
	}
	if (!ValidaEntrada.validaEstado(estado)) {
	    valido = false;
	    System.out.println("Estado invalido");
	}
	if (!ValidaEntrada.validaCEP(cep)) {
	    valido = false;
	    System.out.println("CEP invalido");
	}
	if (!ValidaEntrada.validaTelefone(telefone)) {
	    valido = false;
	    System.out.println("Telefone invalido");
	}

	if (valido) {
	    System.out.println("Entradas validas.");
	}

	scanner.close();

    }

}
