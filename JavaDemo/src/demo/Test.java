package demo;

import java.io.UnsupportedEncodingException;

/**
 * Created by gavin on 2017/9/15.
 */
public class Test {

    public static void main(String[] args) {

        Student student1=new Student("裴银辉",23,100);

       String key="community";

        String value="{\"versionCode\":10000,\"isUpdate\":true}";

        String json = "{\"id\":11,\"name\":\"zhagnsan\"}";

        try {

        String base_key=    encodeData(key);

        String base_value=encodeData(value);

            System.out.println(base_key);
            System.out.println(base_value);
            System.out.println(json);


        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        String json4="0Coq1Uf8WYcCtFE3GsZgx65q9XgJu2ijCJmlUCk/6OA9NZ0HVQTGZ8nj6GBA7yZxut2+qhfuK4HC\n" +
                "upjxfyeqfZBBXS6JDo8gTdD6EG8QvooBw81Q4NdTEg==";


        byte[] decode = Base64.decode(json4, Base64.DEFAULT);

        System.out.println(new String(decode));

    }



    public static String encodeData(String data) throws UnsupportedEncodingException {
        //进行BASE64编码,URL_SAFE/NO_WRAP/NO_PADDING
        return new String(Base64.encode(data.getBytes("utf-8"), Base64.URL_SAFE | Base64.NO_WRAP | Base64.NO_PADDING), "utf-8");
    }




    //Unicode转中文
    public static String decodeUnicode(final String dataStr) {
        int start = 0;
        int end = 0;
        final StringBuffer buffer = new StringBuffer();
        while (start > -1) {
            end = dataStr.indexOf("\\u", start + 2);
            String charStr = "";
            if (end == -1) {
                charStr = dataStr.substring(start + 2, dataStr.length());
            } else {
                charStr = dataStr.substring(start + 2, end);
            }
            char letter = (char) Integer.parseInt(charStr, 16); // 16进制parse整形字符串。
            buffer.append(new Character(letter).toString());
            start = end;
        }
        return buffer.toString();
    }
}
