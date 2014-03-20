package Comandos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;





public class Remover {

	public void Remover() throws IOException{
		Scanner sc = new Scanner(System.in);
		Reader fileReader = new FileReader("registros.txt");
		BufferedReader br = new BufferedReader(fileReader);
		String showReg = null;

		System.out.println("Digite um nome");
		String pesquisa = sc.next();

		while ((showReg = br.readLine()) != null) {

			if(showReg.equalsIgnoreCase(pesquisa)){
				System.out.println("Contatos encontrados: " + showReg + br.toString());
				System.out.println("Voce deseja deletar contato?");
				pesquisa = sc.next().toUpperCase();

				if(pesquisa.equalsIgnoreCase("SIM")){
					showReg = null;
					
				}

			}

		}	

	}

}
