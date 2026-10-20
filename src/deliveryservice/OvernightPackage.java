/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deliveryservice;

/**
 *
 * @author Sıla
 */
public class OvernightPackage extends Package{
    protected double additionalfee;
    
    public OvernightPackage(String SName, String Sadress, String Scity, String Sstate, String Szipcode, double weight, double cost, String RName, String Radress, String Rcity, String Rstate, String Rzipcode,double additionalfee) {
        super(SName, Sadress, Scity, Sstate, Szipcode, weight, cost, RName, Radress, Rcity, Rstate, Rzipcode);
        this.additionalfee=additionalfee;
    }
    @Override
    public double calculateCost(){
        return super.calculateCost()+(super.weight*additionalfee);
    }
    
}
