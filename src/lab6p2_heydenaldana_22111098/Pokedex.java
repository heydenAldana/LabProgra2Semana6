package lab6p2_heydenaldana_22111098;

class Pokedex 
{
    // Atributos
    private Pokemon pokemon[] = new Pokemon[3];
    private double promediodanio;
    
    // constructor
    public Pokedex(Pokemon pokemon1, Pokemon pokemon2, Pokemon pokemon3)
    {
        pokemon[0] = pokemon1;
        pokemon[1] = pokemon2;
        pokemon[2] = pokemon3;
        
        // Calcular promedio de danio
        int prom = 0;
        for (int i = 0; i < pokemon.length; i++) 
        {
            prom += pokemon[i].getDanio();
        }
        this.promediodanio = prom / 3;
    }

    // get y set
    public double getPromediodanio() {
        return promediodanio;
    }

    public void setPromediodanio(double promediodanio) {
        this.promediodanio = promediodanio;
    }
    
    
}
