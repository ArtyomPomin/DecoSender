public class Main {
    public static void main(String[] args) {

        BaseStatus status = new BaseStatus(new Courier());
        status = new Samokat(status);
        status = new Yandex(status);
        status.send("Заказ доставлен");
    }
}
