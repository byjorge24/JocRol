/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joc;

/**
 *
 * @author alumne
 */
public abstract class Player {
    
    private int puntsA;
    private int puntsD;
    private int puntsV;
    
    public Player(){
        
        this.puntsA = puntsA;
        this.puntsD = puntsD;
        this.puntsV = puntsV;
        
    }

    /**
     * @return the puntsA
     */
    public int getPuntsA() {
        return puntsA;
    }

    /**
     * @param puntsA the puntsA to set
     */
    public void setPuntsA(int puntsA) {
        this.puntsA = puntsA;
    }

    /**
     * @return the puntsD
     */
    public int getPuntsD() {
        return puntsD;
    }

    /**
     * @param puntsD the puntsD to set
     */
    public void setPuntsD(int puntsD) {
        this.puntsD = puntsD;
    }

    /**
     * @return the puntsV
     */
    public int getPuntsV() {
        return puntsV;
    }

    /**
     * @param puntsV the puntsV to set
     */
    public void setPuntsV(int puntsV) {
        this.puntsV = puntsV;
    }
    
    
    
}
