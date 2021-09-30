package ru.mirea.task6;

import java.util.Scanner;

public class TestEntities
{
    public static void main(String[] args)
    {
        String name = "Battlefield 2042";
        String price;
        Scanner sc = new Scanner(System.in);
        price = sc.next();
        System.out.print("Введите имя сущности ");
        Entities ent = new Entities(name,price);
    }
}
