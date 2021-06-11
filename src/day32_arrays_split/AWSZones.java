package day32_arrays_split;

import java.util.Arrays;

public class AWSZones {
    public static void main(String[] args) {
        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";
        System.out.println("-----Starting deployment of etsy app to AWS zones...");
        String [] newzone = zones.split(",");
        for(String Str : newzone){
            System.out.println("Deploying etsy to-"+ Str);
            System.out.println("Deployment completed for "+Str);
        }
        System.out.println("---All deployments are completed---");


    }
}
