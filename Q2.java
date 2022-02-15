package com.daryl;

class StacksOfIntegers {
    private int[] elements;
    private int size;
    private int top;
    private int capacity=16;
    private boolean empty;

    public StacksOfIntegers(){
        this.elements=new int[this.capacity];
        this.top = -1;
        this.size=0;
    }

    public StacksOfIntegers(int capacity){
        this.capacity=capacity;
        this.elements = new int[capacity];
        this.top=-1;
    }

    public boolean empty(){
        if (this.top==-1){
            this.empty=true;
            return true;
        }
        else {
            this.empty=false;
            return false;
        }
    }

    public int peek(){
        return elements[this.top];
    }

    public void push(int value){
        if(this.size >= this.capacity){
            System.out.println("STACK IS FULL");
        }
        else{
            this.top++;
            this.size++;
            this.elements[this.top]=value;
        }
    }

    public int pop(){
        if(this.empty==true){
            System.out.println("STACK IS EMPTY");
            System.exit(1);
        }
        else{
            this.size--;
            this.top--;
        }
        return this.elements[this.top+1];
    }

    public int getSize(){
        return this.size;
    }

}

public class Q2 {

    public static void main(String[] args) {
        StacksOfIntegers stack = new StacksOfIntegers();

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}