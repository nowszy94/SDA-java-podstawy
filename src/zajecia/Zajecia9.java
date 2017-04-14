package zajecia;

public class Zajecia9 {
    public static void main(String[] args) {
//        System.out.println(cezarCode("WOJNA"));
//        String coddedMessage = cezarCode("Ala Ma Kota I 2 Psy");
//        System.out.println(coddedMessage);
//        System.out.println(cezarDecode(coddedMessage));
//        System.out.println(cezarDecode(cezarCode("Ala ma kota")));
//        System.out.println(cezarCode("Some message to code", 1));
//        System.out.println(cezarCode("Some message to code", 2));
        String superCoddedMessage = cezarCode("Some message to code", 3);
        System.out.println(superCoddedMessage);
        System.out.println(cezarDecode(superCoddedMessage));
//        System.out.println(cezarCode("Some message to code", 4));
    }

    public static String cezarCode(String messageToCode, int offset) {
        return cezarCoder(messageToCode, offset);
    }

    public static String cezarDecode(String messageToCode, int offset) {
        return cezarCoder(messageToCode, -offset);
    }

    public static String cezarCode(String messageToCode) {
        return cezarCoder(messageToCode, 1);
    }
    public static String cezarDecode(String coddedMessage) {
        return cezarCoder(coddedMessage, -1);

    }

    private static String cezarCoder(String message, int offset) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] += offset;
        }
        return String.valueOf(charArray);
    }
}
