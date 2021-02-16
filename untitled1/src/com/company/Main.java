package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);

     int n = scanner.nextInt();

     int d,q,x,y;

     ArrayList[] set = new ArrayList[n];

     for(int i=0;i<n;i++){

         d = scanner.nextInt();
         set[i] = new ArrayList();

         for(int j=0;j<d;j++){
             set[i].add(scanner.nextInt());

         }
     }


        q = scanner.nextInt();

     for(int z=0 ; z< q;z++){
         x= scanner.nextInt();
         y= scanner.nextInt();

         try{
             System.out.println(set[x-1].get(y-1));
         }catch (Exception exception){
             System.out.println("ERROR!");
         }


     }





    }
}



