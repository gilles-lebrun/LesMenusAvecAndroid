package fr.ensicaen.example.lebrung.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class LesMenusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_les_menus);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_les_menus, menu);
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
        if (id == R.id.action_contextual){
            Intent intent = new Intent(this, ContextualMenusActivity.class);
            intent.putExtra("LanchBy","Menu form LesMenusActivity");
            startActivity(intent);
            return true;
        }
        if (id == R.id.action_action_bar){
            Intent intent = new Intent(this, ActionBarActivity.class);
            intent.putExtra("LanchBy","Menu form LesMenusActivity");
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
