/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.moodel;

/**
 *
 * @author samuk
 */
public class Divide implements DivideInterface {

    @Override
    public Integer divide(Integer num1, Integer num2) {
        return num1 / num2;
    }

}
