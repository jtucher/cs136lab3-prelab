import java.util.Scanner;

class DigitSum{

public static int sum(int temp){
  if(temp < 10){
    return temp;
  }
  else{
    return (sum(temp/10) + (temp % 10));
  }
}

public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  int temp = input.nextInt();
  System.out.println(sum(temp));
}


}
