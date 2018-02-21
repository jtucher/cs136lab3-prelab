import java.util.Scanner;

class SubsetSum {

public static boolean canMakeSum(int[] setOfNums, int targetSum){
  return (makeSumHelper(setOfNums, targetSum, setOfNums.length));
}

public static boolean makeSumHelper(int[] set, int target, int counter){
  if(counter == 0){
      return(sum(set) == target);
  }
  else{
    int[] newSet = new int[set.length - 1];
    for(int i = 0; i < newSet.length; i++){
      if(i < set.length - counter)
        newSet[i] = set[i];
      else if(i >= set.length - counter)
        newSet[i] = set[i + 1];
    }
    if((makeSumHelper(newSet, target, counter - 1) == true) || (makeSumHelper(set, target, counter - 1) == true))
      return true;
    else
      return false;
  }
}

public static int sum(int[] integers){
  int sum = 0;
  for(int i = 0; i < integers.length; i++){
    sum += integers[i];
  }
  return sum;
}

public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.println("Input target number: ");
  int target = input.nextInt();
  System.out.println("Input array of integers: ");
  int [] test = new int[5];
  for(int i = 0; i < test.length; i++){
    test[i] = input.nextInt();
  }
  System.out.println(canMakeSum(test, target));
}

}
