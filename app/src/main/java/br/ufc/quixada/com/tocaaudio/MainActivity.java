package br.ufc.quixada.com.tocaaudio;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity  {

    Button tocaB, paraB;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tocaB = (Button) this.findViewById(R.id.tocar);
        paraB = (Button) this.findViewById(R.id.parar);

    }




    public void play(View v) {

        startService(new Intent(this, TocaAudio.class));

    }
}