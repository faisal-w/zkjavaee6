/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.go.djbc.app.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;

//import com.wirasoft.app.mymavenzkproject1.domain.TntSumberHdr;

/**
 *
 * @author LENOVO
 */
@Named
@Stateless
@Local
public class MyBean implements Serializable{

	//@PersistenceContext(unitName="denada-unit")
	//EntityManager entityManager; 
	
    public String shoutAString(){
        return "BA - BA - BA";
    }
    
    /*
    public List<TntSumberHdr> getAllSumber(){
    	try{
    		Query query = entityManager.createQuery("select t from TntSumberHdr t where t.kdKantor = :kdKantor").setParameter("kdKantor", "011100");
    		return query.getResultList();
    	}catch (Exception e) {
			return new ArrayList<TntSumberHdr>();
		}
    }
    */

}
