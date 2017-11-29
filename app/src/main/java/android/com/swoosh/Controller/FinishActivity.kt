package android.com.swoosh.Controller

import android.com.swoosh.Model.Player
import android.com.swoosh.R
import android.com.swoosh.Utilities.EXTRA_PLAYER
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeagueText.text = "Looking for ${player.league} ${player.skill} league near you..."
    }
}
