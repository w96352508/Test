package com.ocp.day23;
//電力換算
//W(瓦數),V(電壓),A(電流)
public class Power {
    //取得w
public int getW(int v,int a){
 int w= v*a;
 return  w;
}
//取得V
public  int getV(int w ,int a ){
  int v = w/a;
  return  v;
}
//A
public  int getA(int w ,int v ){
  int a = w/v;
  return  a;
}


}
