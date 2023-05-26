package com.example.stackcrudimpl.service;


public interface StackInterface {

    public void push(Integer element);

    public void pop();

    public void peek();

    public void getSizeStack();

    public void grow(int size);

}
