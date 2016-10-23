package ie.dit.flashlight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RedActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red);

        Button btn1 = (Button)findViewById(R.id.green);
        //button using an interface
        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.green :
                //Toast.makeText(this, "IT WILL SOON TURN RED!!", Toast.LENGTH_LONG).show();
                finish();
                break;
            default:
                return;
        }
    }
}