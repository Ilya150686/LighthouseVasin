package com.example.lighthousevasin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.AlertDialog;
import android.content.DialogInterface;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnNikolaevsky;
    private Button btnTolbuhin;
    private Button btnDerevyanny;
    private Button btnZadniy;
    private Button btnApp;

    private Button btnPeredniy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNikolaevsky = findViewById(R.id.btn_nikolaevsky);
        btnTolbuhin = findViewById(R.id.btn_tolbuhin);
        btnDerevyanny = findViewById(R.id.btn_derevyanny);
        btnZadniy = findViewById(R.id.btn_zadniy);
        btnPeredniy = findViewById(R.id.btn_peredniy);
        btnApp = findViewById(R.id.btn_app);

        btnNikolaevsky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ImageActivity.class);
                intent.putExtra("image", R.drawable.nikolaevsky);
                intent.putExtra("text", "Николаевский маяк");
                startActivity(intent);
            }
        });

        btnTolbuhin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ImageActivity.class);
                intent.putExtra("image", R.drawable.tolbuhin);
                intent.putExtra("text", "Толбухин маяк");
                startActivity(intent);
            }
        });

        btnDerevyanny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ImageActivity.class);
                intent.putExtra("image", R.drawable.derevyanny);
                intent.putExtra("text", "Деревянный маяк");
                startActivity(intent);
            }
        });

        btnZadniy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ImageActivity.class);
                intent.putExtra("image", R.drawable.zadniy);
                intent.putExtra("text", "Задний створный маяк МК");
                startActivity(intent);
            }
        });

        btnPeredniy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ImageActivity.class);
                intent.putExtra("image", R.drawable.peredniy);
                intent.putExtra("text", "Передний створный маяк МК");
                startActivity(intent);
            }
        });

        btnApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("О приложении")
                        .setMessage("Автор приложения - Илья Васин. Все картинки маяков были созданы петербургской группой 3D-графики Вектор. Моделирование - Никифоров Константин, Шарипо Матвей, Игнатова Дарья, Васин Илья. Фоновое изображение создано нейросетью Kandinsky 2.0. Приложение может быть полезно для пользователей, которые хотят узнать больше о маяках Кронштадта и Финского Залива. Они могут использовать приложение для получения информации о различных маяках, их истории и местоположении. Также приложение может помочь туристам, которые планируют посетить Кронштадт и хотят узнать больше о местных достопримечательностях. ")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }
}