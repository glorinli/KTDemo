package ktdemo.dogold.xyz.ktdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnHello -> Toast.makeText(this, "Button", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvHello.text = getString(R.string.hello_kt)

        btnHello.setOnClickListener(this)

        var o : Any?  = null

        Log.d("test", "Is obj string? " + (o is String))
    }

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun sum2(a: Int, b: Int) = a + b

    fun str() {
        var str = "haha".toUpperCase()

        var a = 10
        var b=11
    }
}
