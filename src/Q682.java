import java.util.Stack;

public class Q682 {
    public static int calPoints(String[] ops) {
        Stack<Integer> callStack = new Stack<>();
        int currentSum = 0;
        for (String operation : ops) {
            if (operation.equals("+") && callStack.size() > 1) {
                int previousInt = callStack.pop();
                int secondPreviousInt = callStack.pop();
                int tempAddedVal = secondPreviousInt + previousInt;
                currentSum += tempAddedVal;
                callStack.push(secondPreviousInt);
                callStack.push(previousInt);
                callStack.push(tempAddedVal);
            } else if (operation.equals("D") && !callStack.isEmpty()) {
                int previousValidInt = callStack.pop();
                currentSum += previousValidInt * 2;
                callStack.push(previousValidInt);
                callStack.push(previousValidInt * 2);
            } else if (operation.equals("C") && !callStack.isEmpty()) {
                currentSum -= callStack.pop();
            } else {
                int tempInt = Integer.parseInt(operation);
                currentSum += tempInt;
                callStack.push(tempInt);
            }
        }
        return currentSum;
    }
}
