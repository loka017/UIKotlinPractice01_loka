package com.ateam.uikotlinpractice01_loka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        확인버튼이 눌리면? 이벤트 달아주자.

        okBtn.setOnClickListener {

//          입력된 내용? contentEdt의 text 값 조회(get) 변수에 저장해 두자.


            val getInputText = contentEdt.text.toString()
            resultTxt.text = getInputText
        }
    }
}