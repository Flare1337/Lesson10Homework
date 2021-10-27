public class Main {

    public static void main(String[] args) throws InterruptedException {
        Mother mother = new Mother();
        Human human = new Human();
        human.setObserver(mother);

    }
}
