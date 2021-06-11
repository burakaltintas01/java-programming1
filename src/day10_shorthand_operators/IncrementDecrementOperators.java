package day10_shorthand_operators;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int p = 1;
        p ++;
        System.out.println("p = " + p);
        ++p;
        System.out.println("p = " + p);
        
        int linesOfCode = 15;
        System.out.println("linesOfCode = " + linesOfCode);
        linesOfCode ++;
        ++ linesOfCode;
        ++linesOfCode;
        linesOfCode = linesOfCode+1;
        System.out.println("linesOfCode = " + linesOfCode);
        
        char letter = 'a';
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        letter++;
        ++letter;
        System.out.println("letter = " + letter);

        long a = 30L;
        short b = (short)a;
    }
}
