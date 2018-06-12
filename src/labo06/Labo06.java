/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo06;

import dao.FiltroDao;
import java.util.ArrayList;
import modelo.Filtro;

/**
 *
 * @author UCA
 */
public class Labo06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FiltroDao fd = new FiltroDao();
        
        ArrayList<Filtro> todos = fd.readAll();
        
        for(Filtro f : todos){
            System.out.println(f.toString());
        }
        
        
    }
    
}
