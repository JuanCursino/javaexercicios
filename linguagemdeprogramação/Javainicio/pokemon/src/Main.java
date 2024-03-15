//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Voltorb s1;
        s1 = new Voltorb();
        s1.setNome("Voltorb");
        System.out.println("Qual é esse pokémon? " + s1.nome_pokemon());
        s1.setTipo("Elétrico");
        System.out.println("Qual tipo: " + s1.tipo_pokemon());
        s1.setAtaque(31.2);
        System.out.println("Quantos de ataque ele tem: " + s1.getAtaque());

        Kyogre s2;
        s2 = new Kyogre();
        s2.setNome("Kyogre");
        System.out.println("Qual é esse pokémon? " + s2.nome_pokemon());
        s2.setTipo("Água");
        System.out.println("Qual o tipo: " + s2.tipo_pokemon());
        s2.setAtaque(70.3);
        System.out.println("Quantos de ataque ele tem: " + s2.getAtaque());

        Charmander s3;
        s3 = new Charmander();
        s3.setNome("Charmander");
        System.out.println("Qual é esse pokémon? " + s3.nome_pokemon());
        s3.setTipo("Água");
        System.out.println("Qual o tipo: " + s3.tipo_pokemon());
        s3.setAtaque(10.9);
        System.out.println("Quantos de ataque ele tem: " + s3.getAtaque());

        Giratina s4;
        s4 = new Giratina();
        s2.setNome("Giratina");
        System.out.println("Qual é esse pokémon? " + s4.nome_pokemon());
        s4.setTipo("Sombrio");
        System.out.println("Qual o tipo: " + s4.tipo_pokemon());
        s4.setAtaque(45.5);
        System.out.println("Quantos de ataque ele tem: " + s4.getAtaque());

        Bulbassauro s5;
        s5 = new Bulbassauro();
        s2.setNome("Bulbassauro");
        System.out.println("Qual é esse pokémon? " + s5.nome_pokemon());
        s5.setTipo("Planta");
        System.out.println("Qual o tipo: " + s5.tipo_pokemon());
        s5.setAtaque(12.7);
        System.out.println("Quantos de ataque ele tem: " + s5.getAtaque());

        Kakuna s6;
        s6 = new Kakuna();
        s6.setNome("Kakuna");
        System.out.println("Qual é esse pokémon? " + s6.nome_pokemon());
        s6.setTipo("Inseto e veneno");
        System.out.println("Qual o tipo: " + s6.tipo_pokemon());
        s6.setAtaque(15.2);
        System.out.println("Quantos de ataque ele tem: " + s6.getAtaque());

        Gengar g7;
        g7 = new Gengar();
        g7.setNome("Gengar");
        System.out.println("Qual é esse pokémon? " + g7.nome_pokemon());
        g7.setTipo("Fantasma");
        System.out.println("Qual o tipo: " + g7.tipo_pokemon());
        g7.setAtaque(62.6);
        System.out.println("Quantos de ataque ele tem: " + g7.getAtaque());

        Glaceon s8;
        s8 = new Glaceon();
        s8.setNome("Glaceon");
        System.out.println("Qual é esse pokémon? " + s8.nome_pokemon());
        s8.setTipo("Gelo");
        System.out.println("Qual o tipo: " + s8.tipo_pokemon());
        s8.setAtaque(51.4);
        System.out.println("Quantos de ataque ele tem: " + s8.getAtaque());

        Pichu s9;
        s9 = new Pichu();
        s9.setNome("Pichu");
        System.out.println("Qual é esse pokémon? " + s9.nome_pokemon());
        s9.setTipo("Elétrico");
        System.out.println("Qual o tipo: " + s9.tipo_pokemon());
        s9.setAtaque(8.1);
        System.out.println("Quantos de ataque ele tem: " + s9.getAtaque());

        Meowth m1;
        m1 = new Meowth();
        m1.setNome("Psyduck");
        System.out.println("Qual é esse pokémon? " + m1.nome_pokemon());
        m1.setTipo("Normal");
        System.out.println("Qual o tipo: " + m1.tipo_pokemon());
        m1.setAtaque(23.7);
        System.out.println("Quantos de ataque ele tem: " + m1.getAtaque());


    }
}



public class TesteFracao {
    public static void main(String[] args) {
        TestaClasse f1 = new TestaClasse(2, 5);
        TestaClasse f2 = new TestaClasse(3, 5);

        TestaClasse resultado1 = f1.somar(f2);

        System.out.println("Soma: " + resultado1);
    }
}
