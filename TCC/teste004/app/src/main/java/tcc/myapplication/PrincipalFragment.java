package tcc.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PrincipalFragment extends Fragment {

    View minhaView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        minhaView = inflater.inflate(R.layout.principal, container, false);
        getActivity().setTitle("Principal");

        CardView cvCursos = minhaView.findViewById(R.id.cvCursos);
        cvCursos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.addToBackStack(null);
                transaction.replace(R.id.conteudo_fragmento, new CursosFragment());
                transaction.commit();
            }
        });

        CardView cvComunicados = minhaView.findViewById(R.id.cvComunicados);
        cvComunicados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.addToBackStack(null);
                transaction.replace(R.id.conteudo_fragmento, new ComunicadosFragment());
                transaction.commit();
            }
        });

        CardView cvSobre = minhaView.findViewById(R.id.cvSobre);
        cvSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.addToBackStack(null);
                transaction.replace(R.id.conteudo_fragmento, new SobreFragment());
                transaction.commit();
            }
        });

        return minhaView;

    }

}
