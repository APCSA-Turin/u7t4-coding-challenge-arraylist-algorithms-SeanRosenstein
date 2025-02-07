package com.example.project;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList();
        arr.add(3);
        arr.add(4);
        System.out.println(Main.notAlone(arr, 3));
    }
}
