package Comandos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import Estruturas.ListaOrdenada;

public class MostrarContatos extends ListaOrdenada{

	public void Listar() throws IOException {

		Reader fileReader = new FileReader("registros.txt");
		BufferedReader br = new BufferedReader(fileReader);
		//ListaOrdenada<String> lista = new ListaOrdenada();
		String showReg = null;
		
		while ((showReg = br.readLine()) != null) {
			System.out.println(showReg);
		}
	}

}
