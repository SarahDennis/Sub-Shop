public class Waiter {
    Command command;

    public void takeOrder(Command c) {
        command = c;
        command.completeOrder();
    }
}
