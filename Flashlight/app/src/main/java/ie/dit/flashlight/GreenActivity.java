package ie.dit.flashlight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GreenActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_green);

        Button btn1 = (Button)findViewById(R.id.red);
        //button using an interface
        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.red :
                //Toast.makeText(this, "IT WILL SOON TURN RED!!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), RedActivity.class);
                startActivity(intent);
                break;
            default:
                return;
        }
    }
}
