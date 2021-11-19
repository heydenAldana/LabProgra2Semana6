package lab6p2_heydenaldana_22111098;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;

/**
 * Esta vaina va a funcionar como Base De Datos
 * para este laboratorio
 */

public class BDD 
{
    private ArrayList <Usuario> user = new ArrayList<Usuario>();
    private ArrayList <Pokemon> pok = new ArrayList<Pokemon>();
    private ArrayList <Pokedex> poke = new ArrayList<Pokedex>();
    
    // Agrega un usuario al bdd
    public void agregarUsuario(String nombre, String apellido, String username, String contrasena, Date fechanac, Color colorfav)
    {
        user.add(new Usuario(nombre, apellido, username, contrasena, fechanac, colorfav));
    }
    
    // (Login) verifica si es valido o no para entrar)
    public boolean login(String username, String password)
    {
        for (Usuario u : user) 
        {
            if(u.getUsername().equals(username) && u.getPassword().equals(password))
                return true;
        }
        return false;
    }
}
