package ie.dit.lab5;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ListActivity {
    String[] month = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
    };


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main); // or whatever you called your XML with the <Listview > widget in it.


        setListAdapter(new MyCustomAdapter(MainActivity.this,  R.layout.row, month));
    }




    protected void onListItemClick(ListView l, View v, int position, long id){
        Toast.makeText(this, month[position], Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(), NewPage.class);
        startActivity(intent);
    }

}  // end class

