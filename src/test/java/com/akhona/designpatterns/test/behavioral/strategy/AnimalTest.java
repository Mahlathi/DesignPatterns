/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.akhona.designpatterns.test.behavioral.strategy;

import com.akhona.designpatterns.behavioral.strategy.Animal;
import com.akhona.designpatterns.behavioral.strategy.Bird;
import com.akhona.designpatterns.behavioral.strategy.Cat;
import org.junit.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Davinci
 */
public class AnimalTest {
    
    public AnimalTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testAnimal() 
    {
        Animal mutwo = new Cat();
        Animal tweety = new Bird();
        
        Assert.assertEquals(  "I'm flying high!", tweety.tryAndFly());
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
