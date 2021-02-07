package com.company;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {
//      start vars
        long startTime = System.nanoTime();
        long startTimeMS = System.currentTimeMillis();

//        Stuff
//        castOnly(5.2);
//            CastWithFloor(5.2);
//        castOnlyLoop(5.2,5000);
        CastWithFloorLoop(5.2,300);

//        end vars
        long endTime = System.nanoTime();
        long endTimeMS = System.currentTimeMillis();
//        calulation  with output
        System.out.println(endTimeMS-startTimeMS+" milliseconds");
        System.out.println(endTime-startTime+" Nano seconds");

    }
    public static int castOnly(double time){
        return (int) (time/2);
    }
    public static Vector<Integer> castOnlyLoop(double time,int times) {
        Vector<Integer> vec = new Vector<Integer>();
        for (int i = 0; i < times; i++) {
            vec.add((int) (time/2));
        }
        return vec;
    }
    public static Vector<Integer> CastWithFloorLoop(double time,int times) {
        Vector<Integer> vec = new Vector<Integer>();
        for (int i = 0; i < times; i++) {
            vec.add((int) Math.floor(time*0.5));
        }
        return vec;
    }
        public static int CastWithFloor(double time){
        return (int) Math.floor(time*0.5);
    }
}
