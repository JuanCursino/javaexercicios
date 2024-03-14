public class Glaceon {
    //atributos
    private String Nome;

    private String tipo;

    private Double ataque;

// metodos

    public String nome_pokemon() {
        return (this.Nome);
    }

    public void setNome(String n){
        this.Nome=n;
    }

    public String tipo_pokemon() {
        return (this.tipo);
    }

    public void setTipo(String t){
        this.tipo=t;
    }

    public void setAtaque(Double ataque) {
        this.ataque = ataque;
    }
    public Double getAtaque(){
        return this.ataque;
    }
}
