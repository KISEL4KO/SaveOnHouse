package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        static double house = 2500000; // price house
        static double account = 10000;// balance
        static double salary = 100000; // salary in month

        static double count = 0;

        static double procentMonth = 10.00/12.00;// procent bank in Moth
        static double percentBank = 10; //procent bank in year
        static String results =""; // result list save

        public static void main(String[] args) {


      System.out.println ("Потребовалось " + count() + " месяцев");

      System.out.println("Осталось" + (account - house ) + "рублей");

         System.out.println(results);


        }


        static double count() {
            while (house > account) {
                count = count + 1; // countMonth++;

                account = account + (account * procentMonth) / 100 + salary;

                results = results + account + " монет ";
            }




            return count;
        }

    private TextView balanceOut; // поле возможного остатка от покупки

    private TextView Check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // присваивание переменным активити элементов представления activity_main
        Check = findViewById(R.id.Check);

        balanceOut = findViewById(R.id.balanceOut); // вывод информации о возможном остатке от покупки
        balanceOut.setText("Потребовалось " + count() + " месяцев " + (results)
        );
        Check.setText("  Осталось " + (account - house ) + "рублей"
        );


    }



    }
