package AmazonPackage;

class OTPGenerator {

    public static String generate() {
        return String.valueOf((int)(Math.random() * 9000 + 1000));
    }
}