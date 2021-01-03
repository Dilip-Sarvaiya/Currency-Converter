/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compute;

import javax.ejb.Stateless;

/**
 *
 * @author Dilip J Sarvaiya
 */
@Stateless
public class Computation {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public Computation(){}
    public double r2Dollor(double r)
    {
    return r/65.65;
    }
    public double d2Rupees(double d)
    {
    return d*65.65;
     }
}
