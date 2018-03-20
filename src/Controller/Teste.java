package Controller;

import Model.Pais;
import Controller.PaisService;

public class Teste {
	public static void main(String args[]){
		Pais pais = new Pais(10,"Canada",3085000,645712.11);
		PaisService ps = new PaisService();
		ps.criar(pais);
		System.out.println("pais criado com sucesso/nPais: "+  pais.toString());
	}
	
}
