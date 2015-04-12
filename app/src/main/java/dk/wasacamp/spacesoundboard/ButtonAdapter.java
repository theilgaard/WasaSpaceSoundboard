package dk.wasacamp.spacesoundboard;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by c03 on 4/8/15.
 */
public class ButtonAdapter extends BaseAdapter {
    private Context mContext;

    public ButtonAdapter(Context mContext){
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return 8;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Button button;

        if(convertView == null){
            button = new Button(mContext);

            button.setPadding(8, 8, 8, 8);
        }else{
            button = (Button) convertView;
        }

        button.setText("Button "+position);
        return button;
    }

/*    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageBitmap(BitmapFactory.decodeResource(mContext.getResources(), R.drawable.wasacamp_logo));
        return imageView;
    }*/
}
