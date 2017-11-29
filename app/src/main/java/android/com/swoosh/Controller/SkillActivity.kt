package android.com.swoosh.Controller

import android.com.swoosh.Model.Player
import android.com.swoosh.R
import android.com.swoosh.Utilities.EXTRA_PLAYER
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player = intent.getParcelableExtra(EXTRA_PLAYER)

    }

    fun onBeginner(view: View){
        bollerBtn.isChecked = false
        beginnerBtn.isChecked = true
        player.skill = "beginner"
    }

    fun onBoller(view: View){
        beginnerBtn.isChecked = false
        bollerBtn.isChecked = true
        player.skill= "boller"
    }

    fun onFinish(view: View){
        if(player.skill != ""){
            val intent = Intent(this, FinishActivity::class.java)
            intent.putExtra(EXTRA_PLAYER, player)
            startActivity(intent)
        }else{
            Toast.makeText(this, "Please select a Skill level", Toast.LENGTH_LONG).show()
        }

    }
}
