
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author deoka
 */
public class MyCapAssi {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of minutes : ");
    int minutes = input.nextInt();
    int year = minutes / 525600;
    int day = minutes / 1440;
    int remainingMinutes = day % 525600;
    System.out.println("The Ans is : " + year + " years and "  +  remainingMinutes + " days ");
    }

}
