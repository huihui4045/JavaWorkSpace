package jni;

/**
 * Created by gavin on 2017/8/1.
 */
public class JniTest {

    static {

        System.loadLibrary("jni-test");

    }

    public native String get();

    public native void set(String string);

    public static void main(String args[]) {

        JniTest jniTest = new JniTest();


        jniTest.set("Hello Word");
    }
}
