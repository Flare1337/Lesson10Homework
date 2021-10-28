import java.time.LocalDateTime;

public class Human {
    private IHumanObserver observer;
    private LocalDateTime birthTime;
    private boolean gender;
    private float weight;
    private int height;
    private boolean location;

    public LocalDateTime getBirthTime() {
        return birthTime;
    }

    public void setBirthTime(LocalDateTime birthTime) {
        this.birthTime = birthTime;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean getLocation() {
        return location;
    }

    public void setLocation(boolean location) {
        this.location = location;
    }

    public int getAgeInYears() {
        return ageInYears;
    }

    public void setAgeInYears(int ageInYears) {
        this.ageInYears = ageInYears;
    }

    private int ageInYears;

    public Human(LocalDateTime birthTime, boolean gender, float weight, int height, boolean location, int ageInYears) {
        this.birthTime = birthTime;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        this.location = location;
        this.ageInYears = ageInYears;
    }

    public void setObserver(IHumanObserver observer) {
        this.observer = observer;
    }

    public void startLife(LocalDateTime birthTime, boolean gender, float weight, int height, boolean location, int ageInYears) throws InterruptedException {
        System.out.println("1. Start of the human's life");
        Thread.sleep(1000);
        observer.onBirth(birthTime,gender, weight, height, location, ageInYears);
        System.out.println("*Baby cries*");
        Thread.sleep(500);
    }

    public void goToKindergarten(boolean isLocalEstablishment, boolean isLuxuriousKindergarten, boolean isChildHappy) throws InterruptedException {
        System.out.println("2. A kindergarten moment");
        Thread.sleep(2000);
        observer.onKindergarten(isLocalEstablishment, isLuxuriousKindergarten, isChildHappy);
        Thread.sleep(1000);
        if (isLuxuriousKindergarten) {
            System.out.println("Kid: Mommy I want this, and this one too!");
        }
        else {
            System.out.println("Kid: Please, please, please!");
        }
        Thread.sleep(500);
    }

    public void beginSchoolStage(int amountOfMinutesToGetToSchool, boolean isSecondarySchoolOfMathematics, int averageMark) throws InterruptedException {
        System.out.println("3. School ");
        Thread.sleep(2000);
        observer.onSchool(amountOfMinutesToGetToSchool, isSecondarySchoolOfMathematics, averageMark);
        if (averageMark > 3) {
            System.out.println("Teen: It wasn't hard, huh");
        }
        else {
            System.out.println("Teen: I'm sorry mom, I'll study harder");
        }
        Thread.sleep(500);
    }
    public void enrollUniversity(String establishmentName, String specialization, boolean isFreeEducation, boolean isWorkWhileStudy) throws InterruptedException {
        System.out.println("4. University stage");
        Thread.sleep(2000);
        observer.onUniversity(establishmentName, specialization, isFreeEducation, isWorkWhileStudy);
        if (isFreeEducation) {
            System.out.println("Student: I was preparing to exams hard just to avoid needless working while studying");
        }
        else {
            System.out.println("Student: I have to work to pay for education");
        }
    }
}
