package tcc.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class SobreFragment extends Fragment {

    View minhaView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        minhaView = inflater.inflate(R.layout.sobre, container, false);
        getActivity().setTitle("Sobre");
        return minhaView;
        }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            String paramenter = getArguments().getString("id_curso");
            Toast.makeText(getContext(), paramenter, Toast.LENGTH_SHORT).show();
        }

    }
}
