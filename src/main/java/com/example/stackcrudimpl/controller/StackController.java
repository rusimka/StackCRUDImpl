package com.example.stackcrudimpl.controller;

import com.example.stackcrudimpl.service.StackInterface;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stack")
public class StackController {

  private final StackInterface stackInterface;

  public StackController(StackInterface stackInterface) {
    this.stackInterface = stackInterface;
  }

  @PostMapping("/push/{element}")
  public ResponseEntity<String> push(@PathVariable Integer element) {
    stackInterface.push(element);
    return ResponseEntity.ok("Element is pushed into the stack");
  }

  @DeleteMapping("/pop")
  public ResponseEntity<String> pop() {
    stackInterface.pop();
    return ResponseEntity.ok("Element is popped from the stack");
  }

  @GetMapping("/peek")
  public ResponseEntity<String> peek() {
    stackInterface.peek();
    return ResponseEntity.ok("Element peeked");
  }

  @GetMapping("/size")
  public ResponseEntity<String> getSizeStack(){
    return ResponseEntity.ok("Current size of the stack");
}


  @PutMapping("/grow/{size}")
  public ResponseEntity<String> grow(@PathVariable int size) {
    stackInterface.grow(size);
    return ResponseEntity.ok("The maximum size of the stack is increased");
  }

}
