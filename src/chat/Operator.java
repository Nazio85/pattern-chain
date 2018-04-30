package chat;

public class Operator extends Handler {
    private String name;

    public Operator(String name) {
        this.name = name;
    }

    @Override
    public void handler(Message message) {
        if (isBusy()) {
            System.out.println("Оператор " + name + " занят");
            super.handler(message);
        } else {
            work();
        }
    }

    private synchronized void work() {
        isBusy = true;
        System.out.println("Добрый день, меня зовут " + name + ", секундочку сейчас найду ответ на" +
                "интересующий Вас вопрос.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + ": Ваш ответ");
        isBusy = false;
    }
}
