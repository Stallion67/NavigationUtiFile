package com.divinegrace.navigationutifile


//added code
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.view.MenuItem
import android.support.v4.widget.DrawerLayout
import android.support.design.widget.NavigationView
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val fab: FloatingActionButton = findViewById(R.id.fab)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        navView.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_home -> {
                // Handle the camera action
              //coded added
                replaceFragment(
                    fragment = contete(),
                    allowStateLoss = true,
                    containerViewId = R.id.mainContent
                )
                setTitle("Home")

            }
            R.id.nav_gallery -> {
                //coded added
                replaceFragment(
                    fragment = Gallery(),
                    allowStateLoss = true,
                    containerViewId = R.id.mainContent
                )
                setTitle("Gallery")

            }
            R.id.nav_slideshow -> {
                //coded added
                replaceFragment(
                    fragment = Slideshow(),
                    allowStateLoss = true,
                    containerViewId = R.id.mainContent
                )
                setTitle("Slide Show")

            }
            R.id.nav_tools -> {
                //coded added
                replaceFragment(
                    fragment = Tools(),
                    allowStateLoss = true,
                    containerViewId = R.id.mainContent
                )
                setTitle("Tools")


            }
            R.id.nav_share -> {
                //coded added
                replaceFragment(
                    fragment = Share(),
                    allowStateLoss = true,
                    containerViewId = R.id.mainContent
                )
                setTitle("Share")


            }
            R.id.nav_send -> {
                //coded added
                replaceFragment(
                    fragment = Send(),
                    allowStateLoss = true,
                    containerViewId = R.id.mainContent
                )
                setTitle("Send")


            }
        }
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}
