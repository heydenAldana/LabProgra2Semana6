package lab6p2_heydenaldana_22111098;

import java.awt.Color;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Usuario 
{
    // Atributos
    private String nombre, apellido, 
            username, password;
    private Date fechanac;
    private int edad;
    private Color colorfav;
    private Pokedex pokedex[];
    
    // constructor
    public Usuario(String nombre, String apellido, String username, String password, Date fechanac, Color colorfav)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
        this.password = password;
        this.fechanac = fechanac;
        this.edad = calcularEdad(fechanac);
        this.pokedex  = new Pokedex[3];
    }
    
    // ------------- funciones aparte
    
    // Calcula la edad del usuario
    public int calcularEdad(Date fechanac)
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fechanac.toString(), formatter);
        Period edad = Period.between(fechaNacimiento, LocalDate.now());
        
        return edad.getYears();
    }
    
    // Le da un pokedex cuando ya tenga sus tres pokemones.
    public boolean darPokedex(Pokemon pokemon1, Pokemon pokemon2, Pokemon pokemon3)
    {
        for (int i = 0; i < pokedex.length; i++) 
        {
            if(pokedex[i] == null)
            {
                pokedex[i] = new Pokedex(pokemon1, pokemon2, pokemon3);
                return true;
            }
        }
        return false;
    }
    
    
    // get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getFechanac() {
        return fechanac;
    }

    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Color getColorfav() {
        return colorfav;
    }

    public void setColorfav(Color colorfav) {
        this.colorfav = colorfav;
    }
    
}
