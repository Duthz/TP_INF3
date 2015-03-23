/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts.model;

import com.myapp.struts.bean.Employe;

/**
 *
 * @author Arles Mathieu
 */
public interface IEmployeModel extends IModel{
    
    /**
     * Insère un employé dans la base de données
     * @param e Employé à ajouter
     */
    public void insertEmploye(Employe e);
    
    
    /**
     * Supprime un employé
     * @param username Nom de l'employé à supprimer
     */
    public void deleteEmploye(String username);

}
