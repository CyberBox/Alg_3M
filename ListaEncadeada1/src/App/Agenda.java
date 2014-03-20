package App;

import java.io.IOException;
import java.util.Scanner;

import Comandos.InserirContato;
import Comandos.MostrarContatos;
import Comandos.PesquisarContatos;
import Comandos.Remover;
import Estruturas.ListaEncadeada;
import Estruturas.ListaOrdenada;
import Estruturas.Nodo;


public class Agenda {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception  {
	
		String nome = null;
		String fone;
		String opc="";
		InserirContato in = new InserirContato();
		MostrarContatos ver = new MostrarContatos();
		Remover del = new Remover();
		PesquisarContatos pes = new PesquisarContatos();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("\n-----------------------\n" +
					"Opções:\n" +
					"-1 Cadastrar Contato\n" +
					"-2 Mostrar Agenda\n" +
					"-3 Remove Contato \"não funciona\"\n" +
					"-4 Pesquisar\n" +
					"-0 Sair");

			opc = sc.next();
			switch (opc) {
			case "1":
				in.Inserir();
				break;
			case "2":
				ver.Listar();
				break;
			case "3":
				del.Remover();
				break;
			case "4":
				pes.Pesquisar();
				break;
			case "0":
				System.exit(0);
				break;
				
			default:
				break;
			}
			
		} while (true);
		
	} 

}
