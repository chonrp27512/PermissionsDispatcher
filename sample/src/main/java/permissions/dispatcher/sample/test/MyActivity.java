package permissions.dispatcher.sample.test;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import permissions.dispatcher.sample.R;

public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

    public void initView(){
        Toast.makeText(this,"我在画太阳",Toast.LENGTH_LONG).show();
    }
}
