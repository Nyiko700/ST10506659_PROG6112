/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.iconsoles;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public interface IConsoles {
    
    // Interface
    String getConsoleType();
    String getStore();
    int getTotalSales();
}

// Abstract Console Clss
abstract class Console implements IConsoles{
    
    private String consoleType;
    private String store;
    private int totalSales;
    
    public Console(String consoleType, String store, int totalSales){
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }
    
    
    public String getConsoleType(){
        return consoleType;
    }
    
    public String getStore(){
        return store;
    }
    
    public int getTotalSales(){
        return totalSales;
    }
}

class ConsoleSales extends Console{
    
    public ConsoleSales (String consoleType, String store, int totalSales){
        super(consoleType, store, totalSales);
    }
    
    public void printReport(){
        
        System.out.println();
        System.out.println("--------------------------");
        System.out.println("   CONSOLE SALES REPORT");
        System.out.println("--------------------------");
        
        System.out.println("Console Type: " + getConsoleType());
        System.out.println("Store Name: " + getStore());
        System.out.println("Total Sales: " + getTotalSales());
    }

}

public class RunApplication{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("-----------------------------");
        System.out.println("   ELECTRONIC STORE");
        System.out.println("-----------------------------");
        
        System.out.println("Select Console Type: ");
        System.out.println("1. PS5");
        System.out.println("2. XBOX");
        System.out.println("3. nINTENDO Switch");




        
        
    }
}