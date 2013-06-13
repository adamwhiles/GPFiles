package com.geekpass.gpfiles;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ListView lv = (ListView) findViewById(R.id.listView);
        List<ListViewItem> items = new ArrayList<MainActivity.ListViewItem>();
        
        items.add(new ListViewItem()
        {{
        	ThumbnailResource = R.drawable.ic_launcher;
        	Title = "Item 1";
        	SubTitle = "SubTitle Test 1";
        }});
        
        items.add(new ListViewItem()
        {{
        	ThumbnailResource = R.drawable.ic_launcher;
        	Title = "Item 2";
        	SubTitle = "SubTitle Test 2";
        }});
        
        items.add(new ListViewItem()
        {{
        	ThumbnailResource = R.drawable.ic_launcher;
        	Title = "Item 2";
        	SubTitle = "SubTitle Test 2";
        }});
        
        items.add(new ListViewItem()
        {{
        	ThumbnailResource = R.drawable.ic_launcher;
        	Title = "Item 2";
        	SubTitle = "SubTitle Test 2";
        }});
        
        items.add(new ListViewItem()
        {{
        	ThumbnailResource = R.drawable.ic_launcher;
        	Title = "Item 2";
        	SubTitle = "SubTitle Test 2";
        }});
        
        items.add(new ListViewItem()
        {{
        	ThumbnailResource = R.drawable.ic_launcher;
        	Title = "Item 2";
        	SubTitle = "SubTitle Test 2";
        }});
        
        items.add(new ListViewItem()
        {{
        	ThumbnailResource = R.drawable.ic_launcher;
        	Title = "Item 2";
        	SubTitle = "SubTitle Test 2";
        }});
        
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
