/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class Admin extends User{
    @Override
    public void setRole(){
        this.role = "admin";
    }
    public Admin(){
        setRole();
    }
}
