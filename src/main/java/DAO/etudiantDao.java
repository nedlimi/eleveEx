/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import Entities.Etudiant;

/**
 *
 * @author nuguru
 */
public interface etudiantDao {
    
    public void add(Etudiant student);
	public void edit(Etudiant student);
	public void delete(String studentId);
	public Etudiant getStudent(String studentId);
	public List getAllStudent();
    
}
