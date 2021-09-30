package ru.mirea.task6;

public class TestEntities
{
    public static void main(String[] args)
    {
        String name = "Battlefield 2042";
        String price = "3499 rubles";
        Entities ent = new Entities(name,price);
        ent.getName();
        System.out.print(" cost ");
        ent.getPrice();
    }
}