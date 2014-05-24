/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.akhona.designpatterns.behavioral.strategy;

/**
 *
 * @author Davinci
 */
public class Animal {
            
    private String name;
    private String sound;
    public Flys flyType;
    public Animal(){}

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
    
    public String tryAndFly()
    {
        return flyType.fly();
    }
    
    public void setAbility( Flys newFlys )
    {
        flyType = newFlys;
    }
    
    
}
