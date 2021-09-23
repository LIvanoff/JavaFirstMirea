package ru.mirea.task1;

import java.lang.String;

public class Prac1 //класс описывающий книгу
{
    String writer;
    String name;
    int year;
    private String book;

    public Prac1(String n,int y)
    {
        name=n;
        year=y;
    }
    public Prac1(String w)
    {
        writer = w;
    }
    public Prac1(String n,String w)
    {
        name=n;
        writer=w;
    }
    public  Prac1(String n, String wr, int y)
    {
        name ="\""+ n+"\"";
        writer = wr;
        year = y;
    }
    public  Prac1(int y)
    {
        year = y;
    }
    public String getWriter()
    {
        return "\""+name+"\" "+writer;
    }
    public int getYear()
    {
        return year;
    }
    public String getBook()
    {
        String book = name+" "+writer+" "+year;
        return book;
    }
}
