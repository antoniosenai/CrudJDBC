package br.com.modelo.controller;

import br.com.modelo.negocio.Marca;
import br.com.modelo.persistencia.MarcaDAO;
import br.com.modelo.persistencia.MarcaDAOJDBC;
import java.util.List;

/**
 *
 * @author antonio_sj
 */
public class MarcaController {
    
    public void inserir(Marca m){
        MarcaDAO md = new MarcaDAOJDBC();
        md.inserir(m);
    }
    
    public void atualizar (Marca m){
        MarcaDAO md = new MarcaDAOJDBC();
        md.atualizar(m);
    }
    public void excluir(int id){
         MarcaDAO md = new MarcaDAOJDBC();
         md.excluir(id);
         
    }
    
    public List<Marca> getMarca(){
       MarcaDAO md = new MarcaDAOJDBC();
      return md.getMarcas();
    }
    
    public List<Marca> getMarcasbyNome(String nome){
       MarcaDAO md = new MarcaDAOJDBC();
      return md.getMarcasbyNome(nome);
    }
    
    public Marca getMarcasbyId(int id){
       MarcaDAO md = new MarcaDAOJDBC();
      return md.getMarcasbyId(id);
    }
    
    
    
    
}
