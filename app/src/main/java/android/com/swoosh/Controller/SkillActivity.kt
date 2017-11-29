package android.com.swoosh.Controller

import android.com.swoosh.R
import android.com.swoosh.Utilities.EXTRA_LEAGUE
import android.com.swoosh.Utilities.EXTRA_SKILL
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var skill = ""
    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }

    fun onBeginner(view: View){
        bollerBtn.isChecked = false
        beginnerBtn.isChecked = true
        skill = "beginner"
    }

    fun onBoller(view: View){
        beginnerBtn.isChecked = false
        bollerBtn.isChecked = true
        skill = "boller"
    }

    fun onFinish(view: View){
        if(skill != ""){
            val intent = Intent(this, FinishActivity::class.java)
            intent.putExtra(EXTRA_LEAGUE, league)
            intent.putExtra(EXTRA_SKILL, skill)
            startActivity(intent)
        }else{
            Toast.makeText(this, "Please select a Skill level", Toast.LENGTH_LONG).show()
        }

    }
}
