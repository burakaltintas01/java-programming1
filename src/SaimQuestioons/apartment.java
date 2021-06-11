package SaimQuestioons;

public class apartment {
    public static void main(String[] args) {
        /*Create the variables with the most appropriate datatype:

        - address, name of owner, number of units, average size of each unit, monthly rent amount,
         number of washers and driers, allows pets or not, has a pool, length of lease, total number of residents in building, 
         phone number of owner, is near a gas station, number of floors, has a basement, has available units for rent,
          has air conditioning, number of parking spaces, has wheel chair access, number of review stars (out of 5)
         */
        String adress = "2742 jeanetta rd";
        String nameofOwner = "Burak;";
        int unitNumbers = 50;
        float AverageSizeofEachUnit = 100.50F;
        double monthlyRentAmount = 1200;
        int NumberofWashersDryers = 2;
        Boolean BooAllowPets = false;
        Boolean BoohasPool = true;
        byte LenghtofLease = 5;
        int intTotalNumberOfResidents = 250;
        long longPhoneNumberofOwner = 832646887;
        Boolean BooleanGasStationNearBy = true;
        byte numberofFloors = 2;
        Boolean Booleanhasairconditioning = true;
        int intNumberofReviewStars = 5;
        double RentAfter3Years = monthlyRentAmount-monthlyRentAmount*10/100;
        Double RentAfter6Years = monthlyRentAmount-monthlyRentAmount*20/100;
        int AveNumofResidentsPerUnit = intTotalNumberOfResidents/unitNumbers;

        System.out.println("Adress:                        "+adress);
        System.out.println("Name of owner:                 "+ nameofOwner);
        System.out.println("Unit number:                   "+ unitNumbers);
        System.out.println("Averega size of each unit :"   + AverageSizeofEachUnit);
        System.out.println("Monthly Rent Amount:           "+ "$"+monthlyRentAmount);
        System.out.println("Number of Washers and Dryers:  "+ 2);
        System.out.println("Pets Allowed :                 "+ BooAllowPets);
        System.out.println("It has pool :                  "+ BoohasPool);
        System.out.println("Lenght of Lease :              "+ 5);
        System.out.println("Total number of Residents:     "+ intTotalNumberOfResidents);
        System.out.println("Phone Number of Owner :        "+ longPhoneNumberofOwner);
        System.out.println("Gas Station Near By:           "+BooleanGasStationNearBy);
        System.out.println("Number of Floors:              "+ numberofFloors);
        System.out.println("It has Air Conditioning:       "+ Booleanhasairconditioning);
        System.out.println("Number of Review Stars         "+ intNumberofReviewStars);
        System.out.println("Discounted price after 3 years:  "+   "$"+RentAfter3Years);
        System.out.println("Discounted Price After 6 Years   "+"$"+   RentAfter6Years);
        System.out.println("Average number of residents per unit:  "+ AveNumofResidentsPerUnit);


    }
}
