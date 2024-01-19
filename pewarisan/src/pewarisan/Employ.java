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
    public class Employ extends person {
        private String NIK;
        public Employ (String V_NIK, String nama, int usia){
            super(nama, usia);
            this.NIK = V_NIK;
                    }
        public void info(){
            System.out.println("NIK : "+ this.NIK);
            super.info();
        }
    }

