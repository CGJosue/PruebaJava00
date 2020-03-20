/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Josue
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println("Primera aplicacion en netbeans...");
        
        Persona la_persona=new Persona();
        
        Persona la_persona2=new Persona();
    
        la_persona2.setNombre("Sempromio");
        la_persona2.setEdad(30);
        
        la_persona2=la_persona;
        la_persona.saludar();
        la_persona2.saludar();
    }
}
