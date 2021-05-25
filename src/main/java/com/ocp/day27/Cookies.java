package com.ocp.day27;
public class Cookies {
private int amount;
private boolean empty=true;//盤子的狀態
 public Cookies(int amount) {
 this.amount = amount;
}
 public int getAmount() {
return amount;
    }
 
 public synchronized void put(int n){
     while(!empty){ 
    try {
        wait();
      }  catch (Exception e) {
      } 
      }
     System.out.printf("主人放第%d塊餅乾\n",n);   
     empty=false;//改變盤子狀態
     notifyAll();//通知小狗來吃餅乾
 }
  public synchronized void eat(int n){
     while(empty){ 
    try {
         wait();//等待
      }  catch (Exception e) {
      } 
      }
 System.out.printf("小狗吃第%d塊餅乾\n",n);   
 empty=true;//改變盤子狀態
 notifyAll();//通知主人來放餅乾
  }
  
  
}
