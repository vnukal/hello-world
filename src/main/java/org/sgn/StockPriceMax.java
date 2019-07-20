/*
 * Copyright (c) 2019. Vishwanath Nukal
 */

package org.sgn;

public class StockPriceMax {


    public static void main(String[] args) {

        int[] stockPrices = {310,315,275,295,260,270,290,230,255,250};

        System.out.println(getMaxProfit(stockPrices));
    }

    public static int getMaxProfit(int[] stockPrice)
    {
        if(stockPrice.length<2)
            throw new IllegalArgumentException("Need at least two prices to compute getMaxProfit");

        int maxProfit = stockPrice[1] - stockPrice[0];
        int minPrice = Math.min(stockPrice[0],stockPrice[1]);

        for(int i=1;i<stockPrice.length;i++)
        {


            int potentialProfit = stockPrice[i]-minPrice;

            maxProfit = (potentialProfit > maxProfit) ? potentialProfit : maxProfit;

            minPrice = Math.min(stockPrice[i],minPrice);

        }
        return maxProfit;
    }
}
