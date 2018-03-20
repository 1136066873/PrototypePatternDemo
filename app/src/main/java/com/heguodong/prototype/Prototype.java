package com.heguodong.prototype;

/**
 * Created by 何国栋 on 2018/3/20.
 */

public class Prototype implements Cloneable {


    public Prototype clone(){

        Prototype prototype = null ;

        try {
            prototype = (Prototype)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }
}
