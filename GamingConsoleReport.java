/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingconsolereport;

/**
 *
 * @author Student
 */
public class GamingConsoleReport {

   public static void main(String[] args){
       
       String[] cities = { "Cape Town", "Port Elizabeh", "Pretoria"};
   
       String[] console = { "PS5", "XBOX", "SWITCH"};
   
       int[][] sales = { { 1000, 2000, 3000}, { 2000, 3000, 4000}, { 1500, 1100, 1200} };
   
       System.out.println("----------------");
       System.out.println("GAMING CONSOLE REPORT");
       System.out.println("-----------------");
   
       int highestSales = 0;
       String cityWithMostSales = "";
       
       for (int i = 0; i < sales.length; i++){
           
           int total = 0;
           
           for(int j = 0; j < sales[i].length; j++){
               total += sales[i][j];
               
           }
           System.out.println(cities[i] + "    " + total);
           
           if (total > highestSales){
               highestSales = total;
               cityWithMostSales = cities[i];
           }
           
       }
       System.out.println();
       System.out.println("CITY WITH MOST SALES: " + cityWithMostSales);
       System.out.println("-------------------------------");
   }
  
}
