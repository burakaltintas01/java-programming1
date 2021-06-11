package day16_Switch_Ternary;

public class FloorSelector {
    public static void main(String[] args) {
        int floorNum = 1;
        if( floorNum == 1) {
            System.out.println("Floor 1 is selected. Companies : Verizon , Starbucks , QuikFixx");
        } else if (floorNum == 2) {
            System.out.println("Floor 2 selected. Companies : Nasa , Cybertek , Intelsa");
        }else if (floorNum== 3) {
            System.out.println("Floor 3 selected. Companies : Lyft, BOFA , Steakhouse");
        }else {
            System.out.println("Invalid floor -6");
        }
        floorNum= 9;
        switch(floorNum){
            case 1:
                System.out.println("Floor 1 is selected. Companies : Verizon , Starbucks , QuikFixx");
                break; // exit switch
            case 2:
                System.out.println("Floor 2 selected. Companies : Nasa , Cybertek , Intelsa");
                break; // exit the switch statement
            case 3:
                System.out.println("Floor 3 selected. Companies : Lyft, BOFA , Steakhouse");
                break;
            default:
                System.out.println("invalid floor = " + floorNum);
                break;
        }

        }
    }