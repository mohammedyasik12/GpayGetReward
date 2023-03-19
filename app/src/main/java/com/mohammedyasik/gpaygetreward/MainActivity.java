package com.mohammedyasik.gpaygetreward;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.yas.uiux.getrewards.views.RewrdsView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = ((LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE));




        //REMOVE TOOLBAR
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}

        setContentView(R.layout.activity_main);

        RewrdsView rewardsLayoutView = findViewById(R.id.scratch_card);
        rewardsLayoutView.setStrokeWidth(20);


        rewardsLayoutView.setRewardView(R.layout.activity_reward);


        rewardsLayoutView.setRevealListener(new RewrdsView.IRevealListener() {
            @Override
            public void onRevealed(RewrdsView tv) {
                // on reveal
            }

            @Override
            public void onRevealPercentChangedListener(RewrdsView siv, float percent) {
                // on percent change
            }
        });
    }

}
