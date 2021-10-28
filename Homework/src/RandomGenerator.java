public class RandomGenerator {
    public int getRandomHeight() {
        var min = 46;
        var max = 56 + min;
        return (int) (Math.random() * (max - min) + min);
    }

    public int getRandomMinutes() {
        var min = 15;
        var max = 60 + min;
        return (int) (Math.random() * (max - min) + min);
    }

    public int getRandomBabyWeight() {
        var minQuantity = 3;
        var maxQuantity = 6 + 1;
        return (int) (Math.random() * (maxQuantity - minQuantity) + minQuantity);
    }

    public int getRandomID() {
        var minID = 1000;
        var maxID = 2_000_000 + minID;
        return (int) (Math.random() * (maxID - minID) + minID);
    }

    public boolean getRandomBoolean() {
        var minQuantity = 1;
        var maxQuantity = 3 + 1;
        var result = (int) (Math.random() * (maxQuantity - minQuantity) + minQuantity);
        return result > 1;
    }

    public int getRandomAverageMark() {
        var minQuantity = 3;
        var maxQuantity = 5;
        return (int) (Math.random() * (maxQuantity - minQuantity) + minQuantity);
    }
}
