/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioAP.JPP.Interface;

import com.portfolioAP.JPP.Entity.Persona;
import java.util.List;


/**
 *
 * @author TOSHIBA
 */
public interface IPersonaService {
    /**Traer una lista de persona
     * @return s**/
    public List<Persona> getPersona();
    
    /*Guardar um objeto tipo persona
    
    */
    public void savePersona(Persona persona);
            
    /*eliminar usuario por ID
            */
            
     public void deletePersona(Long id);
      /*Buscar usuario
                 */
             
     public Persona  findPersona(Long id);
}
