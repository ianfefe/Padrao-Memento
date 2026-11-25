public class PedidoEstadoEmPreparo implements PedidoEstado {

    private PedidoEstadoEmPreparo() {};
    private static PedidoEstadoEmPreparo instance = new PedidoEstadoEmPreparo();
    public static PedidoEstadoEmPreparo getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Em preparo";
    }

}
