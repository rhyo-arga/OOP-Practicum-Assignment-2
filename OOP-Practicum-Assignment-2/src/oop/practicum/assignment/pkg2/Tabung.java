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
public class Tabung extends Lingkaran implements MenghitungRuang {
    private double height;
    
    public Tabung(double r, double Height){
        super(r);
        this.height = Height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public double surfacearea() {
        return 2 * 3.14 * super.getRadius() * (super.getRadius() + height);
    }

    @Override
    public double volume() {
        return super.wide() * height;
    }
    
}
