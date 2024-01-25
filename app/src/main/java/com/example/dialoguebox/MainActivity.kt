package com.example.dialoguebox

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.dialoguebox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Are you Sure")
            builder1.setMessage("You want to exit this App?")
            builder1.setIcon(R.drawable.sharp_exit_to_app_24)
            builder1.setPositiveButton("Yes",DialogInterface.OnClickListener { dialog, which ->
                finish()
            })
            builder1.setNegativeButton("No",DialogInterface.OnClickListener { dialog, which ->

            })
            builder1.show()

        }
        binding.btn2.setOnClickListener {
            val builder2 = AlertDialog.Builder(this)
            val options = arrayOf("Size XXXL","Size XXL","Size XL","Size L","Size M")

            builder2.setTitle("What size do you want?")
            builder2.setSingleChoiceItems(options,0,DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this,"You clicked on ${options[which]}",Toast.LENGTH_LONG).show()
            })
            builder2.setPositiveButton("Submit",DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this,"Your order is being processed ",Toast.LENGTH_LONG).show()
            })
            builder2.setNegativeButton("Decline",DialogInterface.OnClickListener { dialog, which ->

            })
            builder2.show()

        }
        binding.btn3.setOnClickListener {
            val builder3 = AlertDialog.Builder(this)
            val options = arrayOf("Size XXXL","Size XXL","Size XL","Size L","Size M")

            builder3.setTitle("What size do you want?")
            builder3.setMultiChoiceItems(options, null,DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->

                Toast.makeText(this,"Your order is being processed",Toast.LENGTH_LONG).show()
            })
            builder3.setPositiveButton("Submit",DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this,"Your order is being processed",Toast.LENGTH_LONG).show()
            })
            builder3.setNegativeButton("Decline",DialogInterface.OnClickListener { dialog, which ->

            })
            builder3.show()

        }

    }
}