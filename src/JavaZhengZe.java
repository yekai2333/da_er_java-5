import java.util.Arrays;
import java.util.regex.*;
public class JavaZhengZe {
    //Matcher的find()和group()方法
    public static void main(String[] args) {
        String str = "hello114514"+"good191981"+"world0";
        Matcher m =Pattern.compile("((11\\d)|(19\\d))\\d{3}").matcher(str);
        while(m.find()){
            System.out.println(m.group());
        }
    }

//    String 中的正则用法
//    public static void main1(String[] args) {
//        //split、matches、replaceAll 3种用法
//        //split分隔字符串
//        String str="abc;123,456?999|haha";
//        String[] strs=str.split(";|,");
//        System.out.println(Arrays.toString(strs)+"\n");
//
//        //matches 整个字符串是否匹配
//        boolean isMatched = str.matches("(.*)123(.*)");//其中(.*)相当于省略号，可以很清楚的突出自己想要匹配的内容
//        System.out.println(isMatched);
//
//        //replaceAll 替换所需要的字符或字符串
//        String replaceStr = "hello";
//        String newStr = str.replaceAll("a",replaceStr);
//        System.out.println(newStr);
//    }
}
