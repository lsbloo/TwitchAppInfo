package app.info.twitchapp.home.view

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import app.info.twitchapp.R
import app.info.twitchapp.home.adapter.HomeFragmentAdapter

class HomeFragmentOne : Fragment(), SearchView.OnQueryTextListener {

    private lateinit var adapterFragments: HomeFragmentAdapter
    private lateinit var viewpager: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)
        return inflater.inflate(R.layout.fragment_description_one, container,false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        menu.clear()
        inflater.inflate(R.menu.menu_home,menu)
        val searchV = SearchView((context as HomeActivity).supportActionBar?.themedContext ?: context)
        menu.findItem(R.id.action_search). apply {
            setShowAsAction(MenuItem.SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW or MenuItem.SHOW_AS_ACTION_IF_ROOM)
            actionView = searchV
        }

        searchV.setOnQueryTextListener(this)
    }

    override fun onQueryTextSubmit(query: String?): Boolean {
        System.err.println(query)
        return true
    }

    override fun onQueryTextChange(newText: String?): Boolean {
        System.err.println(newText)
        return true
    }

    companion object {
        public const val NAME_FRAGMENT="DescriptionFragmentOne"
    }

}