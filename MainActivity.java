package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.calculator.R;

public class MainActivity extends AppCompatActivity {
    public TextView txv1,txv2,txv3;
    public Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bequal,bdot,bsum,bsub,bmul,bdiv,breset,bexit;
    public String s="";
    boolean add,sub,mul,div,equal,on=false,nothing=false;
    int dot=0;
   float var1=0,var2=0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txv1=findViewById(R.id.textView);
        txv2=findViewById(R.id.textView2);
        txv3=findViewById(R.id.textView3);

        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        b5=findViewById(R.id.button5);
        b6=findViewById(R.id.button6);
        b7=findViewById(R.id.button7);
        b8=findViewById(R.id.button8);
        b9=findViewById(R.id.button9);
        b0=findViewById(R.id.button0);
        bsum=findViewById(R.id.buttonsum);
        bsub=findViewById(R.id.buttonsub);
        bmul=findViewById(R.id.buttonmul);
        bdiv=findViewById(R.id.buttondiv);
        bequal=findViewById(R.id.buttonequal);
        bdot=findViewById(R.id.buttondot);
        breset=findViewById(R.id.buttonreset);
        bexit=findViewById(R.id.buttonexit);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (on==true)
                {
                    txv3.setText(null);
                    on=false;
                }
                if(nothing==true)
                {
                    txv3.setText(null);
                    nothing=false;
                }

                txv2.setText(txv2.getText()+"1");
                txv3.setText(txv3.getText()+""+b1.getText());


            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (on==true)
                {
                    txv3.setText(null);
                    on=false;
                }

                if(nothing==true)
                {
                    txv3.setText(null);
                    nothing=false;
                }
                txv2.setText(txv2.getText()+"2");
                txv3.setText(txv3.getText()+""+b2.getText());


            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (on==true)
                {
                    txv3.setText(null);
                    on=false;
                }

                if(nothing==true)
                {
                    txv3.setText(null);
                    nothing=false;
                }
                txv2.setText(txv2.getText()+"3");
                txv3.setText(txv3.getText()+""+b3.getText());
            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (on==true)
                {
                    txv3.setText(null);
                    on=false;
                }
                if(nothing==true)
                {
                    txv3.setText(null);
                    nothing=false;
                }


                txv2.setText(txv2.getText()+"4");
                txv3.setText(txv3.getText()+""+b4.getText());
            }
        });


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (on==true)
                {
                    txv3.setText(null);
                    on=false;
                }

                if(nothing==true)
                {
                    txv3.setText(null);
                    nothing=false;
                }

                txv2.setText(txv2.getText()+"5");
                txv3.setText(txv3.getText()+""+b5.getText());


            }
        });


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (on==true)
                {
                    txv3.setText(null);
                    on=false;
                }
                if(nothing==true)
                {
                    txv3.setText(null);
                    nothing=false;
                }

                txv2.setText(txv2.getText()+"6");
                txv3.setText(txv3.getText()+""+b6.getText());

            }
        });


        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (on==true)
                {
                    txv3.setText(null);
                    on=false;
                }
                if(nothing==true)
                {
                    txv3.setText(null);
                    nothing=false;
                }

                txv2.setText(txv2.getText()+"7");
                txv3.setText(txv3.getText()+""+b7.getText());

            }
        });


        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (on==true)
                {
                    txv3.setText(null);
                    on=false;
                }
                if(nothing==true)
                {
                    txv3.setText(null);
                    nothing=false;
                }

                txv2.setText(txv2.getText()+"8");
                txv3.setText( txv3.getText()+""+b8.getText());
            }
        });


        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (on==true)
                {
                    txv3.setText(null);
                    on=false;
                }
                if(nothing==true)
                {
                    txv3.setText(null);
                    nothing=false;
                }

                txv2.setText(txv2.getText()+"9");
                txv3.setText(txv3.getText()+""+b9.getText());


            }
        });


        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (on==true)
                {
                    txv3.setText(null);
                    on=false;
                }
                if(nothing==true)
                {
                    txv3.setText(null);
                    nothing=false;
                }

                txv2.setText(txv2.getText()+"0");
                txv3.setText(txv3.getText()+""+b0.getText());
            }
        });



        bsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dot=0;
                if(nothing==true)
                {
                    txv3.setText(null);
                    nothing=false;
                }

                try {
                    var1 = Float.parseFloat(txv2.getText() + "");
                    txv3.setText(txv2.getText()+  "  "   +bsum.getText()+" "+"  ");
                    add = true;
                  //  txv2.setText(var1 +" + ");
                    txv2.setText(null);
                }
                catch (Exception e)
                {
                    //txv3.setError("");
                    nothing=true;
                    txv3.setText("PLEASE ENTER SOME VALUE");

                }
            }

        });


        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dot=0;
                if(nothing==true)
                {
                    txv3.setText(null);
                    nothing=false;
                }
                try {
                    var1 = Float.parseFloat(txv2.getText() + "");
                    txv3.setText(txv2.getText()+  "  "   +bsub.getText()+"  " );
                    sub = true;
                    txv2.setText(null);

                }
                catch(Exception e)
                {
                    //txv2.setError("");
                    nothing=true;
                    txv3.setText("PLEASE ENTER SOME VALUE");
                }


            }
        });


        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dot=0;
                if(nothing==true)
                {
                    txv3.setText(null);
                    nothing=false;
                }
                try {
                    var1 = Float.parseFloat(txv2.getText() + "");
                    txv3.setText(txv2.getText()  +"  "   +bmul.getText()+"  ");
                    mul = true;
                    txv2.setText(null);
                }

                catch(Exception e)
                {
                    //txv2.setError("");
                    nothing=true;
                    txv3.setText("PLEASE ENTER SOME VALUE");
                }
            }
        });


        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dot=0;
                if(nothing==true)
                {
                    txv3.setText(null);
                    nothing=false;
                }
                try {
                    var1 = Float.parseFloat(txv2.getText() + "");
                    txv3.setText(txv2.getText()  +"  "+   bdiv.getText()+"  ");
                    div = true;
                    txv2.setText(null);
                }
                catch(Exception e)
                {
                    //txv2.setError("");
                    nothing=true;
                    txv3.setText("PLEASE ENTER SOME VALUE");
                }
            }
        });


        breset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


           txv2.setText("");
           txv3.setText("");
           dot=0;

            }
        });

        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(nothing==true)
                {
                    txv3.setText(null);
                    nothing=false;
                }

                try {

                    on=true;
                    var2 = Float.parseFloat(txv2.getText() + "");
                    if (add == true) {
                        txv2.setText(var1 + var2 + "");
                        txv3.setText(var1+" + "+var2+" = "+Float.parseFloat(String.valueOf(var1+var2)));
                        add = false;
                    }

                    if (sub == true) {
                        txv2.setText(var1 - var2 + "");
                        txv3.setText(var1+" - "+var2+" = "+(String.valueOf(var1-var2)));
                        sub = false;
                    }

                    if (mul == true) {
                        txv2.setText(var1 * var2 + "");
                        txv3.setText(var1+" * "+var2+" = "+(String.valueOf(var1*var2)));
                        mul = false;
                    }

                    if (div == true) {
                        txv2.setText(var1 / var2 + "");
                        txv3.setText(var1+" / "+var2+" = "+Float.parseFloat(String.valueOf(var1/var2)));
                        div = false;
                    }

                    txv2.setText("");

                }
                catch (Exception e)
                {
                 //   txv3.setError("");
                    nothing=true;
                    txv3.setText("PLEASE ENTER SOME VALUE");
                }
            }
        });

        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dot+=1;
                if (on==true)
                {
                    txv3.setText(null);
                    on=false;
                }

                if(nothing==true)
                {
                    txv3.setText(null);
                    nothing=false;
                }
                if(dot<=1) {
                    txv2.setText(txv2.getText() + ".");
                    txv3.setText(txv3.getText() + "" + bdot.getText());
                }
                else
                {


                }

                }
        });


        bexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
                System.exit(0);

            }
        });

}


}
