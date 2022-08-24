/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioAP.JPP.Service;

import com.portfolioAP.JPP.Entity.Persona;
import com.portfolioAP.JPP.Interface.IPersonaService;
import com.portfolioAP.JPP.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImPersonaService implements IPersonaService{
    @Autowired IPersonaRepository iPersonaRepository;

    @Override
    public List<Persona> getPersona() {
      List <Persona> persona = iPersonaRepository.findAll();
       return persona; 
        
    }

    @Override
    public void savePersona(Persona persona) {
        iPersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        iPersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
    Persona persona = iPersonaRepository.findById(id).orElse(null);
    return persona;
        }
    
}
