package com.CoreJava_CW.interface_stuff.Animal2;

public class Fox implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Fox Sound...");
    }

    @Override
    public void eat() {
        System.out.println("Fox is eating...");
    }

    public static void main(String[] args) {
        Fox f = new Fox();
        f.eat();
        f.makeSound();
    }
}
