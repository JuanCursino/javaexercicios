public class Ser_vivo {
    //atributos
    private String life;
    private int quantidade_patas;
    private String tipo ;
 //métodos
   public Ser_vivo()
   {
       this.quantidade_patas=4;
   }
    public void setTipo(String t){
        this.tipo=t;
    }
    public String mostrar_especie(){
        return(this.tipo);
    }
    public void mostrar_quantidades_membros(){
        System.out.println(this.quantidade_patas);
    }

    public boolean show_life(int i){
        boolean vivo = true;
        if(i%2==0) vivo = false;
        return vivo;
    }


    public static void main(String[] args) throws Exception{
        Ser_vivo s1;
        s1=new Ser_vivo();
        s1.show_life(1);
        s1.setTipo("Tigre");
        s1.mostrar_quantidades_membros();

        Ser_vivo s2=new Ser_vivo();
        s2.show_life(2);
        s2.setTipo("Leão");
        s2.mostrar_quantidades_membros();
        System.out.println("Especie 1: " + s1.mostrar_especie());
        System.out.println("Especie 2: " + s2.mostrar_especie());

    }
}
