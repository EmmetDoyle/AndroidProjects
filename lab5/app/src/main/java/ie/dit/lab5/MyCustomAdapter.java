package ie.dit.lab5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Emmet on 20/10/2016.
 */

public class MyCustomAdapter extends ArrayAdapter<String> {

    Context context;
    String[] month;


    public MyCustomAdapter(Context context, int textViewResourceId,
                           String[] objects) {
        super(context, textViewResourceId, objects);
        // TODO Auto-generated constructor stub
        this.context = context;
        month = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        //return super.getView(position, convertView, parent);

        View row = convertView;

        if(row==null){
            LayoutInflater inflater= LayoutInflater.from(context);
            row=inflater.inflate(R.layout.row, parent, false);
        }

        TextView label=(TextView)row.findViewById(R.id.month);
        TextView label2=(TextView)row.findViewById(R.id.abbrev);
        label.setText(month[position]);
        label2.setText(month[position].substring(0, 3));
        ImageView icon=(ImageView)row.findViewById(R.id.icon);

        if (month[position]=="December"){
            icon.setImageResource(R.drawable.ok);
        }
        else{
            icon.setImageResource(R.drawable.icongray);
        }

        return row;
    }
} // end custom adapter