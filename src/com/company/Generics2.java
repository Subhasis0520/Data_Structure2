package com.company;
class Join<T,S> {
    private T first;
    private S second;
public Join(){

}
    public Join(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public void print() {
        System.out.println(first + " ");
        System.out.println(second);
    }
}


public class Generics2 {
    public static void main(String[] args) {

        Join<String,Integer> j = new Join<String,Integer>("Radha",26);
        Join<Join<String,Integer>,String> jS = new Join<>();
        jS.setFirst(j);
        jS.setSecond("ABCD");
        System.out.println(jS.getFirst().getFirst());
        System.out.println(jS.getFirst().getSecond());
        jS.print();
    }
}
