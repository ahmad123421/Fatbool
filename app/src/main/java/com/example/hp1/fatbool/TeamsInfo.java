package com.example.hp1.fatbool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TeamsInfo extends AppCompatActivity {
    TextView tvInfo;
    ImageView teamImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teams_info);

        tvInfo = (TextView) findViewById(R.id.tvTeamInfo);
        teamImage = (ImageView) findViewById(R.id.imgTeam);

        Intent i = getIntent();
        int team = i.getIntExtra("team",0);
        updateInfo(team);

    }
    public void updateInfo(int team){
        if(team == 0){
            tvInfo.setText("al;khsdlkjsdf");
            teamImage.setImageResource(R.drawable.messi);
        }
    }
}
