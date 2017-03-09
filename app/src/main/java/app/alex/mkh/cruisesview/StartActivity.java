package app.alex.mkh.cruisesview;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class StartActivity extends Activity implements OnClickListener {
    LinearLayout lout1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        lout1 = (LinearLayout) findViewById(R.id.activity_start);
        lout1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.activity_start:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(this, "Вы кликнули", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
