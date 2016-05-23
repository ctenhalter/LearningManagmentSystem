package project.pfrauscher.ctenhalter.learningmanagementsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) //ctenhalter

    {

        getMenuInflater().inflate(R.menu.options_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { //ctenhalter


        switch (item.getItemId()){


            case R.id.menuAddSubject:

                Intent addSubjectIntent = new Intent(this,AddSubjectActivity.class);
                startActivity(addSubjectIntent);

        }
        return super.onOptionsItemSelected(item);
    }
}
