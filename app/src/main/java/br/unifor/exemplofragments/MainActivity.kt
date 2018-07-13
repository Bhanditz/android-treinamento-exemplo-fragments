package br.unifor.exemplofragments

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupViewPager()
        setupBottomNavigationView()

    }

    private fun setupViewPager() {
        viewPager.adapter = MenuAdapter(supportFragmentManager)

        viewPager.addOnPageChangeListener(object: ViewPager.OnPageChangeListener {

            override fun onPageScrollStateChanged(state: Int) {

            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

            }

            override fun onPageSelected(position: Int) {
                val menu = bottomNavigationView.menu.getItem(position)
                bottomNavigationView.selectedItemId = menu.itemId
            }

        })

    }

    private fun setupBottomNavigationView() {

        bottomNavigationView.setOnNavigationItemSelectedListener { menu ->

            when (menu.itemId) {

                R.id.favorites -> {
                    viewPager.setCurrentItem(MenuAdapter.favoritos, true)
                }

                R.id.schedule -> {
                    viewPager.setCurrentItem(MenuAdapter.agenda, true)
                }

                R.id.music -> {
                    viewPager.setCurrentItem(MenuAdapter.musicas, true)
                }

                else -> {
                    Log.d("TAG", "Alguma outra coisa foi clicada!")
                }


            }

            true

        }

    }


}













