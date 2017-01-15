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
