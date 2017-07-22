/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muqui.corona.dao;


import com.muqui.corona.model.Partido;
import java.util.List;
//import org.hibernate.Session;
//import org.hibernate.Transaction;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.transaction.Transaction;
import org.hibernate.Session;

/**
 *
 * @author mq12
 */
public class PartidoDao {

    @SessionTarget
    Session session;

    @TransactionTarget
    Transaction transaction;
  
	public void addPartido(Partido partido) throws ParseException{
            // partido.setFecha(new Date());
             Date fecha;
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            fecha = df.parse(partido.getFechaTemporal());
		session.save(partido);

	}

	//return all the customers in list
	public List<Partido> listPartido(){

		return session.createQuery("from Partido").list();

	}

}
