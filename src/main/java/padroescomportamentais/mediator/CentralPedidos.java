package padroescomportamentais.mediator;

// Mediador: único que conhece os setores e decide para onde cada pedido vai.
public class CentralPedidos {

    private static CentralPedidos instancia = new CentralPedidos();

    private Setor cozinha = new Cozinha();
    private Setor bar = new Bar();

    private CentralPedidos() {}

    public static CentralPedidos getInstancia() {
        return instancia;
    }

    public String encaminharLanche(String lanche) {
        return "A Central recebeu seu pedido.\n" +
                ">>" + cozinha.preparar(lanche);
    }

    public String encaminharBebida(String bebida) {
        return "A Central recebeu seu pedido.\n" +
                ">>" + bar.preparar(bebida);
    }

    public String encaminharCombo(String lanche, String bebida) {
        return "A Central recebeu seu pedido.\n" +
                ">>" + cozinha.preparar(lanche) + "\n" +
                ">>" + bar.preparar(bebida);
    }

}
