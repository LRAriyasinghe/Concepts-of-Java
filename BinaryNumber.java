public class BinaryNumber{
  int number; 
  
  BinaryNumber(int a){
    number=a;
  }
  
  public int and(BinaryNumber a){
    return number&=a.number;
  }
  
  public int or(BinaryNumber a){
    return number |=a.number;
  }
  
  public int RShift(int a){
    return number >>=a;
  }
  
  public int ZRShift(int a){
    return number >>>=a;
  }
  
  public int LShift(int a){
    return number <<=a;
  }
  
  public void print(){
    String s=Integer.toBinaryString(number);
    System.out.format("%-5d=%15s %n",number,s);
  }
  
}