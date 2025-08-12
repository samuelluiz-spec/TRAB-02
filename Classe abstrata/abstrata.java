abstract class Raquete {
    String marca;

    public Raquete(String marca) {
        this.marca = marca;
    }

    public abstract void descricao();

    public void limpar() {
        System.out.println("Limpando a raquete " + marca + ".");
    }
}

class RaqueteCarbono extends Raquete {
    public RaqueteCarbono(String marca) {
        super(marca);
    }

    
    public void descricao() {
        System.out.println("Raquete de carbono: rápida e ideal para jogo ofensivo.");
    }
}

class RaqueteMadeira extends Raquete {
    public RaqueteMadeira(String marca) {
        super(marca);
    }

    
    public void descricao() {
        System.out.println("Raquete de madeira: controle elevado para jogo defensivo.");
    }
}

public class MainRaquete {
    public static void main(String[] args) {
        Raquete r = new RaqueteCarbono("Butterfly");
        r.descricao();
        r.limpar();
    }
}
