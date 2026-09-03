
public class AlgortmoTres {
    void main(){
    //número inteiros de 0 a 100
    int nota1,nota2,nota3;
    // média é real (double)
    double media;
    //operadores: + , - , * , / , %
    //ENTRADA das Notas dos Alunos
    nota1 = Integer.parseInt(IO.readln("Digite a primeira nota: "));
    nota2 = Integer.parseInt(IO.readln("Digite a segunda nota"));
    nota3 = Integer.parseInt(IO.readln("Digite a terceira nota"));
    //SOMA das Notas
    int soma = nota1 + nota2 + nota3;
    //MÉDIAS das Notas
    media = soma / 3.0;
    // SAÍDA das Notas, SOMA e MEDIA
    IO.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);
    IO.println("Soma: " + soma);
    IO.println("Média: " + media);
    }
    }
