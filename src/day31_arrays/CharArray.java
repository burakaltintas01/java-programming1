package day31_arrays;

public class CharArray {
    public static void main(String[] args) {
        char [] letters = {'j','a','v','a', ' ', 'i', 's', 'f', 'u', 'n'};
        for(char i =0 ; i<letters.length ; i++){
            System.out.println(letters[i]);
        }
        String sentence =new String(letters);
        System.out.println("letter = " + sentence);
        System.out.println("********************");

        String item = "wooden spoon";
        char [] charItem = item.toCharArray();
        System.out.println("charItem.lenght = "+ charItem.length);
        System.out.println("item.lenght = "+item.length());

        String [] fruits = {"bananas","apples","kiwi","mango","papaya","strawberry"};
        for(int fruit = 0 ; fruit<fruits.length ;fruit++ ){
            System.out.print(fruits[fruit]+"-");
        }
        String[] languages = {"java", "python" , "c++", "sql", "ruby", "javascript"};
        System.out.println();
        System.out.println(String.join("|",languages));
        System.out.println(String.join("**",languages));
        String joinedLanguages = String.join("<>", languages);
        System.out.println("joined languages = " + joinedLanguages);


    }
}
