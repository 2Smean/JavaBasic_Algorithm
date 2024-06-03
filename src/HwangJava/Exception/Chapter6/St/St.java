package HwangJava.Exception.Chapter6.St;

import java.util.StringTokenizer;

public class St {
    public static void main(String[] args) {
        String query = "name=Lee&add=seoul&age=25";
        StringTokenizer s = new StringTokenizer(query, "&");

        int n = s.countTokens();
        System.out.println(n);

//        for (int i = 0; i < n; i++) { // i < s.countTokens 할 수 없다
//            String token = s.nextToken();
//            System.out.println(token);
//        }

//        while (s.hasMoreTokens()) {
//            String token = s.nextToken();
//            System.out.println(token);
//        }

        String[] sub = query.split("&");
        for (int i = 0; i < sub.length; i++) {
            System.out.println(sub[i]);
        }
    }
}
