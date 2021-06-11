package SaimQuestioons;

public class HouseType {
    public static void main(String[]args){
        // house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?,
        // is there an attic, is there a pool, is the house for sale?, cost of the house, address, zipcode,
        // is a park near by, Rating of surrounding school districts (out of 5),
        String type = "dublex";
        byte bedrooms = 5;
        byte bathrooms = 2;
        byte kitchen = 2;
        Boolean isBasement = true;
        String attic = "yes";
        String pool = "yes";
        Boolean isForSale= false;
        Float cost = 1000000F;
        String adress = "Soguksu mah. zirve sok. TRABZON";
        double Zipcode = 61000;
        Boolean isPark = true;
        int ratingOutof5 = 5;
        System.out.println("House type:                            "+                            type);
        System.out.println("Number of bedrooms:                    "+                   bedrooms);
        System.out.println("Number of bathrooms:                   "+                  bathrooms);
        System.out.println("Number of kitchens                     "+                    kitchen);
        System.out.println("Is there a basement?                   "+                  isBasement);
        System.out.println("is there an Attic?                     "+                    attic);
        System.out.println("Is there a pool                        "+                       pool);
        System.out.println("Is it for sale                         "+                        isForSale);
        System.out.println("What is the price?                     "+                    cost);
        System.out.println("What is the adress?                    "+ adress);
        System.out.println("What is zipcode ?                      "+ Zipcode);
        System.out.println("Is there a park nearby?                " +isPark);
        System.out.println("What is the rating of neighborhood:    "+   ratingOutof5);





    }
}
