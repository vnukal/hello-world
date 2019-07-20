/*
 * Copyright (c) 2019. Vishwanath Nukal
 */

package org.sgn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StockPriceMaxTest {

    @org.junit.jupiter.api.Test
    void getMaxProfit() {
        int[] stockPrices = {310,315,275,295,260,270,290,230,255,250};

        assertEquals(StockPriceMax.getMaxProfit(stockPrices),30);
    }

    @org.junit.jupiter.api.Test
    void getMaxProfit2Values() {
        int[] stockPrices = {310,315};

        assertEquals(StockPriceMax.getMaxProfit(stockPrices),5);
    }

    @org.junit.jupiter.api.Test
    void getMaxProfit1Value() {
        int[] stockPrices = {310};

        assertThrows(IllegalArgumentException.class, () -> StockPriceMax.getMaxProfit(stockPrices));
    }

    @org.junit.jupiter.api.Test
    void getMaxProfit_NoProfit() {
        int[] stockPrices = {315, 250};

        assertEquals(StockPriceMax.getMaxProfit(stockPrices), 0);
    }

}