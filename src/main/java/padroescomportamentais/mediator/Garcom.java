package padroescomportamentais.mediator;

// Colega: não conhece a Cozinha nem o Bar, só fala com a CentralPedidos.
public class Garcom {

    public String pedirLanche(String lanche) {
        return CentralPedidos.getInstancia().encaminharLanche(lanche);
    }

    public String pedirBebida(String bebida) {
        return CentralPedidos.getInstancia().encaminharBebida(bebida);
    }

    public String pedirCombo(String lanche, String bebida) {
        return CentralPedidos.getInstancia().encaminharCombo(lanche, bebida);
    }

}
