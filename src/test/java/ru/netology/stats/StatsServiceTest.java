package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void sholdSumSales() {
        StatsService service=new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual=service.sumSales(sales);

        assertEquals(expected,actual);


    }

    @Test
    void shouldAverageSalePerMonth() {
        StatsService service=new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual=service.averageSalePerMonth(sales);

        assertEquals(expected,actual);
    }

    @Test
    void shouldMounthWhithMinSale() {
        StatsService service=new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual=service.mounthWhithMinSale(sales);

        assertEquals(expected,actual);
    }

    @Test
    void shouldMounthWhithMaxSale() {
        StatsService service=new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual=service.mounthWhithMaxSale(sales);

        assertEquals(expected,actual);
    }

    @Test
    void shouldCalculateMonthWhithSaleUnderAverage() {
        StatsService service=new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual=service.calculateMonthWhithSaleUnderAverage(sales);

        assertEquals(expected,actual);
    }

    @Test
    void shouldCalculateMonthWhithSaleOverAverage() {
        StatsService service=new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual=service.calculateMonthWhithSaleOverAverage(sales);

        assertEquals(expected,actual);
    }
}