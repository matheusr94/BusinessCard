package matheusrodrigues.androidapps.businesscard.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import matheusrodrigues.androidapps.businesscard.databinding.ActivityAddBusinessCardBinding

class AddBusinessCardActivity : AppCompatActivity() {

    private val binding by lazy { ActivityAddBusinessCardBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        insertListener()
    }

    private fun insertListener(){
        binding.btnClose.setOnClickListener{
            finish()
        }
        binding.btnConfirmar.setOnClickListener{

        }

    }
}