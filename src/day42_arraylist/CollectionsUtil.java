package day42_arraylist;
import java.util.*;
public class CollectionsUtil {
    public static void main(String[] args) {
     List<Character> letters = new ArrayList<>();
     letters.addAll(Arrays.asList('j' , 'a' , 'v' , 'a' , 'i' , 's' , 'f' , 'u' , 'n'));
        System.out.println("size = " + letters.size());
        System.out.println(letters);

        Collections.reverse(letters);
        System.out.println("reversed =" + letters);

        System.out.println("Collections.frequency(letters , 'a') = " + Collections.frequency(letters, 'a'));
        // frequency shows how many items is in the string-Character or etc

        int Vcount = Collections.frequency(letters,'v');
        System.out.println("Vcount = " + Vcount);

        System.out.println("max char = " + Collections.max(letters)); // it gives you highest character according to ASCI numbers
        System.out.println("min char = " + Collections.min(letters));

        Collections.reverse(letters);
        Collections.replaceAll(letters,'a','u'); // replacing all the 'a' characters with 'u'.
        System.out.println("after replace all = " + letters);
        Collections.sort(letters);
        System.out.println("Sorted letters" + letters);
        
        List<Integer> nums = Arrays.asList(23,1,43,5,5,5,5,234,7,-9,0);

        System.out.println("nums = " + nums);
        Collections.reverse(nums);
        System.out.println("nums = " + nums);
        System.out.println("Collections.max(nums) = " + Collections.max(nums));
        System.out.println("Collections.min(nums) = " + Collections.min(nums));
        System.out.println("number of 5 in nums" + Collections.frequency(nums, 5));
        Collections.replaceAll(nums, 5, 50);
        System.out.println("replacing 5 with 50 = " + nums);

        Collections.sort(nums);
        System.out.println("Sorted nums = " + nums);

        Collections.sort(nums,Collections.reverseOrder());
        System.out.println("after reverse sort = " + nums);

        Collections.shuffle(nums);
        System.out.println("shuffle nums = " + nums);
    }
    }
