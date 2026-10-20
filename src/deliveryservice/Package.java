/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deliveryservice;

/**
 *
 * @author Sıla
 */
public class Package {
    protected String SName;
    protected String Sadress;
    protected String Scity;
    protected String Sstate;
    protected String Szipcode;
    protected double weight;
    protected double cost;
    protected String RName;
    protected String Radress;
    protected String Rcity;
    protected String Rstate;
    protected String Rzipcode;

    public Package(String SName, String Sadress, String Scity, String Sstate, String Szipcode, double weight, double cost, String RName, String Radress, String Rcity, String Rstate, String Rzipcode) {
        this.SName = SName;
        this.Sadress = Sadress;
        this.Scity = Scity;
        this.Sstate = Sstate;
        this.Szipcode = Szipcode;
        this.weight = weight;
        this.cost = cost;
        this.RName = RName;
        this.Radress = Radress;
        this.Rcity = Rcity;
        this.Rstate = Rstate;
        this.Rzipcode = Rzipcode;
    }
    public double calculateCost(){
        return weight*cost;
    }
}
