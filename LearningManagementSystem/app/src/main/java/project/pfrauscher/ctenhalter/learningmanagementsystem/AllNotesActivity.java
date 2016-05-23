package project.pfrauscher.ctenhalter.learningmanagementsystem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by ctenhalter on 23.05.2016.
 */
public class AllNotesActivity extends Activity { //ctenhalter

    Spinner spinnerSubjectName= (Spinner) findViewById(R.id.subjectSpinner);
            ListView listNotes = (ListView) findViewById(R.id.noteList);

    @Override
    protected void onCreate(Bundle savedInstanceState) {//ctenhalter
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_notes_for);

        readFromDatabase ();

        if (listNotes.getItemAtPosition(0)!=null){

        listNotes.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent showNote = new Intent(this,ShowNoteActivity.class);
                showNote.putExtra("id",id);//db zum anzeigen
                startActivity(showNote);


            }
        });
    }}

    private void readFromDatabase() {

        //Elemente befüllen
    }
}
