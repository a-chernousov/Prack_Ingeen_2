package com.example.demo.model;

public class Procent {

    private float sum;

    public Procent(int sum) {
        this.sum =  sum;
    }

    public float countPr(float pr) {
        return pr / 100.0f; // Возвращаем заданный процент в виде дроби
    }

    public float countSum(float sum, float pr) {
        return sum + (sum * countPr(pr)); // Вычисляем итоговую сумму с учетом процента
    }

    public int countSumrnd(float pr) {
        float result = sum + (sum * (pr / 100.0f)); //Процент может быть 33.3%!
        return Math.round(result);
    }


    public String toString(float sum) {
        return  String.valueOf(sum);
    }
}
