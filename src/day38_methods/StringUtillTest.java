package day38_methods;
import sun.security.util.ArrayUtil;

import java.util.Arrays;

import static day38_methods.StringUtils.*;

public class StringUtillTest {
    public static void main(String[] args) {
        String userName = "";
        if (StringUtils.isNullorEmpty(userName)) {
            System.out.println("username can't be null or empty");
        }
        String str = "civic";
        if (StringUtils.isPalindrom(str)) {
            System.out.println("its Palindrom");
        }
        System.out.println("isPalindrom(cybertek) = " + isPalindrom("cybertek"));

        String word = "java";
        String revWord = StringUtils.reverse(word);
        System.out.println("word = " + word);
        System.out.println("revWord = " + revWord);
        int [] nums = {2,3,4,5};
        StringUtils.ArrayUtills(nums);
        //System.out.println(Arrays.toString(nums));
        int [] nums2 = {4,1,5,8};

        System.out.println("5 - found = " + StringUtils.contains(nums2, 4));
        System.out.println("10 - found = " + StringUtils.contains(nums2, 10));
    }
        }

