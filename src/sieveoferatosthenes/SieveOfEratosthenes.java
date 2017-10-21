/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sieveoferatosthenes;

/**
 *
 * @author Shishir
 */
public class SieveOfEratosthenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    }

}

/**
 * Class SieveNum will store the number and a flag value to check if this number
 * was flagged as not a prime number in any iteration..
 */
class SieveNum {

    int num;
    boolean flag;

    public SieveNum(int num, boolean flag) {
        this.num = num;
        this.flag = flag;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "SieveNum{" + "num=" + num + ", flag=" + flag + '}';
    }

}
