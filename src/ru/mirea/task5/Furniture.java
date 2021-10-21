package ru.mirea.task5;

public abstract class Furniture
{
    String price;
    int number;
    String color;
    Furniture(int number){ this.number = number;}
    public void setColor(String color){this.color=color;}
}
class Plate extends Furniture
{
    Plate(int number)
    {
        super(number);
    }
    public void setColor(String color){this.color=color;}
}
class Glass extends Furniture
{
    Glass(int number)
    {
        super(number);
    }
    public void setColor(String color){this.color=color;}
}
