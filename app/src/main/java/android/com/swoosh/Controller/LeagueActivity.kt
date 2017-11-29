package android.com.swoosh.Controller

import android.com.swoosh.Model.Player
import android.com.swoosh.R
import android.com.swoosh.Utilities.EXTRA_PLAYER
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("","");

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

    }

    fun onMensLeague(view: View) {
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        mensLeagueBtn.isChecked = true
        player.league= "mens"
    }

    fun onWomensLeague(view: View) {
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = true
        player.league = "womens"
    }

    fun onCoedLeague(view: View) {
        womensLeagueBtn.isChecked = false
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = true
        player.league = "coed"
    }

    fun leagueNextClicked(view: View) {
        if (player.league != "") {
            val intent = Intent(this, SkillActivity::class.java)
            intent.putExtra(EXTRA_PLAYER, player)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Please select a League.", Toast.LENGTH_LONG).show()
        }
    }
}
