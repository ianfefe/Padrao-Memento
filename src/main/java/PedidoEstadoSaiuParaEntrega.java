public class PedidoEstadoSaiuParaEntrega implements PedidoEstado {

    private PedidoEstadoSaiuParaEntrega() {};
    private static PedidoEstadoSaiuParaEntrega instance = new PedidoEstadoSaiuParaEntrega();
    public static PedidoEstadoSaiuParaEntrega getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Saiu para entrega";
    }

}
