package app.info.twitchapp.home.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.core.content.ContextCompat
import app.info.twitchapp.R
import app.info.twitchapp.home.adapter.HomeFragmentAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.pager
import kotlinx.android.synthetic.main.activity_main.tab_layout



class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        
        pager.adapter = HomeFragmentAdapter(this)
        val tabLayoutMediator = TabLayoutMediator(tab_layout,pager) {
            tab, position ->
            when(position) {
                0 -> {
                    tab.text = "Topper Games"
                    tab.setIcon( R.drawable.ic_icon_toolbar_games )
                    val bridgeDrawable = tab.orCreateBadge
                    bridgeDrawable.backgroundColor = ContextCompat.getColor(applicationContext,R.color.design_default_color_primary)
                    bridgeDrawable.isVisible = true
                    bridgeDrawable.number=10
                }
                1 -> {
                    tab.text = "Players Streams"
                    tab.setIcon( R.drawable.ic_baseline_people_24 )
                    val bridgeDrawable = tab.orCreateBadge
                    bridgeDrawable.backgroundColor = ContextCompat.getColor(applicationContext,R.color.design_default_color_primary)
                    bridgeDrawable.isVisible = true


                }
            }
        }
        tabLayoutMediator.attach()
    }

}