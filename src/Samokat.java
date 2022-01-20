public class Samokat extends BaseStatus {
    public Samokat(BaseStatus d) {
        super(d);
    }

    @Override
    public void send(String text) {
        super.send(text);
        System.out.println("Статус заказа от Самоката: " + text);
    }
}