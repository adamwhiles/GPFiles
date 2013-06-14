package com.geekpass.gpfiles;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

public class MainActivity extends Activity {
	private File file;
	public String fileName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ListView lv = (ListView) findViewById(R.id.listView);
        List<ListViewItem> items = new ArrayList<MainActivity.ListViewItem>();
        
        String root_sd = Environment.getExternalStorageDirectory().toString();
        file = new File(root_sd);
        File fileList[] = file.listFiles();
        String[] listoffiles = new String[fileList.length];
        for (int i = 0; i < fileList.length; i++) {
        	listoffiles[i] = fileList[i].getName();
        	fileName = fileList[i].getName();
        	File files = fileList[i];
        	if (files.isDirectory()) {
            	items.add(new ListViewItem()
            	{{
            		
            		
            		ThumbnailResource = R.drawable.ic_collection;
            		Title = fileName;
            		SubTitle = "SubTitle Test 2";
            	}});
    		} else {
        	items.add(new ListViewItem()
        	{{
        		
        		
        		ThumbnailResource = R.drawable.ic_file;
        		Title = fileName;
        		SubTitle = "SubTitle Test 2";
        	}});
        }
        }
        
        CustomListViewAdapter adapter = new CustomListViewAdapter(this, items);
        lv.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    class ListViewItem
    {
    	public int ThumbnailResource;
    	public String Title;
    	public String SubTitle;
    	
    }
    
}
