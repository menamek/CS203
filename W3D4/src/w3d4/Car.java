/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d4;

import java.io.Serializable;

/**
 *
 * @author mena
 */
public class Car implements Serializable {
	private int x=0;
	private int y=0;
	
	public void setx(int x) {
        this.x = x;
    }
	public void sety(int y) {
        this.y = y;
    }
    
    public int getX() {
        return  x;
    }

    public int getY() {
        return y;
    }
    
    public void moveup(){
    	this.y=y+2;
    }
    
    public void moveDown(){
    	this.y=y-4;
    }
    
    public void moveLeft(){
    	this.x=x-2;
    }
    
    public void moveRight(){
    	this.x=x+4;
    }
    
    public void printLocation(){
    	System.out.println(this.x+" "+this.y);
    }
    

}
