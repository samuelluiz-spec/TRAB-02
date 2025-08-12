class Jogador {
    public void executarGolpe() {
        System.out.println("O jogador executa um golpe genérico.");
    }
}

class JogadorOfensivo extends Jogador {
    public void executarGolpe() {
        System.out.println("O jogador ofensivo aplica um forehand poderoso!");
    }
}

class JogadorDefensivo extends Jogador {
    public void executarGolpe() {
        System.out.println("O jogador defensivo devolve com um chop cheio de efeito!");
    }
}

public class Main {
    public static void main(String[] args) {
        Jogador j = new JogadorOfensivo();
        j.executarGolpe(); 

        j = new JogadorDefensivo();
        j.executarGolpe(); 
    }
}
