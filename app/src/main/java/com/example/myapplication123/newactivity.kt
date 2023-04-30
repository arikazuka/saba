class newactivity : AppCompatActivity() {

    var clickCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.meorepage)

        click.setOnClickListener {
            clickCount++
            if (clickCount >= 1000 && interstitialAd.isLoaded()) {
                clickCount = 0 // reset count
                interstitialAd.show()
            }
        }
    }