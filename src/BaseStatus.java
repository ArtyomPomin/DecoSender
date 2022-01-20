public class BaseStatus extends Courier {
    Courier courier;

    public BaseStatus(Courier c) {
        this.courier = c;
    }

    @Override
    public void send(String text) {
        courier.send(text);
    }
}
