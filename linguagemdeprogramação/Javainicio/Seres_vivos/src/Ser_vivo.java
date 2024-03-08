//atributos
public class Ser_vivo {
    private String life;
    private String quantidade_patas;
    private String tipo ;

    
 //métodos


    public void setMostrar(String m){ // transforma o atributo em uma nova string

        this.quantidade_patas=m;
    }
    public String mostrar_patas(){  // transforma o atributo em um objeto

        return(this.quantidade_patas);
    }

    public void setTipo(String t){ // transforma o atributo em uma nova string

       this.tipo=t;
    }
    public String mostrar_especie(){ // transforma o atributo em um objeto

       return(this.tipo);
    }


// Se a resposta for um numero impar, irá mostrar true, se mostrar um numero par sera falso
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
        System.out.println("Especie 1: " + s1.mostrar_especie());
        s1.setMostrar("4");
        System.out.println("Quantas patas tem? " + s1.mostrar_patas());
        System.out.println("A Especie 1 está viva! " + s1.show_life(1));

        Ser_vivo s2=new Ser_vivo();
        s2.show_life(2);
        s2.setTipo("Leão");
        System.out.println("Especie 2: " + s2.mostrar_especie());
        s2.setMostrar("4");
        System.out.println("Quantas patas tem? " + s2.mostrar_patas());
        System.out.println("A Especie 2 está viva! " + s2.show_life(2));

    }
}



 //public Ser_vivo()    transforma um numero inteiro, sem necessidade fazer uma nova string, entretando a resposta não será editavel
 //{
   //this.quantidade_patas=4;
 //}


 //public void mostrar_quantidades_membros(){  transforma o atributo em uma nova string/objeto, não sei exatamente a mudança que isso ocasiona, isso requer mais pesquisas
    //System.out.println(this.quantidade_patas);
 //}


