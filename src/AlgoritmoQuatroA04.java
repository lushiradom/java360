
public class AlgoritmoQuatroA04 {

    void main() {
        int musica = Integer.parseInt(IO.readln("Digite um estilo musical (1 a 7): "));
        IO.println("O estilo de música escolhido foi: " + musica);

        switch (musica) {
            case 1 ->
                IO.println("Rock");
            case 2 ->
                IO.println("Sertanejo");
            case 3 ->
                IO.println("MPB");
            case 4 ->
                IO.println("Funk");
            case 5 ->
                IO.println("Samba");
            case 6 ->
                IO.println("Pop");
            case 7 ->
                IO.println("classica");
            default ->
                IO.println("Estilo de música inválido!");
        }
    }
}
