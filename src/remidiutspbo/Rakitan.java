/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remidiutspbo;

/**
 *
 * @author FAREMA
 */
public class Rakitan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AMD amd1 = new AMD(0);
        intel intel1 = new intel(0);
        komputer komputer1 = new komputer();
        komputer1.cetakInfo(intel1);
        komputer1.melepas(intel1);
        komputer1.memasang(amd1);
        komputer1.cetakInfo(amd1);
    }
    
}
