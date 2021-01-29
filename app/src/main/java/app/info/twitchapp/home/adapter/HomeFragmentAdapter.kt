package app.info.twitchapp.home.adapter

import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import app.info.twitchapp.home.view.HomeFragmentOne
import app.info.twitchapp.home.view.HomeFragmentTwo

class HomeFragmentAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {



    override fun getItemCount(): Int = 2


    override fun createFragment(position: Int): Fragment {
        Log.d("position", "" + position)
        return when(position) {
            0 -> HomeFragmentOne()
            1 -> HomeFragmentTwo()
            else -> {
                HomeFragmentOne()
            }
        }
    }

    companion object {
        const val ARG_OBJECT="fragmentDescriptionOne"
    }
}