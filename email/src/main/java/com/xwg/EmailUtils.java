package com.xwg;

public class EmailUtils {

    private final int i = 0;

    private final int j;

    private final EmailTest email;

    public EmailUtils(){
        j = 1;
        email = new EmailTest(1);
    }

    public EmailUtils(int x){
        j = x;
        email = new EmailTest(x);
    }

    public static void main(String[] args) {
        new EmailUtils();
        new EmailUtils(47);

        System.err.println(new EmailUtils().j);
        System.err.println(new EmailUtils().email.getI());
        System.err.println(new EmailUtils(47).j);
    }
}
