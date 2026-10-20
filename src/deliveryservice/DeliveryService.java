/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deliveryservice;

public class DeliveryService {

    public static void main(String[] args) {
        Package p1= new Package("Sıla", "Kızıltoprak", "Antalya", "Muratpaşa", "07300", 16.2, 4.0, "Fadwa", "Mevlana", "Kayseri", "Talas", "38200");
        TwoDayPackage td1= new TwoDayPackage("Sıla", "Kızıltoprak", "Antalya", "Muratpaşa", "07300", 16.2, 4.0, "Fadwa", "Mevlana", "Kayseri", "Talas", "38200",5.0);
        OvernightPackage on1= new OvernightPackage("Sıla", "Kızıltoprak", "Antalya", "Muratpaşa", "07300", 16.2, 4.0, "Fadwa", "Mevlana", "Kayseri", "Talas", "38200",1.75);
        
        
        System.out.println("_______Standard Package_______");
        System.out.println("Sender Name: " +p1.SName + " | Adress: " + p1.Sadress + " | City: " + p1.Scity + " | State: " + p1.Sstate + "| Zip Code: " + p1.Szipcode);
        System.out.println("Recipient Name: " +p1.RName + " | Adress: " + p1.Radress + " | City: " + p1.Rcity + " | State: " + p1.Rstate + "| Zip Code: " + p1.Rzipcode);
        System.out.println("Weight: " + p1.weight + " | Cost: " + p1.cost + "₺");
        System.out.println("Total Shipping Cost: " + p1.calculateCost() + "₺");
        System.out.println("");
        
        System.out.println("_______Two Day Package_______");
        System.out.println("Sender Name: " +td1.SName + " | Adress: " + td1.Sadress + " | City: " + td1.Scity + " | State: " + td1.Sstate + "| Zip Code: " + td1.Szipcode);
        System.out.println("Recipient Name: " +td1.RName + " | Adress: " + td1.Radress + " | City: " + td1.Rcity + " | State: " + td1.Rstate + "| Zip Code: " + td1.Rzipcode);
        System.out.println("Weight: " + td1.weight + " | Cost: " + td1.cost + "₺");
        System.out.println("Flat Fee: " + td1.flatfee +"₺");
        System.out.println("Total Shipping Cost: " + td1.calculateCost() + "₺");
        System.out.println("");
        
        System.out.println("_______Overnight Package_______");
        System.out.println("Sender Name: " +on1.SName + " | Adress: " + on1.Sadress + " | City: " + on1.Scity + " | State: " + on1.Sstate + "| Zip Code: " + on1.Szipcode);
        System.out.println("Recipient Name: " +on1.RName + " | Adress: " + on1.Radress + " | City: " + on1.Rcity + " | State: " + on1.Rstate + "| Zip Code: " + on1.Rzipcode);
        System.out.println("Weight: " + on1.weight + " | Cost: " + on1.cost + "₺");
        System.out.println("Additional Fee: " + on1.additionalfee + "₺");
        System.out.println("Total Shipping Cost: " + on1.calculateCost() + "₺");
        System.out.println("");
    }
    
}
