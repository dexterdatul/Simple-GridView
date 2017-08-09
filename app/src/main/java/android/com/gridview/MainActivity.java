package android.com.gridview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    GridView imgGridView;


    int icons[] = {R.drawable.joke, R.drawable.joke, R.drawable.joke, R.drawable.joke, R.drawable.joke, R.drawable.joke, R.drawable.joke,
            R.drawable.joke, R.drawable.joke, R.drawable.joke, R.drawable.joke, R.drawable.joke, R.drawable.joke, R.drawable.joke, R.drawable.joke, R.drawable.joke, R.drawable.joke, R.drawable.joke,
            R.drawable.joke, R.drawable.joke, R.drawable.joke, R.drawable.joke};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgGridView = (GridView) findViewById(R.id.imgGridView);

        ImageAdapter galleryCustomAdapter = new ImageAdapter(MainActivity.this, icons);
        imgGridView.setAdapter(galleryCustomAdapter);

        imgGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Selected", Toast.LENGTH_LONG).show();
            }
        });

    }
}
