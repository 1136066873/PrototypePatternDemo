package com.heguodong.prototype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * JAVA设计模式之原型模式
 *
 * http://blog.csdn.net/jason0539/article/details/23158081
 *
 * http://blog.csdn.net/zhangjg_blog/article/details/18369201
 *
 * 输出的日志是 ：
 2018-03-20 20:07:13.615 2404-2404/com.heguodong.prototype E/heguodong:  ==> com.heguodong.prototype.ConcretePrototype@17485ddf
 2018-03-20 20:07:13.615 2404-2404/com.heguodong.prototype E/heguodong:  ==> com.heguodong.prototype.ConcretePrototype@2fe41a2c
 2018-03-20 20:07:13.615 2404-2404/com.heguodong.prototype E/heguodong:  ==> com.heguodong.prototype.ConcretePrototype@e20bcf5
 2018-03-20 20:07:13.615 2404-2404/com.heguodong.prototype E/heguodong:  ==> com.heguodong.prototype.ConcretePrototype@18014a8a
 2018-03-20 20:07:13.615 2404-2404/com.heguodong.prototype E/heguodong:  ==> com.heguodong.prototype.ConcretePrototype@dfef8fb
 2018-03-20 20:07:13.616 2404-2404/com.heguodong.prototype E/heguodong:  ==> com.heguodong.prototype.ConcretePrototype@328ead18
 2018-03-20 20:07:13.616 2404-2404/com.heguodong.prototype E/heguodong:  ==> com.heguodong.prototype.ConcretePrototype@380d3371
 2018-03-20 20:07:13.616 2404-2404/com.heguodong.prototype E/heguodong:  ==> com.heguodong.prototype.ConcretePrototype@1db18556
 2018-03-20 20:07:13.616 2404-2404/com.heguodong.prototype E/heguodong:  ==> com.heguodong.prototype.ConcretePrototype@31ba29d7
 2018-03-20 20:07:13.616 2404-2404/com.heguodong.prototype E/heguodong:  ==> com.heguodong.prototype.ConcretePrototype@184d82c4
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv_1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_1 = (TextView)findViewById(R.id.tv_1);
        tv_1.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv_1:
                test();
                break;
        }
    }

    private void test() {
        ConcretePrototype cp = new ConcretePrototype();
        for(int i=0; i< 10; i++){
            ConcretePrototype clonecp = (ConcretePrototype)cp.clone();
            clonecp.show();
        }
    }
}
