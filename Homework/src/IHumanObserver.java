import java.time.LocalDateTime;

public interface IHumanObserver {
    void onBirth(LocalDateTime birthTime,
                 boolean gender,
                 float weight,
                 int height,
                 boolean location, int ageInYears) throws InterruptedException;

    void onKindergarten(boolean isLocalEstablishment,
                        boolean isLuxuriousKindergarten,
                        boolean isChildHappy) throws InterruptedException;

    void onSchool(int amountOfMinutesToGetToSchool,
                  boolean isSecondarySchoolOfMathematics,
                  int averageMark) throws InterruptedException;

    void onUniversity(String establishmentName,
                      String specialization,
                      boolean isFreeEducation,
                      boolean isWorkWhileStudy) throws InterruptedException;

    void onFindingJob(boolean isFound,
                      double salary,
                      int amountOfInterviews,
                      int timeInMinutesFromWorkplace);

    void onSeekingForWife(boolean isMotherLikes,
                          boolean isRich,
                          String fromCountry,
                          int herAge);

    void onHavingKids(int kidsQuantity,
                      boolean gender);

    void onStudyingJava(double cost,
                        boolean isOnlineCourse,
                        int amountOfMonthsToBecomeJunior);

    void onRunningStartUp(boolean isDivorced,
                          boolean isSuccessful,
                          String lineOfBusiness,
                          String companyName);

    void onSellingStartUp(double price,
                          boolean isEnoughMoneyToRetire,
                          boolean isHappyWithSpentEffortsAndTime);

    void onDeath(boolean isWifeCame,
                 boolean isDiedFromAge,
                 String placeWhereHeDied,
                 int amountOfPeopleAtFuneral
                 );
}
