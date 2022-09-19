package com.example.stayin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.stayin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        this.supportActionBar?.hide()

        animate()

    }

    private fun animate() {
        binding.imgLogo.animate().translationY(-300f).translationX(-1000f).setDuration(0).withEndAction {
            binding.txtTitle.animate().translationY(-100f).alpha(0f).setDuration(0).withEndAction {
                binding.imgLogo.animate().translationY(0f).translationX(0f).setDuration(400).withEndAction {
                    binding.txtTitle.animate().translationY(0f).alpha(1f).setDuration(400).withEndAction {
                        binding.txtTitle.animate().translationY(0f).alpha(1f).setDuration(400).withEndAction {
                            binding.imgLogo.animate().translationY(-800f).translationX(1000f).setDuration(400)
                            binding.txtTitle.animate().translationY(-100f).alpha(0f).setDuration(400)
                            binding.bg.animate().translationY(-3000f).setDuration(400).withEndAction {
                                val i = Intent(this@MainActivity,PresentationActivity::class.java)
                                startActivity(i)
                                finish()
                            }
                        }
                    }
                }
            }
        }
    }

}