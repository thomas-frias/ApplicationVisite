package com.example.applicationvisite;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import com.example.applicationvisite.logique.Batiment;

import java.util.ArrayList;

public class FooterFragment extends Fragment {
    private ArrayList<Batiment> list_bat_visited;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_footer,container,false);

        try {

            list_bat_visited = SplashScreenActivity.getSharedBatList();
            int cpt = 0;
            for (Batiment b:list_bat_visited) {
                if (b.isVisited()){
                    cpt++;
                }
            }
            TextView bat_visited = (TextView) rootView.findViewById(R.id.nb_bat_visited);
            String ressource = "Batiments visités " + cpt + "/" + list_bat_visited.size();
            bat_visited.setText(ressource);

            String tmp ="";
            TextView batimentsRestants = (TextView) rootView.findViewById(R.id.text_bat_restant);
            for (Batiment b:list_bat_visited) {
                if (!b.isVisited()){
                    tmp = tmp + b.getBat_nom() + "\n";
                }
            }
            batimentsRestants.setText(tmp);


        }
        catch (Exception e){
            Log.d("DEBUG", "Impossible de charger les éléments ! ils ne sont pas dans le layout actuel" );
        }


        return rootView;
    }
}
