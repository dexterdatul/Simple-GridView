package android.com.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by Dexter John Datul on 09/08/2017.
 */

public class ImageAdapter extends BaseAdapter {


    private int icons[];
    private Context context;
    private LayoutInflater layoutInflater;

    public ImageAdapter(Context context, int icons[]) {
        this.context = context;
        this.icons = icons;
    }


    @Override
    public int getCount() {
        return icons.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        View gridView = convertView;

        if (convertView == null) {
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridView = layoutInflater.inflate(R.layout.custom_layout, null);
        }

        ImageView icon = gridView.findViewById(R.id.image);

        icon.setImageResource(icons[position]);
        return gridView;
    }
}
