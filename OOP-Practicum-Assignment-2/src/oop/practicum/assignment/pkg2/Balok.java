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
public class Balok extends PersegiPanjang implements MenghitungRuang{
    private double height;
    
    public Balok(double Length, double Width, double Height){
        super(Length, Width);
        height = Height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public double surfacearea() {
        return 2 * (super.wide() + (super.getLength() * height) + (super.getWidth() * height));
    }

    @Override
    public double volume() {
        return super.wide() * this.height;
    }
    
}
