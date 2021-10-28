import java.time.LocalDateTime;

public class Mother implements IHumanObserver {
    // Пусть принимает объект, мне все равно
    @Override
    public void onBirth(LocalDateTime birthTime, boolean gender, float weight, int height, boolean location, int ageInYears) throws InterruptedException {
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
        if (location) {
            System.out.println("Mother: I'm so glad that we managed to get back home in time.");
        }
        else {
            System.out.println("Mother: In spite of the fact we couldn't get back home in time," +
                    "\nthe local doctors turned up to be professional enough");
        }
        Thread.sleep(300);
    }

    @Override
    public void onKindergarten(boolean isLocalEstablishment, boolean isLuxuriousKindergarten, boolean isChildHappy) throws InterruptedException {
        if (isChildHappy) {
            System.out.println("Mother: *talks with her friends about happy moments that happened last week*");
        }
        else {
            System.out.println("Mother: *talks with her friends about mental health of children*");
        }
        Thread.sleep(300);
        System.out.println("*A few moments later*");
        Thread.sleep(1500);
        if (isLuxuriousKindergarten) {
            System.out.println("Mother: You should be more patient! I'll buy only one toy!");
        }
        else {
            System.out.println("Mother: Do you want this little toy soldier?");
        }
        Thread.sleep(500);
    }

    @Override
    public void onSchool(int amountOfMinutesToGetToSchool, boolean isSecondarySchoolOfMathematics, int averageMark) throws InterruptedException {
        if (amountOfMinutesToGetToSchool < 20) {
            System.out.println("Mother: It’s so good that we live near the school");
        }
        else {
            System.out.println("Mother: Well, at least the bus stop is literally in front of our house");
        }
        Thread.sleep(1500);
        if (isSecondarySchoolOfMathematics) {
            System.out.println("Mother: You'll be as smart as your father! Study hard and you will be rewarded");
        }
        else {
            System.out.println("Mother: I've found a music school nearby, I'll be fun I swear");
        }
        Thread.sleep(500);
        System.out.println("*A couple of years later*");
        Thread.sleep(2000);
        if (averageMark > 3) {
            System.out.println("Mother: That's what I said! I'm proud of you");
        }
        else {
            System.out.println("Mother: Don't worry, I'll hire a tutor and we'll overcome this");
        }
        Thread.sleep(1000);
    }

    @Override
    public void onUniversity(String establishmentName, String specialization, boolean isFreeEducation, boolean isWorkWhileStudy) throws InterruptedException {
        if (isFreeEducation) {
            System.out.println("Mother: It's so good that you don't have to work while studying");
        }
        else {
            System.out.println("Mother: Anyway I don't want you to go to work, I can handle with education cost by myself");
        }
        Thread.sleep(1500);
        if (isWorkWhileStudy) {
            System.out.println("Mother: You should stop working so much! I'll end badly");
        }
        else if (!isFreeEducation) {

        }
        else {
            System.out.println("Mother: ");
        }

    }

    @Override
    public void onFindingJob(boolean isFound, double salary, int amountOfInterviews, int timeInMinutesFromWorkplace) {

    }

    @Override
    public void onSeekingForWife(boolean isMotherLikes, boolean isRich, String fromCountry, int herAge) {

    }

    @Override
    public void onHavingKids(int kidsQuantity, boolean gender) {

    }

    @Override
    public void onStudyingJava(double cost, boolean isOnlineCourse, int amountOfMonthsToBecomeJunior) {

    }

    @Override
    public void onRunningStartUp(boolean isDivorced, boolean isSuccessful, String lineOfBusiness, String companyName) {

    }

    @Override
    public void onSellingStartUp(double price, boolean isEnoughMoneyToRetire, boolean isHappyWithSpentEffortsAndTime) {

    }

    @Override
    public void onDeath(boolean isWifeCame, boolean isDiedFromAge, String placeWhereHeDied, int amountOfPeopleAtFuneral) {

    }
}
