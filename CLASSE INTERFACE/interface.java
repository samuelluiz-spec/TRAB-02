Interface;

interface Saqueiro {
    void sacar();
}

interface Bloqueador {
    void bloquear();
}

class CampeaoMundial implements Saqueiro, Bloqueador {
    public void sacar() {
        System.out.println("Executa um saque com muito efeito!");
    }

    public void bloquear() {
        System.out.println("Bloqueia o ataque com precisão.");
    }
}

abstract class Treinador implements Saqueiro {
    public void sacar() {
        System.out.println("Demonstra um saque técnico.");
    }

    public abstract void treinarJogador();
}

public class MainInterface {
    public static void main(String[] args) {
        CampeaoMundial jogador = new CampeaoMundial();
        jogador.sacar();
        jogador.bloquear();
    }
}
