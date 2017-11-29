package android.com.swoosh.Controller

import android.com.swoosh.R
import android.com.swoosh.Utilities.EXTRA_LEAGUE
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

    }

    fun onMensLeague(view: View) {
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        mensLeagueBtn.isChecked = true
        selectedLeague = "mens"
    }

    fun onWomensLeague(view: View) {
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = true
        selectedLeague = "womens"
    }

    fun onCoedLeague(view: View) {
        womensLeagueBtn.isChecked = false
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = true
        selectedLeague = "coed"
    }

    fun leagueNextClicked(view: View) {
        if (selectedLeague != "") {
            val intent = Intent(this, SkillActivity::class.java)
            intent.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Please select a League.", Toast.LENGTH_LONG).show()
        }
    }
}
