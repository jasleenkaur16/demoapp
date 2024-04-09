import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.demoapp.R
import com.example.demoapp.create_acc

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<TextView>(R.id.button)

        // Setting up click listener on the TextView
        button.setOnClickListener {
            val intent = Intent(this, create_acc::class.java)
            startActivity(intent)
        }
    }
}
