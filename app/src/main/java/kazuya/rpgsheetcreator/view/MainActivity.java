package kazuya.rpgsheetcreator.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.List;

import kazuya.rpgsheetcreator.adapter.*;

import kazuya.rpgsheetcreator.R;
import kazuya.rpgsheetcreator.model.Rpg;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRvRpgList;
    private RecyclerView.Adapter mRpgListAdapter;
    private RecyclerView.LayoutManager mRpgListLayoutManager;

    private List<Rpg> mRpgList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRvRpgList = (RecyclerView) findViewById(R.id.rv_rpg_list);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRvRpgList.setHasFixedSize(true);

        // use a linear layout manager
        mRpgListLayoutManager = new LinearLayoutManager(this);
        mRvRpgList.setLayoutManager(mRpgListLayoutManager);

        // specify an adapter (see also next example)
        mRpgListAdapter = new RpgListAdapter(mRpgList);
        mRvRpgList.setAdapter(mRpgListAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
