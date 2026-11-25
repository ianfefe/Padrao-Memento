import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveArmazenarEstados() {
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        pedido.setEstado(PedidoEstadoEmPreparo.getInstance());
        pedido.setEstado(PedidoEstadoSaiuParaEntrega.getInstance());
        assertEquals(3, pedido.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        pedido.setEstado(PedidoEstadoEmPreparo.getInstance());
        pedido.restauraEstado(0);
        assertEquals(PedidoEstadoRecebido.getInstance(), pedido.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        pedido.setEstado(PedidoEstadoEmPreparo.getInstance());
        pedido.setEstado(PedidoEstadoSaiuParaEntrega.getInstance());
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        pedido.restauraEstado(2);
        assertEquals("Saiu para entrega", pedido.getEstado().getNomeEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Pedido pedido = new Pedido();
            pedido.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}
