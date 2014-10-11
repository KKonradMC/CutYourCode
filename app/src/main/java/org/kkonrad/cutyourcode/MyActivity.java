package org.kkonrad.cutyourcode;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import org.kkonrad.cutyourcode.model.ExampleModel;


public class MyActivity extends Activity {

    private static final String TEST_TAG = "TEST_TAG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        ExampleModel exampleModel = new ExampleModel();
        exampleModel.setFirstProperty("a");
        exampleModel.setSecondProperty(1);
        exampleModel.setThirdProperty(2l);
        ExampleModel exModel = new ExampleModel("a", 1, 2l);
        Log.i(TEST_TAG,"Are equal : " + exampleModel.equals(exModel));
        Log.i(TEST_TAG, exampleModel.toString());
        Log.i(TEST_TAG,exampleModel.toString());

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
