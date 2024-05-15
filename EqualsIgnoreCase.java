public class EqualsIgnoreCaseString {
    public static void main(String[] args) {
        String string1 = "nen";
        String string2 = "nen";
        String string3 = "Nen";
        System.out.println("Hasilnya:" + string1.equalsIgnoreCase(string2));
        System.out.println("Hasilnya:" + string1.equalsIgnoreCase(string3));
    }

}