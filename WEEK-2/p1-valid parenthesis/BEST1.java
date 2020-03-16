import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class BEST1 {
    public static boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('{', '}');
        map.put('(', ')');
        map.put('[', ']');
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (map.keySet().contains(curr)) {
                stack.push(curr);
            } else if (map.values().contains(curr)) {
                if (!stack.empty() && map.get(stack.peek()) == curr) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) throws FileNotFoundException
    {
        File input=new File("C:\\Users\\user\\Desktop\\INPUT2_1.txt");
        Scanner sc=new Scanner((new FileReader(input)));
        File output=new File("C:\\Users\\user\\Desktop\\OUTPUT2_1.txt");
        Scanner sc1=new Scanner((new FileReader(output)));
        System.out.println("Actual Output:");
        while(sc.hasNext()) {
            String b = sc.nextLine();
            boolean a = isValid(b);
            if (a) {
                System.out.println("valid");
            }
            else
            {
                System.out.println("Not valid");
            }
        }
        System.out.println("\nExpected Output:");
        while(sc1.hasNext())
        {
            System.out.println(sc1.nextLine());
        }
    }

}
