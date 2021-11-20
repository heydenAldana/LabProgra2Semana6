package lab6p2_heydenaldana_22111098;


class Pokemon 
{
    // Atributos
    private String nombre;
    private double danio;
    private double vit;
    private String velocidad;
    
    // constructor
    public Pokemon(String nombre, double danio, double vit, String velocidad)
    {
        this.nombre = nombre;
        this.danio = danio;
        this.vit = vit;
        this.velocidad = velocidad;
    }

    // get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDanio() {
        return danio;
    }

    public void setDanio(double danio) {
        this.danio = danio;
    }

    public double getVit() {
        return vit;
    }

    public void setVit(double vit) {
        this.vit = vit;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }
    
    
}
