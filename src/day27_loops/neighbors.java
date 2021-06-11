package day27_loops;

public class neighbors {
    public static void main(String[] args) throws InterruptedException {
        String word = "jaavvaa";
        for(int index = 0 ; index < word.length()-1 ; index++){
            System.out.print(word.charAt(index));
            System.out.println(word.charAt(index+1));
            Thread.sleep(100);
            if(word.charAt(index)== word.charAt(index+1)) {
                System.out.println("beep - " + word.charAt(index));
            }else{
                System.out.println("not beep");
            }
        }

    }
}
