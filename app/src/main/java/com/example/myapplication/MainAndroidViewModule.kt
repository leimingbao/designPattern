package com.example.myapplication

import com.example.myapplication.commandpattern.CommandActivity
import com.example.myapplication.decoretorpatten.DecoratorActivity
import com.example.myapplication.main.MainActivity
import com.example.myapplication.factorypattern.FactoryActivity
import com.example.myapplication.observerpattern.ObserverActivity
import com.example.myapplication.proxypattern.ProxyLoginActivity
import com.example.myapplication.stragetypattern.StrategyActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainAndroidViewModule {

    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector
    abstract fun bindProxyLoginActivity(): ProxyLoginActivity

    @ContributesAndroidInjector
    abstract fun bindFactoryActivity(): FactoryActivity

    @ContributesAndroidInjector
    abstract fun bindStrategyActivity(): StrategyActivity

    @ContributesAndroidInjector
    abstract fun bindCommandActivity(): CommandActivity

    @ContributesAndroidInjector
    abstract fun bindObserverActivity(): ObserverActivity

    @ContributesAndroidInjector
    abstract fun bindDecoratorActivity(): DecoratorActivity
}