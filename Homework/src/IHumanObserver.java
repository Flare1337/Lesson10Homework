import java.time.LocalDateTime;

public interface IHumanObserver {
    void onBirth(LocalDateTime birthTime,
                 boolean gender,
                 float weight,
                 int height,
                 String location, int ageInYears) throws InterruptedException;

    void onKindergarten(boolean isLocalEstablishment, boolean isLuxuriousKindergarten, boolean isChildHappy);

    void onSchool(int amountOfMinutesToGetToSchool, boolean isSecondarySchoolOfMathematics, int averageMark);

    void onUniversity(String establishmentName, String specialization, boolean isFreeEducation, boolean isWorkWhileStudy);

    void onFindingJob(boolean isFound, double salary, int amountOfInterviews, int timeInMinutesFromWorkplace);

    void onSeekingForWife();

    void onGettingMarried();

    void onHavingKids();

    void onChoosingJavaCourses();

    void onRunningStartUp();

    void onDeath();
}
