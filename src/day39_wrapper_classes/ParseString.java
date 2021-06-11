package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {
        String total = "345";
        int count = Integer.parseInt(total);
        System.out.println("count = " + count);
        double db = Double.parseDouble(total);
        System.out.println("db = " + db);

        String strPrice = "123.5";
        double price = Double.parseDouble(strPrice);
        if(price>100){
            System.out.println("expensive");
        }
        String sentence = "I wrote 100 lines of code";
        String [] newSentence = sentence.split(" ");
        int num = Integer.parseInt(newSentence[2]);
        System.out.println("num = " + num);
    }
}
