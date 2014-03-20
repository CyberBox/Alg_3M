package Comandos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

import Estruturas.ListaOrdenada;
import Estruturas.Nodo;


public class PesquisarContatos extends ListaOrdenada {


	public void Pesquisar() throws IOException, ClassNotFoundException{
		Scanner sc = new Scanner(System.in);
		Reader fileReader = new FileReader("registros.txt");
		BufferedReader br = new BufferedReader(fileReader);
		String showReg = null;

		System.out.println("Digite um nome");
		String pesquisa = sc.next();

		while ((showReg = br.readLine()) != null) {

			if(showReg.equalsIgnoreCase(pesquisa)){
				System.out.println("Contatos encontrados: " + showReg + " ");
				System.out.println("\nVoce deseja ver mais contatos?");
				pesquisa = sc.next().toUpperCase();

				if(pesquisa.equalsIgnoreCase("SIM")){
					PesquisarContatos pc = new PesquisarContatos();
					pc.Pesquisar();
				}

			}

		}	

	}

}
