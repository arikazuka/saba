class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var textView = findViewById<TextView>(R.id.textView)
        var editText = findViewById<EditText>(R.id.editTextTextPersonName)
        var okay = findViewById<TextView>(R.id.okay)
        var next = findViewById<TextView>(R.id.appCompatButton)


        okay.setOnClickListener{
            var name = editText.text.toString()
            textView.text = name.toString()
        }


        next.setOnClickListener{
            var intent = Intent(this, meorepage::class.java )
            startActivity(intent)

        }
    }
}