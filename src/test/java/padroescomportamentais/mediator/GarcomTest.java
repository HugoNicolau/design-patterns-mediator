package padroescomportamentais.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarcomTest {

    @Test
    void devePedirLancheParaCozinha() {
        Garcom garcom = new Garcom();
        assertEquals("A Central recebeu seu pedido.\n" +
                ">>Cozinha: preparando X-Burguer",
                garcom.pedirLanche("X-Burguer"));
    }

    @Test
    void devePedirBebidaParaBar() {
        Garcom garcom = new Garcom();
        assertEquals("A Central recebeu seu pedido.\n" +
                ">>Bar: preparando Suco",
                garcom.pedirBebida("Suco"));
    }

    @Test
    void devePedirComboParaCozinhaEBar() {
        Garcom garcom = new Garcom();
        assertEquals("A Central recebeu seu pedido.\n" +
                ">>Cozinha: preparando X-Burguer\n" +
                ">>Bar: preparando Suco",
                garcom.pedirCombo("X-Burguer", "Suco"));
    }

}
