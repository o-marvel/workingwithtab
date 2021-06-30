package com.marvel.workingwithtab.viewtab

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter


class WatsappAdapter(fm: FragmentManager) :FragmentStatePagerAdapter  (fm){

    override fun getPageTitle(position: Int): CharSequence? {
         when(position){
             0 -> return "CHAT"
             1 -> return "Status"
             2 ->  return "calls"
             else -> return "chat"
         }
    }

    override fun getCount(): Int {
    return 3
    }

    override fun getItem(position: Int): Fragment {
      when (position){
          0 -> return ChatFragment()
          1 -> return StatusFragment()
          2 -> return CallsFragment()
          else -> return ChatFragment()
      }
    }
}