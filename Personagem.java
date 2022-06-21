public class Personagem {
    String nome;
    private int energia;
    private int fome;
    private int sono;
    void cacar (){
        if (energia >= 2){
            System.out.println(nome + " cacando");
            energia -= 2;
        }
        else{
            System.out.println(nome + " sem energia para cacar");
        }
    fome = Math.min (fome + 1, 10);
    sono = Math.min (sono + 1, 10);   
    }
    void comer (){
        if (fome >= 1){
            System.out.println(nome + " comendo.");
            energia = Math.min (energia + 1, 10);
            fome -= 1;
        }
        else{
            System.out.println(nome + " sem fome.");
        }
    }
    void dormir (){
        if (sono >= 1){
            System.out.println(nome + " dormindo.");
            sono -= 1;
            energia = energia + 1 <= 10 ? energia + 1 : 10;
        }
        else{
            System.out.println(nome + " sem sono.");
        }
    }
    void exibeStatus(){
        System.out.println(nome + " está com " + energia + " de energia, " + fome + " de fome e " + sono + " de sono.");
    }
   }