package br.unifor.exemplofragments

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class MenuAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    companion object {
        val favoritos = 0
        val agenda    = 1
        val musicas   = 2
    }

    override fun getItem(position: Int): Fragment {

        return when(position) {
            favoritos -> DisciplinasFragment()
            agenda    -> DisciplinasFragment()
            musicas   -> DisciplinasFragment()
            else      -> DisciplinasFragment()
        }

    }

    override fun getCount(): Int {
        return 3
    }


}