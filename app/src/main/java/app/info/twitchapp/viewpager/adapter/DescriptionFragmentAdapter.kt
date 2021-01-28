package app.info.twitchapp.viewpager.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class DescriptionFragmentAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {



    override fun getItemCount(): Int = 2


    override fun createFragment(position: Int): Fragment {
        TODO("Not yet implemented")
    }
}