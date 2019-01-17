package me.developermuda.www.blistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int[] IMAGS ={R.drawable.aa,R.drawable.ab,R.drawable.ac,R.drawable.ad,R.drawable.ax,R.drawable.user,R.drawable.k,R.drawable.l,R.drawable.m};

    String[] NAME ={"DANY","DANYSOLUTION","DEVELOPERMUDA.ME","HAMDANI","HAMDANI DEV","DEVELOPER","NINING","CACA","RARA"};

    String[] DISC ={"den","www.developermuda","development","me","sapa dev","dev","DEV","DEV","DEV"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listView = (ListView)findViewById(R.id.listView);

        costumtAdapter costumtAdapter = new costumtAdapter();
        listView.setAdapter(costumtAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                       Intent intent = new Intent(MainActivity.this,ContenActivity.class);

       startActivity(intent);
            }
        });


    }
    class costumtAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return IMAGS.length;
        }

        @Override
        public Object getItem(int i) {


            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup parent) {

            view= getLayoutInflater().inflate(R.layout.costumt_layout,null);

            ImageView imageView = (ImageView)view.findViewById(R.id.imageView);
            TextView textView = (TextView)view.findViewById(R.id.textName);
            TextView textView1 = (TextView)view.findViewById(R.id.textDesc);
            imageView.setImageResource(IMAGS[i]);
            textView.setText(NAME[i]);
            textView1.setText(DISC[i]);

            return view;
        }
    }
}
