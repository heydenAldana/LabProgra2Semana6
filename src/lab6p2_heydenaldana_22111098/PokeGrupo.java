package lab6p2_heydenaldana_22111098;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class PokeGrupo 
{
    // Atributos
    private String nombre;
    private ArrayList<String> miembros;
    private Date fechacreacion;
    private String lider;
    private String tipo;
    
    // Constructor
    public PokeGrupo(String nombre, String lider)
    {
        this.nombre = nombre;
        this.miembros = new ArrayList<String>();
        this.fechacreacion = obtenerFecha(fechacreacion);
        this.lider = lider;
        this.tipo = "novato";
    }
    
    // Funciones personalizadas
    public Date obtenerFecha(Date fecha)
    {
        long milis = System.currentTimeMillis();
        fecha = new Date(milis);
        // Con esto queda en yyyy/MM/dd
        if(fecha.toString().contains("-"))
            fecha.toString().replace("-", "/");
        return fecha;
    }
    
    
    public boolean meterMiembros(String nombre)
    {
        for (String m : miembros) 
        {
            if(m.equals(nombre))
            {
                JOptionPane.showMessageDialog(null, nombre + " ya es miembro de este grupo.");
                return false;
            }
        }
        miembros.add(nombre);
        return true;
    }
    
    
     public boolean sacarMiembros(String nombre)
    {
        for (String m : miembros) 
        {
            if(m.equals(nombre))
            {
                JOptionPane.showMessageDialog(null, nombre + " ya es miembro de este grupo.");
                return false;
            }
        }
        miembros.remove(nombre);
        return true;
    }
    
    // get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
