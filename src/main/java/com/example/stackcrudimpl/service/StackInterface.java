package com.example.stackcrudimpl.service;


public interface StackInterface<E> {

    public void push(E element);

    public void pop();

    public void peek();

    public void getSizeStack();

    public void grow(int size);

}
