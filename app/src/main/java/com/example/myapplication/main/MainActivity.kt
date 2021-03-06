package com.example.myapplication.main

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.myapplication.R
import com.example.myapplication.commandpattern.CommandActivity
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.decoretorpatten.DecoratorActivity
import com.example.myapplication.factorypattern.FactoryActivity
import com.example.myapplication.observerpattern.ObserverActivity
import com.example.myapplication.proxypattern.ProxyLoginActivity
import com.example.myapplication.stragetypattern.StrategyActivity
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mianViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        val dataBinding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        dataBinding.viewModel = mianViewModel
    }

    fun proxyLogin(view: View) {
        val intent = Intent(this, ProxyLoginActivity::class.java)
        startActivity(intent)
    }

    fun factoryActivity(view: View) {
        val intent = Intent(this, FactoryActivity::class.java)
        startActivity(intent)
    }

    fun strategyActivity(view: View) {
        val intent = Intent(this, StrategyActivity::class.java)
        startActivity(intent)
    }

    fun commandActivity(view: View) {
        val intent = Intent(this, CommandActivity::class.java)
        startActivity(intent)
    }

    fun observerActivity(view: View) {
        val intent = Intent(this, ObserverActivity::class.java)
        startActivity(intent)
    }

    fun decoratorActivity(view: View) {
        val intent = Intent(this, DecoratorActivity::class.java)
        startActivity(intent)
    }
}
