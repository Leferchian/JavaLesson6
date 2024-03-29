package ru.netology.stats;

public class StatsService {
    public int sumSales(int[] sales) {
        int allSum = 0;
        for (int sale : sales) {
            allSum += sale;
        }
        return allSum;
    }

    public int averageSalePerMonth(int[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int mounthWithMinSale(int[] sales) {
        int minSale = sales[0];
        int minMounth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSale) {
                minMounth = i + 1;
                minSale = sales[i];
            }
        }
        return (minMounth);
    }

    public int mounthWithMaxSale(int[] sales) {
        int maxSale = sales[0];
        int maxMounth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                maxSale = sales[i];
                maxMounth = i + 1;
            }
        }
        return (maxMounth);
    }

    public int calculateMonthWithSaleUnderAverage(int[] sales) {
        int average = averageSalePerMonth(sales);
        int underAverage = 0;
        for (int sale : sales) {
            if (sale < average) {
                underAverage++;
            }
        }
        return (underAverage);
    }

    public int calculateMonthWithSaleOverAverage(int[] sales) {
        int average = averageSalePerMonth(sales);
        int overAverage = 0;
        for (int sale : sales) {
            if (sale > average) {
                overAverage++;
            }
        }
        return (overAverage);
    }
}
