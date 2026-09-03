

public class AlgoritmoDois {
    void main() {
        IO.println("Seja bem vindo ao portal Java 360?");
        String usuario = IO.readln("Qual o seu nome?");
        IO.println("Olá " + usuario + " Bem vindo ao portal!");
        //mias rápido sem métodos
        //innt estrelas = 0;

        //mais lento com métodos (Classes Wrappers)
        //Integer.parseInt(valor para conversão)
        int estrelas = 0;
        IO.println("Quem criou o Java?");
        IO.println("1 - James Gosling");
        IO.println("2 - Bill Gates");
        IO.println("3 - Steve Jobs");
        IO.println("4 - Mark Zuckerberg");
        int resp = Integer.parseInt(IO.readln("Digite o número"));
        if(resp == 1){
            IO.println("Parabéns, você acertou! :)");
            estrelas = estrelas + 1;//variável de incremento
        }else {
            IO.println("Você errou! :(");
        }
        IO.println("Você obteve " + estrelas + " estrelas.");
}
 }