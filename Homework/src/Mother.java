import java.time.LocalDateTime;

public class Mother implements IHumanObserver {
    @Override
    public void onKindergarten(boolean isLocalEstablishment, boolean isLuxuriousKindergarten, boolean isChildHappy) {

    }

    @Override
    public void onSchool(int amountOfMinutesToGetToSchool, boolean isSecondarySchoolOfMathematics, int averageMark) {

    }

    @Override
    public void onUniversity(String establishmentName, String specialization, boolean isFreeEducation, boolean isWorkWhileStudy) {

    }

    // Пусть принимает объект, мне все равно
    @Override
    public void onBirth(LocalDateTime birthTime, boolean gender, float weight, int height, String location, int ageInYears) throws InterruptedException {
        if (gender) {
            System.out.println("Mother: My boy!");
        }
        else {
            System.out.println("Mother: My girl!");
        }

        Thread.sleep(1000);
        if (weight > 5) {
            System.out.println("Mother: Oh, you'll be the strong one.");
        }
        else {
            System.out.println("Mother: You're my little wonder.");
        }

        Thread.sleep(1500);
        if (location.equals("New York")) {
            System.out.println("Mother: I'm so glad that we managed to get back home in time.");
        }
        else {
            System.out.println("Mother: In spite of the fact we couldn't get home in time, the local doctors turned up to be professional enough");
        }
        Thread.sleep(300);
    }
}
