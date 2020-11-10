package id.ac.telkomuniversity.vsi3f4.praktik_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tvData1 = (TextView) findViewById(R.id.tv_data1);

        if(getIntent().getExtras()!=null){
            Bundle bundle = getIntent().getExtras();
            tvData1.setText(bundle.getString("data1"));
        }else{
            tvData1.setText(getIntent().getStringExtra("data1"));
        }

    }
}