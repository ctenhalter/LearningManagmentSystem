package project.pfrauscher.ctenhalter.learningmanagementsystem;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by ctenhalter on 20.05.2016.
 */
public class AddSubjectActivity extends Activity {

    String subjectname;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_subject);
    }

    public AddSubjectActivity(String subjectname) {
        this.subjectname = subjectname;

    }

    Button btnConfirm = (Button) findViewById(R.id.btnConfirm);

    
}
