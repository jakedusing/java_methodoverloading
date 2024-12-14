public class OverloadChallenge {
    public static void main(String[] args) {
        double num = convertToCentimeters(6, 2);
        System.out.println(num);
    }

    public static double convertToCentimeters(int height) {
        return height * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int heightInInches) {
        System.out.println("Feet = " + heightInFeet + " & inches = " + heightInInches);
        int feetToInches = heightInFeet * 12;
        System.out.println("Feet converted to inches = " + feetToInches);
        int totalInches = feetToInches + heightInInches;
        System.out.println("Total inches = " + totalInches);
        return convertToCentimeters(totalInches);
    }
}
