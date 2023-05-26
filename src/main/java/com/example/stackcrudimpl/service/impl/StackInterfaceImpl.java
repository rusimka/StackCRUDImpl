package com.example.stackcrudimpl.service.impl;

import com.example.stackcrudimpl.service.StackInterface;
import org.springframework.stereotype.Service;

@Service
public class StackInterfaceImpl implements StackInterface {
  @Override
  public void push(Integer element) {
    System.out.println("Element pushed: " + element);
  }

  @Override
  public void pop() {
    System.out.println("Element popped");
  }

  @Override
  public void peek() {
    System.out.println("Element peeked");
  }

  @Override
  public void getSizeStack() {
    System.out.println("Current size of the stack");
  }

  @Override
  public void grow(int size) {
    System.out.println("Maximum size of the stack increased");
  }
}
