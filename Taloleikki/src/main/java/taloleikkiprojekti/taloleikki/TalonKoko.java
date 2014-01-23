/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package taloleikkiprojekti.taloleikki;

/**
 *
 * @author nepe@cs
 */
public class TalonKoko {
    int pohjanPituus;
    int pohjanLeveys;
    
    public TalonKoko(int pohjanPituus, int pohjanLeveys){
    this.pohjanLeveys = pohjanLeveys;
    this.pohjanPituus = pohjanPituus;
}
    //public TalonKoko getTalonKoko() {
    //    return 
    //}
    
    public int getPohjanLeveys() {
        return this.pohjanLeveys;
    }   
    
    public int getPohjanPituus() {
        return this.pohjanPituus;
    }
    
    
    @Override
    public String toString() {
        return "Pohjan pituus on " + this.pohjanPituus + " ja pohjan leveys on " + this.pohjanLeveys;
    }
    
}
