package com.company;
class Pair<T>{
    private  T first;
    private  T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }
    public void print(){
        System.out.print(first+" ");
        System.out.println(second);
    }
}


public class Generics {
    public static void main(String[] args) {
       Pair<Integer> p = new Pair<Integer>(10,20);
       Pair<Double> pd = new Pair<Double>(10.23,20.24);
       Pair<String> ps = new Pair<String>("Ram", "Shyam");
       p.print();
       pd.print();
       ps.print();

    }
}
