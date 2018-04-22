package apps.mfonobongumondia.com.tictactoe;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);}
    public void exit_click(View v) {
        AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);

        dlgAlert.setMessage("Do you really want to exit");
        dlgAlert.setTitle("Exit");

        dlgAlert.setCancelable(true);
        dlgAlert.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        System.exit(0);
                    }
                });
        dlgAlert.create().show();
    }


    public void about_click(View v) {
        Intent myIntent = new Intent(Welcome.this, Instructions.class);
        Welcome.this.startActivity(myIntent);
    }

    public void normal_click(View v) {
        Intent i = new Intent(Welcome.this, TwoPlayers.class);
        startActivity(i);
    }

    public void ultimate_click(View v) {

        Intent intent=new Intent(Welcome.this,SinglePlayer.class);
        startActivity(intent);
    }

    public void ultimate_click2(View view){
        Intent intent = new Intent(Welcome.this, Ultimate.class);
        startActivity(intent);
    }
}
