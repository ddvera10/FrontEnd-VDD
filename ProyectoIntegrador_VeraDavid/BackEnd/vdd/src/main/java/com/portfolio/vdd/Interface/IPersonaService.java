package com.portfolio.vdd.Interface;

import com.portfolio.vdd.Entity.Persona;
import java.util.List;


public interface IPersonaService {
       //Traer lista de personas
  public List<Persona> getPersona();
  
  //guardar un objeto tipo persona
  public void savePersona (Persona persona);
  
  //Eliminar Persona lo buscamos por ID
  public void deletePersona (Long id);
  
  //buscar persona por id
  public Persona findPersona (Long id);
}
