package Comandos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

import Estruturas.ListaEncadeada;
import Estruturas.ListaOrdenada;

public class InserirContato extends ListaOrdenada{

	Scanner sc = new Scanner(System.in);
	String nome;
	String telefone;
		
	public void Inserir() throws IOException {

	ListaEncadeada<String> lista = new ListaEncadeada<>();
	
	Writer fileWriter = new FileWriter("registros.txt", true);
 	System.out.println("NOME: ");
 	nome = sc.next().toUpperCase();
 	lista.insert(new Estruturas.Nodo<String>(nome));
	fileWriter.write(nome);
	fileWriter.append(System.getProperty("line.separator"));
 	
	System.out.println("TELEFONE: ");
	telefone = sc.next();
	lista.insert(new Estruturas.Nodo<String>(telefone));
	fileWriter.write(telefone);
	fileWriter.append(System.getProperty("line.separator"));

	lista.print();
	fileWriter.close();
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}
	

}
