package pl.zielony.materialsamples;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import pl.zielony.material.beta.Toolbar;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setText("Material Samples");

        ListView listView = (ListView) findViewById(R.id.list);
        String[] items = new String[]{"Buttons", "ListView with ripple", "Large shadow", "Roboto",
                "SVG icons", "Status and navigation bars", "View animations", "Snackbar",
                "TextFields", "Z order", "Saving state", "Dialog", "Image fade", "Radial transition"
        };
        final Class[] activities = new Class[]{ButtonsActivity.class, ListRippleActivity.class,
                ShadowActivity.class, RobotoActivity.class, SVGActivity.class, StatusNavigationActivity.class,
                AnimationsActivity.class, SnackbarActivity.class, TextFieldsActivity.class, ZOrderActivity.class,
                SaveStateActivity.class, DialogActivity.class, ImageFadeActivity.class, RadialTransitionActivity.class};
        listView.setAdapter(new ArrayAdapter<String>(this, R.layout.row, items));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(MainActivity.this, activities[position]));
            }
        });
    }

}
