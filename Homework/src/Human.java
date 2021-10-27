import java.time.LocalDateTime;

public class Human {
    private IHumanObserver observer;

    public void setObserver(IHumanObserver observer) {
        this.observer = observer;
    }

    public void startLife(LocalDateTime birthTime, boolean gender, float weight, int height, String location, int ageInYears) throws InterruptedException {
        observer.onBirth(birthTime,gender, weight, height, location, ageInYears);
        System.out.println("*Baby cries*");
        Thread.sleep(500);
    }

    public void schoolStage() throws InterruptedException {
        // observer.onSchool
        System.out.println("Seven years later");
        Thread.sleep(400);
    }
}
