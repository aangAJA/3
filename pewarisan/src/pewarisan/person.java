/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pewarisan;

/**
 *
 * @author MOKLET016
 */
public class person {
    private String nama;
    private int usia;
    public person (String Vnama, int Vusia){
        this.nama = Vnama;
        this.usia = Vusia;
        
    }
public void info (){
    System.out.println("Nama : "+ this.nama);
    System.out.println("Usia : "+ this.usia);
}
}
