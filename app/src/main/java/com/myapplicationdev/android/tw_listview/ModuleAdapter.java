package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ModuleAdapter extends ArrayAdapter<Module> {
    private ArrayList<Module> modules;
    private Context context;
    private TextView tvModuleCode;
    private ImageView ivImage;
    public ModuleAdapter(Context context, int resource, ArrayList<Module> objects){
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        modules = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row_module, parent, false);
        // Get the TextView object
        tvModuleCode = (TextView) rowView.findViewById(R.id.textView1);
        // Get the ImageView object
        ivImage = (ImageView) rowView.findViewById(R.id.imageView);

        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Module currentModule = modules.get(position);
        tvModuleCode.setText(currentModule.getCode());
        if (currentModule.getYear().equals("Year 1")){
            if (position == 0){
                ivImage.setImageResource(R.drawable.prog);
            }else if(position == 1){
                ivImage.setImageResource(R.drawable.nonprog);
            }else{
                ivImage.setImageResource(R.drawable.prog);
            }
        }
        else if (currentModule.getYear().equals("Year 2")){
            if (position == 0){
                ivImage.setImageResource(R.drawable.prog);
            }else if(position == 1){
                ivImage.setImageResource(R.drawable.prog);
            }else{
                ivImage.setImageResource(R.drawable.nonprog);
            }
        }
        else if (currentModule.getYear().equals("Year 3")){
            if (position == 0){
                ivImage.setImageResource(R.drawable.nonprog);
            }else if(position == 1){
                ivImage.setImageResource(R.drawable.nonprog);
            }else{
                ivImage.setImageResource(R.drawable.prog);
            }
        }

        // Return the nicely done up View to the ListView
        return rowView;
    }




}
