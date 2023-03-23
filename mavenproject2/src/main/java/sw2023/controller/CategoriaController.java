/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sw2023.controller;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import sw2023.ejb.CategoriaFacadeLocal;
import sw2023.model.Categoria;

/**
 *
 * @author probles
 */
@Named
@ViewScoped
public class CategoriaController implements Serializable {
    @EJB
    private CategoriaFacadeLocal categoriaEjb;
    private Categoria categoria;

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
     public CategoriaController(){
        
    }
    @PostConstruct
    public void init(){
        categoria = new Categoria();
    }
    
    public void guardar(){
        try{
            System.out.println("emem");
            categoriaEjb.create(categoria);
        }catch(Exception e){
             System.out.println("eoeoeo");

            
        }
    }
    
    
}
