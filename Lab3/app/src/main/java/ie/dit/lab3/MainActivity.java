package ie.dit.lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button)findViewById(R.id.button);
        //button using an interface
        btn1.setOnClickListener(this);

        //button using anonymous classes
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button 2 was pressed!", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button :
                Toast.makeText(this, "Button 1 was pressed!", Toast.LENGTH_LONG).show();
                break;
            //case R.id.button2 :
            //    Toast.makeText(this, "Button 2 was pressed!", Toast.LENGTH_LONG).show();
            //    break;
            default:
                return;
        }
    }

    /*public void Click(View v) {
        Toast.makeText(getApplicationContext(), "Button 3 was pressed!", Toast.LENGTH_LONG).show();
    }*/
}
