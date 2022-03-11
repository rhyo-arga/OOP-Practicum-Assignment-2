/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.practicum.assignment.pkg2;

/**
 *
 * @author ASUS
 */
public class Lingkaran implements MenghitungBidang {
    private double radius;
    
    public Lingkaran(double Radius){
        this.radius = Radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double circumference() {
        return 2 * 3.14 * radius;
    }

    @Override
    public double wide() {
        return 3.14 * radius * radius;
    }
    
}
