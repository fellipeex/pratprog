package Controller;

import Model.PaisDAO;
import Model.Pais;

public class PaisService {
	private PaisDAO dao;
	
	public PaisService(){
		dao = new PaisDAO();
	}
	//metodos DAO
	public void criar(Pais pais){
		dao.incluir(pais);
	}
	public void atualizar(Pais pais){
		dao.atualizar(pais);
	}
	public void excluir(Pais pais){
		dao.excluir(pais);
	}
	public Pais carregar(int id){
		Pais pais = dao.carregar(id);
				return pais;
	}

}
