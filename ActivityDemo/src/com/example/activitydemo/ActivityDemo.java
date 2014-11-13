package com.example.activitydemo;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
public class ActivityDemo extends Activity {
   
	private static final String TAG = "ActivityDemo";
	private EditText mEditText;
	//����һ��String ����������ȡ����EditText�����ֵ
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
    //����HOME��ʱ��Ȼ���ٴ�����Ӧ��ʱ������Ҫ�ָ���ǰ״̬
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
    
    //�����ǰ�HOME��ʱ������onPause������������ֵ����mString
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