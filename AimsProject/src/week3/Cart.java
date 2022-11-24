package week1;

import java.util.Iterator;

public class Cart {
   public static final int MAX_NUMBERS_ORDERED = 20;
   private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
   private int qtyOrdered = 0;

   void addDigitalVideoDisc(DigitalVideoDisc disc) {
      if (qtyOrdered == MAX_NUMBERS_ORDERED) {
         System.out.println("The cart is already full");
      } else {
         this.itemOrdered[qtyOrdered] = disc;
         qtyOrdered++;
         System.out.println("The disc has been added");
      }
   }
   
   void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
	         for (int i = 0; i < dvdList.length; i++) {
	        	 this.itemOrdered[qtyOrdered] = dvdList[i];
	        	 qtyOrdered++;
	        	 if (qtyOrdered == MAX_NUMBERS_ORDERED) {
	    	         System.out.println("The cart is already full");
	    	         break;
	    	      }
	      }
	         System.out.println("The disc has been added");
	   }
   
   void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){
	   if (qtyOrdered == MAX_NUMBERS_ORDERED) {
	         System.out.println("The cart is already full");
	      } else {
	         this.itemOrdered[qtyOrdered] = dvd1;
	         qtyOrdered++;
	         System.out.println("The dvd1 has been added");
	         if (qtyOrdered == MAX_NUMBERS_ORDERED) {
		         System.out.println("The cart is already full");
		      } else {
		         this.itemOrdered[qtyOrdered] = dvd2;
		         qtyOrdered++;
		         System.out.println("The dvd2 has been added");
		      }
	      }
 }

   public int getQtyOrdered() {
      return qtyOrdered;
   }

   void removeDigitalVideoDisc(DigitalVideoDisc disc) {
      if (qtyOrdered == 0) {
         System.out.println("The cart is null");
      } else {
         for (int i = 0; i < qtyOrdered; i++) {
            if (this.itemOrdered[i] == disc) {
               this.itemOrdered[i] = this.itemOrdered[qtyOrdered - 1];
               this.itemOrdered[qtyOrdered - 1] = null;
               qtyOrdered--;
            }
         }
         System.out.println("The disc has been deleted");
      }
   }

   float totalCost() {
      float sum = 0;
      for (int i = 0; i < qtyOrdered; i++) {
         sum += this.itemOrdered[i].getCost();
      }
      return sum;
   }
}