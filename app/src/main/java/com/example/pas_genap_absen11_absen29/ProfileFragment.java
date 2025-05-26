package com.example.pas_genap_absen11_absen29;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class ProfileFragment extends Fragment {

    private ImageView imgProfile1, imgProfile2;
    private TextView tvName1, tvClass1, tvAbsen1;
    private TextView tvName2, tvClass2, tvAbsen2;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_profile, container, false);

        imgProfile1 = root.findViewById(R.id.imgProfile1);
        tvName1 = root.findViewById(R.id.tvName1);
        tvClass1 = root.findViewById(R.id.tvClass1);
        tvAbsen1 = root.findViewById(R.id.tvAbsen1);

        imgProfile2 = root.findViewById(R.id.imgProfile2);
        tvName2 = root.findViewById(R.id.tvName2);
        tvClass2 = root.findViewById(R.id.tvClass2);
        tvAbsen2 = root.findViewById(R.id.tvAbsen2);

        tvName1.setText("Dira Mayzaro Dekantari");
        tvClass1.setText("Kelas: X PPLG 1");
        tvAbsen1.setText("No Absen: 11");

        tvName2.setText("Raden Adika Ruzain Malazi");
        tvClass2.setText("Kelas: X PPLG 1");
        tvAbsen2.setText("No Absen: 29");

        return root;
    }
}
