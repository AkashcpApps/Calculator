package com.akashcp.calculator;

import android.graphics.Color;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class CalActivity extends AppCompatActivity {
    boolean tmp=false;
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnPercent,btnPlus,btnMinus,btnMultiply,btnDivision,btnEqual,btnClear,btnDot,btnBracket;
    TextView tvInput,tvOutput;
    String process;
    boolean checkBracket = false;
    ImageButton del;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);
        del=(ImageButton)findViewById(R.id.back);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnDivision = findViewById(R.id.btnDivision);
        btnMultiply = findViewById(R.id.btnMultiply);

        btnEqual = findViewById(R.id.btnEqual);

        btnClear = findViewById(R.id.btnClear);
        btnDot = findViewById(R.id.btnDot);
        btnPercent = findViewById(R.id.btnPercent);
        btnBracket = findViewById(R.id.btnBracket);

        tvInput = findViewById(R.id.tvInput);
        tvOutput = findViewById(R.id.tvOutput);
        tvInput.setText("0.0");
        tvOutput.setText("0.0");


      btnClear.setOnTouchListener(new View.OnTouchListener() {
          @Override
          public boolean onTouch(View v, MotionEvent event) {
              if(event.getAction() == MotionEvent.ACTION_DOWN) {
                  btnClear.setBackgroundColor(Color.parseColor("#FF8C00"));
                  tvInput.setText("");
                  tvOutput.setText("");

              }
              else if (event.getAction() == MotionEvent.ACTION_UP) {
                  btnClear.setBackgroundColor(Color.parseColor("#E62600"));

              }
              return true;

          }
      });


      btn0.setOnTouchListener(new View.OnTouchListener() {
          @Override
          public boolean onTouch(View v, MotionEvent event) {
              if(event.getAction() == MotionEvent.ACTION_DOWN) {
                  btn0.setBackgroundColor(Color.parseColor("#FF8C00"));
                  process = tvInput.getText().toString();
                  tvInput.setText(process + "0");

              }
              else if (event.getAction() == MotionEvent.ACTION_UP) {
                  btn0.setBackgroundColor(Color.parseColor("#000000"));

              }
              return true;

          }
      });

        btn1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    btn1.setBackgroundColor(Color.parseColor("#FF8C00"));
                    process = tvInput.getText().toString();
                    tvInput.setText(process + "1");

                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    btn1.setBackgroundColor(Color.parseColor("#000000"));

                }
                return true;

            }
        });


        btn2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    btn2.setBackgroundColor(Color.parseColor("#FF8C00"));
                    process = tvInput.getText().toString();
                    tvInput.setText(process + "2");

                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    btn2.setBackgroundColor(Color.parseColor("#000000"));

                }
                return true;

            }
        });

        btn3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    btn3.setBackgroundColor(Color.parseColor("#FF8C00"));
                    process = tvInput.getText().toString();
                    tvInput.setText(process + "3");

                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    btn3.setBackgroundColor(Color.parseColor("#000000"));

                }
                return true;

            }
        });

        btn4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    btn4.setBackgroundColor(Color.parseColor("#FF8C00"));
                    process = tvInput.getText().toString();
                    tvInput.setText(process + "4");

                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    btn4.setBackgroundColor(Color.parseColor("#000000"));

                }
                return true;

            }
        });

        btn5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    btn5.setBackgroundColor(Color.parseColor("#FF8C00"));
                    process = tvInput.getText().toString();
                    tvInput.setText(process + "5");

                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    btn5.setBackgroundColor(Color.parseColor("#000000"));

                }
                return true;

            }
        });


        btn6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    btn6.setBackgroundColor(Color.parseColor("#FF8C00"));
                    process = tvInput.getText().toString();
                    tvInput.setText(process + "6");

                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    btn6.setBackgroundColor(Color.parseColor("#000000"));

                }
                return true;

            }
        });

        btn7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    btn7.setBackgroundColor(Color.parseColor("#FF8C00"));
                    process = tvInput.getText().toString();
                    tvInput.setText(process + "7");

                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    btn7.setBackgroundColor(Color.parseColor("#000000"));

                }
                return true;

            }
        });

        btn8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    btn8.setBackgroundColor(Color.parseColor("#FF8C00"));
                    process = tvInput.getText().toString();
                    tvInput.setText(process + "8");

                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    btn8.setBackgroundColor(Color.parseColor("#000000"));

                }
                return true;

            }
        });


        btn9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    btn9.setBackgroundColor(Color.parseColor("#FF8C00"));
                    process = tvInput.getText().toString();
                    tvInput.setText(process + "9");

                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    btn9.setBackgroundColor(Color.parseColor("#000000"));

                }
                return true;

            }
        });

        del.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    del.setBackgroundColor(Color.parseColor("#FF8C00"));
                    process = tvInput.getText().toString();
                    String finals=(process == null || process.length() == 0) ? null : (process.substring(0, process.length() - 1));
                      tvInput.setText(finals);
                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    del.setBackgroundColor(Color.parseColor("#000000"));

                }
                return true;

            }
        });



        btnPlus.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    btnPlus.setBackgroundColor(Color.parseColor("#FF8C00"));
                    process = tvInput.getText().toString();
                    tvInput.setText(process + "+");
                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    btnPlus.setBackgroundColor(Color.parseColor("#000000"));

                }
                return true;

            }
        });

        btnMinus.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    btnMinus.setBackgroundColor(Color.parseColor("#FF8C00"));
                    process = tvInput.getText().toString();
                    tvInput.setText(process + "-");
                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    btnMinus.setBackgroundColor(Color.parseColor("#000000"));

                }
                return true;

            }
        });
        btnMultiply.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    btnMultiply.setBackgroundColor(Color.parseColor("#FF8C00"));
                    process = tvInput.getText().toString();
                    tvInput.setText(process + "x");
                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    btnMultiply.setBackgroundColor(Color.parseColor("#000000"));

                }
                return true;

            }
        });


        btnDivision.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    btnDivision.setBackgroundColor(Color.parseColor("#FF8C00"));
                    process = tvInput.getText().toString();
                    tvInput.setText(process + "÷");
                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    btnDivision.setBackgroundColor(Color.parseColor("#000000"));

                }
                return true;

            }
        });

        btnDot.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    btnDot.setBackgroundColor(Color.parseColor("#FF8C00"));
                    process = tvInput.getText().toString();
                    tvInput.setText(process + ".");
                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    btnDot.setBackgroundColor(Color.parseColor("#000000"));

                }
                return true;

            }
        });
        btnPercent.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    btnPercent.setBackgroundColor(Color.parseColor("#FF8C00"));
                    process = tvInput.getText().toString();
                    tvInput.setText(process + "%");
                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    btnPercent.setBackgroundColor(Color.parseColor("#000000"));

                }
                return true;

            }
        });

        btnBracket.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    btnBracket.setBackgroundColor(Color.parseColor("#FF8C00"));
                    if (checkBracket){
                        process = tvInput.getText().toString();
                        tvInput.setText(process + ")");
                        checkBracket = false;
                        if(event.getAction() == MotionEvent.ACTION_DOWN)
                        {
                            btnBracket.setBackgroundColor(Color.parseColor("#FF8C00"));
                        }
                        else if (event.getAction() == MotionEvent.ACTION_UP)
                        {
                            btnBracket.setBackgroundColor(Color.parseColor("#000000"));
                        }
                    }else{
                        process = tvInput.getText().toString();
                        tvInput.setText(process + "(");
                        checkBracket = true;
                        if(event.getAction() == MotionEvent.ACTION_DOWN)
                        {
                            btnBracket.setBackgroundColor(Color.parseColor("#FF8C00"));
                        }
                        else if (event.getAction() == MotionEvent.ACTION_UP)
                        {
                            btnBracket.setBackgroundColor(Color.parseColor("#000000"));
                        }
                    }
                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    btnBracket.setBackgroundColor(Color.parseColor("#000000"));

                }
                return true;

            }
        });

btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();

                process = process.replaceAll("x","*");
                process = process.replaceAll("%","/100");
                process = process.replaceAll("÷","/");

                Context rhino = Context.enter();

                rhino.setOptimizationLevel(-1);

                String finalResult = "";

                try {
                    Scriptable scriptable = rhino.initStandardObjects();
                    finalResult = rhino.evaluateString(scriptable,process,"javascript",1,null).toString();
                }catch (Exception e){
                    finalResult="0.0";
                    Toast.makeText(CalActivity.this, e.getMessage().toString(), Toast.LENGTH_SHORT).show();
                }

                tvOutput.setText(finalResult);
            }
        });



    }
}
