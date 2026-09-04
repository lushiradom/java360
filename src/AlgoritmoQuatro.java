 public class AlgoritmoQuatro {

    void main() {
        int musica = Integer.parseInt(IO.readln("Digite um estilo musical (1 a 7): "));
        IO.println("O estilo de música escolhido foi: " + musica);

        switch (musica) {
            case 1:
                IO.println("Rock");
                break;
            case 2:
                IO.println("Sertanejo");
                break;
            case 3:
                IO.println("MPB");
                break;
            case 4:
                IO.println("Funk");
                break;
            case 5:
                IO.println("Samba");
                break;
            case 6:
                IO.println("Pop");
                break;
            case 7:
                IO.println("classica");
                break;
            default:
                IO.println("Estilo de música inválido!");
        }
    }
}

   