package com.ocp.day16;
public class SexMain {
    public static void main(String[] args) {
        //checkSex(1);
        checkSex(Sex.man);
    }
    public static void checkSex(Sex sex) {
     switch(sex){
    case man:
        System.out.println("我是男生");
        break;
    case female:
        System.out.println("我是女生");
        break;
      default:
        System.out.println("Error");
    }
    }
 
}
