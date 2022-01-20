public class Yandex extends BaseStatus {
    public Yandex(BaseStatus s) {
        super(s);
    }

    @Override
    public void send(String text) {
        super.send(text);
        System.out.println("Статус заказа от Яндекса: " + text);
    }
}
