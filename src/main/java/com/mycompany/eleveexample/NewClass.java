/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eleveexample;
import Entities.Etudiant;
import Service.EtudiantServiceImp;
import java.util.Iterator;

/**
 *
 * @author nuguru
 */
public class NewClass {
    public static void main(String[] args) {
        EtudiantServiceImp s = new EtudiantServiceImp();
        System.out.println("La liste des produits : ");
		
		      Iterator<Etudiant> produits = s.getAllStudent().iterator();
		
		while(produits.hasNext()){
			Etudiant p = produits.next();
			                 System.out.println(p.getNom());;
		}
        
    }
}
