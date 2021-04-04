//Find the hexadecimal equivalent for a given 4-digit binary number.

import java.util.Scanner;
class binarytohex {
 public static void main(String[] args) 
 {
  int[] hex = new int[1000];
  int i = 1, j = 0, reminder, dec = 0, binary;
  Scanner in = new Scanner(System.in);
  System.out.print("Binary Number: ");
  binary = in.nextInt();
  while (binary > 0) {
   reminder = binary % 2;
   dec = dec + reminder * i;
   i = i * 2;
   binary = binary / 10;
  }
   i = 0;
  while (dec != 0) {
   hex[i] = dec % 16;
   dec = dec / 16;
   i++;
  }
  System.out.print("HexaDecimal Number: ");
  for (j = i - 1; j >= 0; j--)
  {
   if (hex[j] > 9) 
   {
    System.out.print((char)(hex[j] + 55)+"\n");
   } else
   {
    System.out.print(hex[j]+"\n");
   }
  }
 }
}