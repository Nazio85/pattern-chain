package chat;

import java.util.Optional;

public abstract class Handler {
    private Handler handlerNext;

    protected boolean isBusy;

    public void handler(Message message){
        if (handlerNext != null)
            handlerNext.handler(message);
         else {
            System.out.println("Все операторы заняты");
        }
    }

    Handler addHandler(Handler handler){
        handlerNext = handler;
        return handlerNext;
    }

    public boolean isBusy() {
        return isBusy;
    }


}
