package org.home.javatest.util;

public class StringUtil {
    public static String repeat(String str, int times){
        String result ="";
        for (int i = 0; i < times; i++) {
            result +=str;
        }
        return result;
    }
    public static boolean isEmpty(String str){
        if (str != null){
            if(str.isEmpty()){
                return true;
            }else return str.isBlank();
        }else{
            return true;
        }
    }
}
