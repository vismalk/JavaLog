package jp.techacademy.yamaguchiiori.javalog;

import android.util.Log;
/**
 * Created by yamaguchiiori on 2018/02/11.a
 */

public class Dog  extends  Animal  implements Movable {
    //クラス変数
    static String to_jp = "犬";

    //メンバ変数
    String name;      //名前
    int age;          //年齢

    //コンストラクタ
    public Dog(String name,int age) {
        this.name = name;
        this.age = age;
    }

    //クラス関数
    public static void introduce() {
        Log.d("javatest","これは犬クラスです。");
    }

    //メンバ関数
    public void say(){
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "「ワンワン」");
    }

    @Override
    public void move() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "は全力で走った。");
    }
}

