package com.example.liba

import com.example.libb.showLibBFromB

fun showLibAFromA() = "Lb_A>>>>>>libA"

fun showLibBFromA(): String {
    return showLibBFromB()
}