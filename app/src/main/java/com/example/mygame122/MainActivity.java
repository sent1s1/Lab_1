import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // установка файла second_layout.xml в качестве интерфейса
        setContentView(R.layout.second_layout);
        super.onCreate(savedInstanceState);
        // получаем элемент TextView
        TextView textView = findViewById(R.id.header);
        //устанавливаем новое значение для этого айди
        textView.setText("5238975138907123");
    }
}