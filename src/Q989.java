import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Q989 {
    public static List<Integer> addToArrayForm(int[] A, int K) {
        //Find the number of digits
        List<Integer> finalList = new ArrayList<>();
        Stack<Integer> workingStack = new Stack<>();
        //Populate working stack
        for(int val: A){
            workingStack.push(val);
        }
        Stack<Integer> finalStack = new Stack<>();
        int tempInt = K;
        int carry = 0;
        while(tempInt != 0){
            int addTo = tempInt % 10;
            int newSum = addTo + carry;
            if(!workingStack.isEmpty()){
                newSum+= workingStack.pop();
            }
            carry =  newSum / 10;
            finalStack.push(newSum % 10);
            tempInt = (tempInt / 10);
        }

        while(!workingStack.isEmpty()){
            int newSum = workingStack.pop() + carry;
            finalStack.push(newSum % 10);
            carry = newSum / 10;
        }

        if(carry != 0){
            finalStack.push(carry);
        }
        while(!finalStack.isEmpty()){
            finalList.add(finalStack.pop());
        }
        return finalList;
    }
}
