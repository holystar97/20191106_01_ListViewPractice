package com.tjoeun.a20191106_01_listviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tjoeun.a20191106_01_listviewpractice.datas.NoticeData

class MainActivity : AppCompatActivity() {

    var noticeList =ArrayList<NoticeData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addNotices()
    }

    fun addNotices(){

        noticeList.add(NoticeData("1번 공지", "1번 내용입니다.","2019-01-01"))
        noticeList.add(NoticeData("2번 공지", "2번 내용입니다.","2019-01-01"))
        noticeList.add(NoticeData("3번 공지", "3번 내용입니다.","2019-04-08"))
        noticeList.add(NoticeData("4번 공지", "4번 내용입니다.","2019-01-01"))
        noticeList.add(NoticeData("5번 공지",  "5번 내용입니다.","2019-02-03"))
        noticeList.add(NoticeData("6번 공지", "6번 내용입니다.","2019-01-01"))
        noticeList.add(NoticeData("7번 공지", "7번 내용입니다.","2019-05-03"))
        noticeList.add(NoticeData("8번 공지", "8번 내용입니다.","2019-01-01"))
        noticeList.add(NoticeData("9번 공지", "9번 내용입니다.","2019-01-09"))
        noticeList.add(NoticeData("10번 공지", "10번 내용입니다.","2019-01-01"))
        noticeList.add(NoticeData("11번 공지", "11번 내용입니다.","2019-09-31"))
        noticeList.add(NoticeData("12번 공지", "12번 내용입니다.","2019-01-31"))
        noticeList.add(NoticeData("13번 공지", "13번 내용입니다.","2019-01-51"))
    }



}
