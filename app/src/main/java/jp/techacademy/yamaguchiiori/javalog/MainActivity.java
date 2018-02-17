package jp.techacademy.yamaguchiiori.javalog;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("太郎",30,"課題");

        human.say();
        human.think();
    }
}
