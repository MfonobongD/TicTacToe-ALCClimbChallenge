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
        setContentView(R.layout.welcome);


//        final EditText etPlayer1 = (EditText) findViewById(R.id.etPlayer1);
//        final EditText etPlayer2 = (EditText) findViewById(R.id.etPlayer2);
//
//        Button bPlay = (Button) findViewById(R.id.bPlay);

//        bPlay.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                //Getting strings from edit text
//                String PLAYER_1 = "" + etPlayer1.getText().toString();
//                String PLAYER_2 = "" + etPlayer2.getText().toString();
//
//                //Intents are used to shift from one activity to another.
//                //We can also transfer data with intents.
//
//                //Creating an object of intent through which we can go from current activity to MainAcivity
//                Intent i = new Intent(Welcome.this, TwoPlayers.class);
//
//                //Adding data with intent to transfer.
//                i.putExtra("PLAYER_1", PLAYER_1);
//                i.putExtra("PLAYER_2", PLAYER_2);
//
//                //Calling to intent to open TwoPlayers.
//                startActivity(i);
//
//            }
//        });
    }


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
//        Intent myIntent = new Intent(TwoPlayers.this,NormalActivity.class);
//        TwoPlayers.this.startActivity(myIntent);

        //Intents are used to shift from one activity to another.
        //We can also transfer data with intents.

        //Creating an object of intent through which we can go from current activity to MainAcivity
        Intent i = new Intent(Welcome.this, TwoPlayers.class);

        //Calling to intent to open TwoPlayers.
        startActivity(i);
    }

    public void ultimate_click(View v) {
//        AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
//        dlgAlert.setMessage("Under construction");
//        dlgAlert.setTitle("comming soon");
//        dlgAlert.setCancelable(true);
//        dlgAlert.create().show();

        Intent intent=new Intent(Welcome.this,SinglePlayer.class);
        startActivity(intent);
    }

    public void ultimate_click2(View view){
        Intent intent = new Intent(Welcome.this, Ultimate.class);
        startActivity(intent);
    }
}
