package edu.floridapoly.mobiledeviceapps.fall23.lopezgabriel.lopez_gabriel_pass_receive_between_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCourseActivity = (Button) findViewById(R.id.btnCourseActivity);
        Button btnSongActivity = (Button) findViewById(R.id.btnSongActivity);
        EditText edtCourse = (EditText) findViewById(R.id.edtFavoriteCourse);
        EditText edtSong = (EditText) findViewById(R.id.edtFavoriteSong);
        TextView txtMyName = (TextView) findViewById(R.id.txtMyName);

        btnCourseActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String strCourse = edtCourse.getText().toString();
                String strNameCourse = txtMyName.getText().toString();

                Intent intentCourse = new Intent(getApplicationContext(), favoriteCourse.class);
                intentCourse.putExtra("message_key1", strCourse);
                intentCourse.putExtra("message_key2",strNameCourse);

                //Intent intentNameCourse = new Intent(getApplicationContext(), favoriteSong.class);
                //intentNameCourse.putExtra("message_key2", strNameCourse);

                startActivity((intentCourse));
            }
        });

        btnSongActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String strSong = edtSong.getText().toString();
                String strNameSong = txtMyName.getText().toString();

                Intent intentSong = new Intent(getApplicationContext(), favoriteSong.class);
                intentSong.putExtra("message_key3", strSong);

                Intent intentNameSong = new Intent(getApplicationContext(), favoriteSong.class);
                intentNameSong.putExtra("message_key4", strNameSong);

            }
        });

    }
}