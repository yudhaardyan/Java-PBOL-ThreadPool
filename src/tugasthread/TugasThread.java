/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasthread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author Yudha Ardyan
 */
public class TugasThread {
public String angka;

public void setName(String newName){
    angka = newName;
}
    public String getName(){
        return angka;
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ExecutorService service=Executors.newFixedThreadPool(6);
for (int i = 1; i <=5; i++){
    System.out.println("Thread Sudah Selesai");
    service.submit(new NewClass(i));
    TugasThread testangka=new TugasThread();
    testangka.setName(" adalah bilangan ganjil");
    for (int angka = 1; angka <100; angka=angka+2){
        System.out.println(angka+testangka.getName());
        
    }
}
System.out.println("=============Semua Task Sudah Dieksekusi=========");
service.shutdown();

try{
    service.awaitTermination(1, TimeUnit.DAYS);
}catch(InterruptedException e){
    e.printStackTrace();
}
System.out.println("==================SELESAI========================");
    }
    
}
