package com.dialog.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import com.dialog.app.MainActivity;
import java.util.ArrayList;
import java.util.List;
import peter1303.material.MaterialDesignDialog.MaterialDialog;

public class MainActivity extends Activity 
{
	Button bn,bn2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		bn=(Button)findViewById(R.id.mainButton1);
		bn2=(Button)findViewById(R.id.mainButton2);
		
		bn.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					final MaterialDialog alert=new MaterialDialog(MainActivity.this);
					alert.setTitle("标题");
					alert.setMessage("消息");
					alert.setPositiveButton("确定", new OnClickListener(){

							@Override
							public void onClick(View p1)
							{
								alert.dismiss();
							}
						});
					alert.setNegativeButton("取消", new OnClickListener(){

							@Override
							public void onClick(View p1)
							{
								alert.dismiss();
							}
						});
					alert.setNeutralButton("第三个", new OnClickListener(){

							@Override
							public void onClick(View p1)
							{
								
							}
						});
					alert.show();
				}
			});
		bn2.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					List<String>list = new ArrayList<String>();
					for(int i=0;i<10;i++){
						list.add("item"+i);
					}
					
					MaterialDialog alert=new MaterialDialog(MainActivity.this);
					alert.setTitle("标题");
					
					alert.setItems(list, new ListView.OnItemClickListener(){

							@Override
							public void onItemClick(AdapterView<?> p1, View p2, int p3, long p4)
							{
								Toast.makeText(MainActivity.this,""+p3,Toast.LENGTH_LONG).show();
							}
						});
					alert.setItemsLongClick(new ListView.OnItemLongClickListener(){

							@Override
							public boolean onItemLongClick(AdapterView<?> p1, View p2, int p3, long p4)
							{
								Toast.makeText(MainActivity.this,"long "+p3,Toast.LENGTH_LONG).show();
								return false;
							}
						});
					alert.setPositiveButton("确定", new OnClickListener(){

							@Override
							public void onClick(View p1)
							{
								// TODO: Implement this method
							}
						});
					alert.setNegativeButton("取消", new OnClickListener(){

							@Override
							public void onClick(View p1)
							{
								// TODO: Implement this method
							}
						});
					alert.setNeutralButton("第三", new OnClickListener(){

							@Override
							public void onClick(View p1)
							{
								// TODO: Implement this method
							}
						});
					alert.show();
				}
			});
		
    }
}
