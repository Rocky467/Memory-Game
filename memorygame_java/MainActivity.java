package com.example.rakesh.memorygame;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    TextView textViewP1, textViewP2;
    ImageView imageView11,imageView12,imageView13, imageView14,
            imageView21,imageView22,imageView23, imageView24,
            imageView31,imageView32,imageView33, imageView34;

    // Array for the Images
    Integer[] cardArray = {101,102,103,104,105,106,201,202,203,204,205,206};

    // Actual Images
    int image101,image102,image103,image104,image105,image106,
        image201,image202,image203,image204,image205,image206;

    int firstCard, secondCard;

    int clickFirst,clickSecond;

    int cardNo =1;

    int turn = 1;

    int playerPoints = 0, cpuPoints = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewP1 = findViewById(R.id.textViewP1);
        textViewP2 = findViewById(R.id.textViewP2);

        imageView11 = findViewById(R.id.imageView11);
        imageView12 = findViewById(R.id.imageView12);
        imageView13 = findViewById(R.id.imageView13);
        imageView14 = findViewById(R.id.imageView14);
        imageView21 = findViewById(R.id.imageView21);
        imageView22 = findViewById(R.id.imageView22);
        imageView23 = findViewById(R.id.imageView23);
        imageView24 = findViewById(R.id.imageView24);
        imageView31 = findViewById(R.id.imageView31);
        imageView32 = findViewById(R.id.imageView32);
        imageView33 = findViewById(R.id.imageView33);
        imageView34 = findViewById(R.id.imageView34);

        imageView11.setTag(0);
        imageView12.setTag(1);
        imageView13.setTag(2);
        imageView14.setTag(3);
        imageView21.setTag(4);
        imageView22.setTag(5);
        imageView23.setTag(6);
        imageView24.setTag(7);
        imageView31.setTag(8);
        imageView32.setTag(9);
        imageView33.setTag(10);
        imageView34.setTag(11);

        // load the card Images
        frontOfCardResources();

        // shuffle the images
        Collections.shuffle(Arrays.asList(cardArray));

        // changing the color of second player (inactive)
        textViewP2.setTextColor(Color.GRAY);

        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt(String.valueOf(v.getTag()));
                doStuff(imageView11,theCard);
            }
        });

        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt(String.valueOf(v.getTag()));
                doStuff(imageView12,theCard);
            }
        });

        imageView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt(String.valueOf(v.getTag()));
                doStuff(imageView13,theCard);
            }
        });

        imageView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt(String.valueOf(v.getTag()));
                doStuff(imageView14,theCard);
            }
        });

        imageView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt(String.valueOf(v.getTag()));
                doStuff(imageView21,theCard);
            }
        });

        imageView22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt(String.valueOf(v.getTag()));
                doStuff(imageView22,theCard);
            }
        });

        imageView23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt(String.valueOf(v.getTag()));
                doStuff(imageView23,theCard);
            }
        });

        imageView24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt(String.valueOf(v.getTag()));
                doStuff(imageView24,theCard);
            }
        });

        imageView31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt(String.valueOf(v.getTag()));
                doStuff(imageView31,theCard);
            }
        });

        imageView32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt(String.valueOf(v.getTag()));
                doStuff(imageView32,theCard);
            }
        });

        imageView33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt(String.valueOf(v.getTag()));
                doStuff(imageView33,theCard);
            }
        });

        imageView34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt(String.valueOf(v.getTag()));
                doStuff(imageView34,theCard);
            }
        });

    }

    private void doStuff(ImageView imageView, int card) {
        // set the correct image to the ImageView
        if (cardArray[card] == 101) {
            imageView.setImageResource(image101);
        } else if (cardArray[card] == 102) {
            imageView.setImageResource(image102);
        } else if (cardArray[card] == 103) {
            imageView.setImageResource(image103);
        } else if (cardArray[card] == 104) {
            imageView.setImageResource(image104);
        } else if (cardArray[card] == 105) {
            imageView.setImageResource(image105);
        } else if (cardArray[card] == 106) {
            imageView.setImageResource(image106);
        } else if (cardArray[card] == 201) {
            imageView.setImageResource(image201);
        } else if (cardArray[card] == 202) {
            imageView.setImageResource(image202);
        } else if (cardArray[card] == 203) {
            imageView.setImageResource(image203);
        } else if (cardArray[card] == 204) {
            imageView.setImageResource(image204);
        } else if (cardArray[card] == 205) {
            imageView.setImageResource(image205);
        } else if (cardArray[card] == 206) {
            imageView.setImageResource(image206);
        }

        // check which image is selected and save it to temporary variable
        if (cardNo == 1){
            firstCard = cardArray[card];
            if (firstCard > 200){
                   firstCard = firstCard-100;
            }
            cardNo = 2;
            clickFirst = card;

            imageView.setEnabled(false);

        }else if (cardNo == 2){
            secondCard = cardArray[card];
            if (secondCard > 200){
                secondCard = secondCard-100;
            }
            cardNo = 1;
            clickSecond = card;

            imageView11.setEnabled(false);
            imageView12.setEnabled(false);
            imageView13.setEnabled(false);
            imageView14.setEnabled(false);
            imageView21.setEnabled(false);
            imageView22.setEnabled(false);
            imageView23.setEnabled(false);
            imageView24.setEnabled(false);
            imageView31.setEnabled(false);
            imageView32.setEnabled(false);
            imageView33.setEnabled(false);
            imageView34.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // check if the selected images are equal
                    calculate();
                }
            },1000);

        }

    }

    private void calculate() {
        // if images are equal add points
        if (firstCard == secondCard) {
            if (clickFirst == 0) {
                imageView11.setVisibility(View.INVISIBLE);
            } else if (clickFirst == 1) {
                imageView12.setVisibility(View.INVISIBLE);
            } else if (clickFirst == 2) {
                imageView13.setVisibility(View.INVISIBLE);
            } else if (clickFirst == 3) {
                imageView14.setVisibility(View.INVISIBLE);
            } else if (clickFirst == 4) {
                imageView21.setVisibility(View.INVISIBLE);
            } else if (clickFirst == 5) {
                imageView22.setVisibility(View.INVISIBLE);
            } else if (clickFirst == 6) {
                imageView23.setVisibility(View.INVISIBLE);
            } else if (clickFirst == 7) {
                imageView24.setVisibility(View.INVISIBLE);
            } else if (clickFirst == 8) {
                imageView31.setVisibility(View.INVISIBLE);
            } else if (clickFirst == 9) {
                imageView32.setVisibility(View.INVISIBLE);
            } else if (clickFirst == 10) {
                imageView33.setVisibility(View.INVISIBLE);
            } else if (clickFirst == 11) {
                imageView34.setVisibility(View.INVISIBLE);
            }


            if (clickSecond == 0) {
                imageView11.setVisibility(View.INVISIBLE);
            } else if (clickSecond == 1) {
                imageView12.setVisibility(View.INVISIBLE);
            } else if (clickSecond == 2) {
                imageView13.setVisibility(View.INVISIBLE);
            } else if (clickSecond == 3) {
                imageView14.setVisibility(View.INVISIBLE);
            } else if (clickSecond == 4) {
                imageView21.setVisibility(View.INVISIBLE);
            } else if (clickSecond == 5) {
                imageView22.setVisibility(View.INVISIBLE);
            } else if (clickSecond == 6) {
                imageView23.setVisibility(View.INVISIBLE);
            } else if (clickSecond == 7) {
                imageView24.setVisibility(View.INVISIBLE);
            } else if (clickSecond == 8) {
                imageView31.setVisibility(View.INVISIBLE);
            } else if (clickSecond == 9) {
                imageView32.setVisibility(View.INVISIBLE);
            } else if (clickSecond == 10) {
                imageView33.setVisibility(View.INVISIBLE);
            } else if (clickSecond == 11) {
                imageView34.setVisibility(View.INVISIBLE);
            }


             // add points to the correct player
            if (turn == 1){
                playerPoints++;
                textViewP1.setText("P1: "+playerPoints);
            }else if (turn == 2){
                cpuPoints++;
                textViewP2.setText("P2: "+playerPoints);
            }

        }else {
            imageView11.setImageResource(R.drawable.que);
            imageView12.setImageResource(R.drawable.que);
            imageView13.setImageResource(R.drawable.que);
            imageView14.setImageResource(R.drawable.que);
            imageView21.setImageResource(R.drawable.que);
            imageView22.setImageResource(R.drawable.que);
            imageView23.setImageResource(R.drawable.que);
            imageView24.setImageResource(R.drawable.que);
            imageView31.setImageResource(R.drawable.que);
            imageView32.setImageResource(R.drawable.que);
            imageView33.setImageResource(R.drawable.que);
            imageView34.setImageResource(R.drawable.que);

            // change the player turn
            if (turn == 1){
                turn = 2;
                textViewP1.setTextColor(Color.GRAY);
                textViewP2.setTextColor(Color.BLACK);

            }else if (turn == 2){
                turn = 1;
                textViewP1.setTextColor(Color.GRAY);
                textViewP2.setTextColor(Color.BLACK);
            }
        }
        imageView11.setEnabled(true);
        imageView12.setEnabled(true);
        imageView13.setEnabled(true);
        imageView14.setEnabled(true);
        imageView21.setEnabled(true);
        imageView22.setEnabled(true);
        imageView23.setEnabled(true);
        imageView24.setEnabled(true);
        imageView31.setEnabled(true);
        imageView32.setEnabled(true);
        imageView33.setEnabled(true);
        imageView34.setEnabled(true);

        // check if the game is over
            checkEnd();
    }

    private void checkEnd() {
        if (imageView11.getVisibility()== View.INVISIBLE &&
                imageView12.getVisibility()== View.INVISIBLE &&
                imageView13.getVisibility()== View.INVISIBLE &&
                imageView14.getVisibility()== View.INVISIBLE &&
                imageView21.getVisibility()== View.INVISIBLE &&
                imageView22.getVisibility()== View.INVISIBLE &&
                imageView23.getVisibility()== View.INVISIBLE &&
                imageView24.getVisibility()== View.INVISIBLE &&
                imageView31.getVisibility()== View.INVISIBLE &&
                imageView32.getVisibility()== View.INVISIBLE &&
                imageView33.getVisibility()== View.INVISIBLE &&
                imageView34.getVisibility()== View.INVISIBLE){

            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setMessage("Game Over!\nP1: "+playerPoints+"\nP2: "+cpuPoints);
            alert.setCancelable(false);
            alert.setPositiveButton("NEW", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);finish();

                }
            });

            alert.setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();

                }
            });

            AlertDialog alertDialog = alert.create();
            alertDialog.show();
        }
    }

    private void frontOfCardResources() {
        image101 = R.drawable.image101;
        image102 = R.drawable.image102;
        image103 = R.drawable.image103;
        image104 = R.drawable.image104;
        image105 = R.drawable.image105;
        image106 = R.drawable.image106;
        image201 = R.drawable.image201;
        image202 = R.drawable.image202;
        image203 = R.drawable.image203;
        image204 = R.drawable.image204;
        image205 = R.drawable.image205;
        image206 = R.drawable.image206;

    }
}
