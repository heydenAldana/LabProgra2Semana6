package lab6p2_heydenaldana_22111098;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 * Esta vaina va a funcionar como Base De Datos
 * para este laboratorio
 */

public class BDD 
{
    private ArrayList <Usuario> user = new ArrayList<Usuario>();
    private ArrayList <Pokemon> pok = new ArrayList<Pokemon>();
    private ArrayList <Pokedex> poke = new ArrayList<Pokedex>();
    private ArrayList <PokeGrupo> pg = new ArrayList<PokeGrupo>();
    
    // Agrega un usuario al bdd
    public void agregarUsuario(String nombre, String apellido, String username, String contrasena, Date fechanac, Color colorfav)
    {
        for (Usuario u : user) 
        {
            if(u.getUsername().equals(nombre))
            {
                JOptionPane.showMessageDialog(null, "Este usuario ya existe.");
                return;
            }
        }
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
    
    // Crear un pokegrupo
    public void crearPokeGrupo(String nombre, String lider)
    {
        for (PokeGrupo pogr : pg) 
        {
            if(pogr.getNombre().equals(nombre))
            {
                JOptionPane.showMessageDialog(null, "Este nombre ya existe.");
                return;
            }
        }
        pg.add(new PokeGrupo(nombre, lider));
    }
    
    // Unirse a un pokegrupo
    public void unirsePokeGrupo(String nombregrupo, String miembro)
    {
        for (PokeGrupo pogr : pg) 
        {
            if(pogr.getNombre().equals(nombregrupo))
            {
                if(pogr.meterMiembros(miembro))
                    JOptionPane.showMessageDialog(null, "Se ha unido a " + nombregrupo + " con éxito");
                else
                    JOptionPane.showMessageDialog(null, "No se ha podido unir a " + nombregrupo + "\n Posiblemente ya está en él.");
            }
        }
    }
    
    // Salirse de un grupo
    public void salirPokeGrupo(String nombregrupo, String miembro)
    {
        for (PokeGrupo pogr : pg) 
        {
            if(pogr.getNombre().equals(nombregrupo))
            {
                if(pogr.sacarMiembros(miembro))
                    JOptionPane.showMessageDialog(null, "Se ha unido a " + nombregrupo + " con éxito");
                else
                    JOptionPane.showMessageDialog(null, "No se ha podido unir a " + nombregrupo + "\n Posiblemente ya está en él.");
            }
        }
    }
}
