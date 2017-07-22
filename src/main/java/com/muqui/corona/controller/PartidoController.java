/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muqui.corona.controller;

import com.muqui.corona.dao.PartidoDao;
import com.muqui.corona.model.Partido;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mq12
 */
public class PartidoController extends ActionSupport implements ModelDriven {
    // all struts logic here
    private Partido partido = new Partido();
    private List<Partido> listPartido = new ArrayList<Partido>();
    PartidoDao partidoDao = new PartidoDao();
	public String execute() {
               
	return SUCCESS;

	}

    @Override
    public Object getModel() {
       return partido;
    }
    
	public String addPartido() throws Exception{

		partidoDao.addPartido(partido);
                
                //reload the customer list
		listPartido = null;
		listPartido = partidoDao.listPartido();

		return SUCCESS;

	}

	
	public String listPartido() throws Exception{
            listPartido = partidoDao.listPartido();

		return SUCCESS;

	}

   

    /**
     * @return the listPartido
     */
    public List<Partido> getListPartido() {
        return listPartido;
    }

    /**
     * @param listPartido the listPartido to set
     */
    public void setListPartido(List<Partido> listPartido) {
        this.listPartido = listPartido;
    }

}
