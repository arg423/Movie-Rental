/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierental;

/**
 *
 * @author 12dow_000
 */
public class Actor {
    private String name;
    private Enum gender;
    public Actor(String name, Enum gender){
        this.name = name;
        this.gender = gender;
    }  
    
    public String getName(){
        return this.name;
    }
    
    public Enum getGender(){
        return this.gender;
    }
}
