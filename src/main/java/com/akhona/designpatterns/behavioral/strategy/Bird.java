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
public class Bird extends Animal{
    
    public Bird()
    {
        setSound("Tweet");
        flyType = new CanFly();
    }
}
