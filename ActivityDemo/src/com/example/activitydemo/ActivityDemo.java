package com.example.activitydemo;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
public class ActivityDemo extends Activity {
   
	private static final String TAG = "ActivityDemo";
	private EditText mEditText;
	//定义一个String 类型用来存取我们EditText输入的值
	private String mString;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mEditText = (EditText)findViewById(R.id.editText);
        Log.e(TAG, "start onCreate~~~");
    }
    
    @Override
    protected void onStart() {
    	super.onStart();
    	Log.e(TAG, "start onStart~~~");
    }
    //当按HOME键时，然后再次启动应用时，我们要恢复先前状态
    @Override
    protected void onRestart() {
    	super.onRestart();
    	mEditText.setText(mString);
    	Log.e(TAG, "start onRestart~~~");
    }
    
    @Override
    protected void onResume() {
    	super.onResume();
    	Log.e(TAG, "start onResume~~~");
    }
    
    //当我们按HOME键时，我在onPause方法里，将输入的值赋给mString
    @Override
    protected void onPause() {
    	super.onPause();
    	mString = mEditText.getText().toString();
    	Log.e(TAG, "start onPause~~~");
    }
    
    @Override
    protected void onStop() {
    	super.onStop();
    	Log.e(TAG, "start onStop~~~");
    }
    
    @Override
    protected void onDestroy() {
    	super.onDestroy();
    	Log.e(TAG, "start onDestroy~~~");
    }
    
}