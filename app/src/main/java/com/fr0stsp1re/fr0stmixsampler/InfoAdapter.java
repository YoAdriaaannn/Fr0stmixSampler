package com.fr0stsp1re.fr0stmixsampler;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
public class InfoAdapter extends ArrayAdapter<Info> {

    private static final String LOG_TAG = com.fr0stsp1re.fr0stmixsampler.InfoAdapter.class.getSimpleName();

    public InfoAdapter(Activity context, ArrayList<Info> infos) {
         super(context, 0, infos);    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check to see if view is in use. If not inflate view.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_alt, parent, false);
        }

        final Info currentInfo = getItem(position);

        // set views to values of current info

        TextView info1 = (TextView) listItemView.findViewById(R.id.default_textview);
        info1.setText(currentInfo.getmDefaultInfo());

        TextView info2 = (TextView) listItemView.findViewById(R.id.info2_textview);
        info2.setText(currentInfo.getmSecondInfo());

        TextView info3 = (TextView) listItemView.findViewById(R.id.info3_textview);
        info3.setText(currentInfo.getmThirdInfo());


        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image_1);
        iconView.setImageResource(currentInfo.getImageResourceId());

            return listItemView;
        }
    }
