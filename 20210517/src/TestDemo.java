import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-05-17
 * Time: 17:28
 */
public class TestDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){//循环输入
            String str =scanner.next();//字符串输入

            while (str.length()>1) {//循环条件为是否是一个字符
                int result  = 0;
                for (int i = 0; i < str.length(); i++) {
                    result+= str.charAt(i)-48;//将字符转换成数组再相加，减-48或者直接-'0'每次都得到所有位数上的数字之和；
                    //result+= str.charAt(i)-'0';
                }
                str= String.valueOf(result);//相加的结果转换成字符串再判断几位数
            }

            System.out.println(str);
        }
    }
}
class CQueue {
    Deque<Integer> stack1;
    Deque<Integer> stack2;

    public CQueue() {
        stack1 = new LinkedList<Integer>();
        stack2 = new LinkedList<Integer>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        // 如果第二个栈为空
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            return -1;
        } else {
            int deleteItem = stack2.pop();
            return deleteItem;
        }
    }
}
