package com.aot.classobject;
public class Staticnonstatic {
    int id;
    static String name = "Static Non-static";

    Staticnonstatic(int id) {
        this.id = id;
    }

    public String toString() {
        return "id = " + this.id + " name = " + Staticnonstatic.name;
    }

    public static void main(String[] args) {
        Staticnonstatic obj1 = new Staticnonstatic(12);
        Staticnonstatic obj2 = new Staticnonstatic(13);
        System.out.println("OBJ1 = " + obj1);
        System.out.println("OBJ2 = " + obj2);
    }
}