package ru.mirea.task5;

import java.util.Scanner;

public class TestDog
{
    public static void main(String[] args)
    {
        String name;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите кличку собаки: ");
        name = scan.next();
        Labrador lb = new Labrador(name);
        System.out.print(lb.setName());
    }
}