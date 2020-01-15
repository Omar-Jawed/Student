/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 ** A class to model Student Objects
 * each student has: a name (first and last name)
 * each student can: say their name (getName)

 * @author Sivagama
 */
public class StudentDemo {

    private String name;
    private int sid;

    //constructor
    public StudentDemo(String givenName,int n)
    {
        name=givenName;
        sid = n;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String givenName) {
        name = givenName;
    }
	public int getSid() {
		// TODO Auto-generated method stub
		return sid;
	}
    
    
}
