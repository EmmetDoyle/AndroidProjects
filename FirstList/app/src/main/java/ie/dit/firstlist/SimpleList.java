package ie.dit.firstlist;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class SimpleList extends ListActivity {

    String[] countries = {"Algeria", "Armenia",
            "Azerbaijan", "Albania", "Australia", "Belgium",
            "Belarus", "Bosnia & Herzegovina", "Botswana", "Bulgaria",
            "Bhutan", "Cambodia", "Canada", "China", "Chile", "Czech Republic",
            "Costa Rica", "Cuba", "Denmark", "Egypt", "Ecuador", "Finland", "France", "Guatemala",
            "Gambia", "Honduras", "Hungary", "Ireland", "Iceland", "Russia", "Yemen"
    };

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        setListAdapter(new ArrayAdapter<String>
                (this,
                R.layout.custom_layout,
                        R.id.label,
                        countries
                ));
    }
}
