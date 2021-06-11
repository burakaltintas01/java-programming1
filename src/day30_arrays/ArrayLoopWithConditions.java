package day30_arrays;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {
        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};

        String[] countries = {"Brazil",
                "China",
                "Cuba",
                "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Brazil",
                "Portugal",
                "China",
                "Philippines",
                "Philippines",
                "China",
                "Philippines",
                "China",
                "Philippines",
                "China",
                "Colombia",
                "Philippines",
                "Honduras",
                "Indonesia",
                "Brazil",
                "China",
                "United States",
                "Russia"};
        for (double NewPrices : prices) {
            if (NewPrices > 100.00) {
                System.out.println("only more than 100= " + " " + NewPrices);
            }
            System.out.println("************************");
            for (double EachPrices : prices) {
                if (EachPrices > 10 && EachPrices < 70) {
                    System.out.println("prices between 10-70 = " + EachPrices);

                }

            }
        }
        System.out.println("*********");
        int count = 0;
        for (double Num : prices) {
            if (Num > 50) {
                count++;
            }

        }
        System.out.println("count = " + count);
        System.out.println("*****************");
        for(String size : countries){
            if(size.length()>=7){
                System.out.println(size);
            }
        }
    }
}