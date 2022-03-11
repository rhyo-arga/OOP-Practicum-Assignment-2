/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.practicum.assignment.pkg2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choose, loop=0;
        double l, w, h, r;
        
        do{
            System.out.println("=========");
            System.out.println("Main Menu");
            System.out.println("=========");
            System.out.println("1. Calculate Cuboid");
            System.out.println("2. Calculate Cylinder");
            System.out.println("0. Exit");
            System.out.print("Choose : ");
            choose = input.nextInt();
            
            if(choose == 1){
                System.out.print("Input Length : ");
                l = input.nextDouble();
                System.out.print("Input Width  : ");
                w = input.nextDouble();
                System.out.print("Input Height : ");
                h = input.nextDouble();
                
                Balok cuboid = new Balok(l, w, h);
                
                System.out.println("Circumference of Rectangle : " + cuboid.circumference());
                System.out.println("Area of Rectangle          : " + cuboid.wide());
                System.out.println("Surface Area of Cuboid     : " + cuboid.surfacearea());
                System.out.println("Volume of Cuboid           : " + cuboid.volume());
                System.out.print("Back to Main Menu? (Yes : 1 || No : 0) : ");
                loop = input.nextInt();
            }else if(choose == 2){
                System.out.print("Input Radius : ");
                r = input.nextDouble();
                System.out.print("Input Height : ");
                h = input.nextDouble();
                
                Tabung cylinder = new Tabung(r, h);
                
                System.out.println("Circumference of Circle      : " + cylinder.circumference());
                System.out.println("Area of Circle               : " + cylinder.wide());
                System.out.println("Surface Area of Cylinder     : " + cylinder.surfacearea());
                System.out.println("Volume of Cylinder           : " + cylinder.volume());
                System.out.print("Back to Main Menu? (Yes : 1 || No : 0) : ");
                loop = input.nextInt();
            }else if(choose == 0) {
                System.out.println("=========");
                System.out.println("Thank You");
                System.out.println("=========");
                return;
            }
        }while(loop == 1 && choose != 0);
        
        System.out.println("=========");
        System.out.println("Thank You");
        System.out.println("=========");
    }
    
}
