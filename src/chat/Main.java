package chat;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Operator> list = new ArrayList<>();
        list.add(new Operator("Vasia"));
        list.add(new Operator("Dima"));
        list.add(new Operator("Petia"));

        Operator operatorFirst = new Operator("Vasia");
        operatorFirst
                .addHandler(new Operator("Dima"))
                .addHandler(new Operator("Petia"))
                .addHandler(new Operator("Olia"));

        new Thread(() -> operatorFirst.handler(new Message("Сообщение 1"))).start();
        new Thread(() -> operatorFirst.handler(new Message("Сообщение 2"))).start();
        new Thread(() -> operatorFirst.handler(new Message("Сообщение 3"))).start();
        new Thread(() -> operatorFirst.handler(new Message("Сообщение 4"))).start();
        new Thread(() -> operatorFirst.handler(new Message("Сообщение 5"))).start();
    }
}
