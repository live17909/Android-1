package com.luojimao.zxf;

import android.app.Activity;
import android.os.Bundle;
/**
 * 
 * @author zhengxiaofan
 * 这是一个聚合多种功能的安卓app Demo,服务器端的业务数据和文件处理接口采用golang生成
 * 类说明:主题UI采用viewpager+fragment,可以滑动和点击切换tab
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
}
