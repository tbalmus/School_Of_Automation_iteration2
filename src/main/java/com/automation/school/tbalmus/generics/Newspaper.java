package com.automation.school.tbalmus.generics;

public class Newspaper extends Media {

    String name;
    double price;

    public Newspaper ( int id , String name, double price ) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void isCheap (){
        if (this.getPrice () > 10 ){
            System.out.println ("Newspaper " + this.getName () + " is expensive."  );
        }
        else {
            System.out.println ("Newspaper "  + this.getName () + " is cheap" );
        }
    }

    @Override
    public boolean equals ( Object o ) {
        if (this == o) return true;
        if (o == null || getClass ( ) != o.getClass ( )) return false;

        Newspaper newspaper = (Newspaper) o;

        if (Double.compare ( newspaper.price , price ) != 0) return false;
        return name != null ? name.equals ( newspaper.name ) : newspaper.name == null;
    }

    @Override
    public int hashCode () {
        int result;
        long temp;
        result = name != null ? name.hashCode ( ) : 0;
        temp = Double.doubleToLongBits ( price );
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public double getPrice () {
        return this.price;
    }

    public String getName () {
        return this.name;
    }

    @Override
    public String toString () {
        return "Newspaper{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }
}

