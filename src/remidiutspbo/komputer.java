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
public class komputer {
    private CPU cpu;
    public komputer(CPU cpu){
        this.cpu = cpu;
    }
    
    public komputer(){
    }
    
    public void memasang(CPU cpu){
        System.out.println("CPU: "+cpu.getCPUDAta()+" dipasang");
    }
    
    public void melepas(CPU cpu){
        System.out.println("CPU: "+cpu.getCPUDAta()+" dicabut");
    }
    
    public void cetakInfo(CPU cpu){
        System.out.println("Spesifikasi: CPU: "+cpu.getCPUDAta()+"");
    }
}
