package app.alex.mkh.cruisesview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

/**
 * Created by Alex on 08.03.2017.
 */

public class MainActivity extends Activity implements OnClickListener {
    LinearLayout lout1;
    ListView list;
    String[] names = { "Cruises 1", "Cruises 2", "Cruises 3", "Cruises 4", "Cruises 5", "Cruises 6",
            "Cruises 7", "Cruises 8", "Cruises 9", "Cruises 10", "Cruises 11" };
    int Sel_cruises;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lout1 = (LinearLayout) findViewById(R.id.activity_main);
        list=(ListView) findViewById(R.id.ListView1);
        // создаем адаптер для списка
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, names);
        // присваиваем адаптер списку
        list.setAdapter(adapter);
        lout1.setOnClickListener(this);
       // list.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.activity_main:
               // Sel_cruises=list.getCheckedItemPosition();
                Intent intent = new Intent(this, CruisesDescription.class);
                startActivity(intent);
                Toast.makeText(this, "Вы кликнули", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
