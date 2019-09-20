package charactor;

public class testDome {
    public static void main(String[] args) {

        String sentence = "盖伦,在进行了连续8次击杀后,获得了 超神 的称号";

        char c = sentence.charAt(2);

        System.out.println(c);

        char[] arry = sentence.toCharArray();

        System.out.println(arry[1]);

        String substring = sentence.substring(10);

        System.out.println(substring);

        System.out.println(sentence.substring(5, 10));

        System.out.println("__________________");

        //根据,进行分割，得到3个子字符串
        String subSentences[] = sentence.split("，");
        for (String sub : subSentences) {
            System.out.println(sub);

            System.out.println("__________________");

            String str1 = "the light";

            String start = "the";
            String end = "Ight";

            System.out.println(str1.startsWith(start));//以...开始
            System.out.println(str1.endsWith(end));//以...结束
        }
    }
}