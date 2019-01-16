/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.EtudiantDaoImpl;
import Entities.Etudiant;
import Service.EtudiantServiceImp;
import java.util.List;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nuguru
 */
@Controller
public class EtudiantController {
    @Autowired
    private EtudiantServiceImp dao;
    
    @RequestMapping(value = "/etudiants",method = RequestMethod.GET, headers="Accept=application/json")
   public List<Etudiant> getContacts(){
        //System.out.println(dao.getAllStudent().get(0).toString());
       return dao.getAllStudent();
   }
   @RequestMapping(value="/index")
	public String pageIndex(Model model){
		// trai....
		model.addAttribute("listeProduit", dao.getAllStudent());
		return "produits";
		//   /Pages/produit.jsp
	}
   
   @RequestMapping(value = "/etudiants/{id}",method = RequestMethod.GET)
   public void getContact(@PathVariable String id){
       //return  dao.getStudent(id);
       dao.add(new Etudiant(id, "hjf", "fkjgh", "fdkgnfj"));
        
   }
    
}
