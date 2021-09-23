package ru.mirea.task2;

import ru.mirea.task2.Prac1;

public class TestPrac1
{
    public static void main(String[] args)
    {
        String writer1 = "Alexandre Duma";
        String writer2 = "Herbert Frank";
        String name1 = "The Count of Monte Cristo";
        String name2 = "Dune";
        int year1 = 1844;
        int year2 = 1963;
        Prac1 ob_wr1 = new Prac1(name1,writer1);
        Prac1 ob_y1 = new Prac1(year1);
        Prac1 book2 = new Prac1(name2,writer2, year2);
        System.out.print("Первая книга: ");
        System.out.print(ob_wr1.getWriter()+" ");
        System.out.print(ob_y1.getYear()+"\n");
        System.out.print("Вторая книга: ");
        System.out.print(book2.getBook());
    }
}
