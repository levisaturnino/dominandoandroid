package br.com.levisaturnino.acitivity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import br.com.levisaturnino.acitivity.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String texto = binding.editText.getText().toString();
        Toast.makeText(this, texto, Toast.LENGTH_SHORT).show();
    }
}
