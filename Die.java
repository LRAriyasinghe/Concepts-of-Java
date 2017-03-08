public class Die
{
  private int face = 1;

  // print the current value
  public void print()  {
    System.out.println(face);
  }

  // Get the current value
  public int getRoll ()  {
    return face;
  }

  public void isWin(Die d){
    if(this.getRoll()>d.getRoll())
      System.out.println("WIN");
    else if (this.getRoll()==d.getRoll())
      System.out.println("TIE");
    else
      System.out.println("LOSS");
  }
      
  //Roll the die, return new value
  public int rollDie (){
    Number n =new Number();
    face = n.random(6);
    return face;
  }

}