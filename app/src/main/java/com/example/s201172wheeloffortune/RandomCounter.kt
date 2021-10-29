package com.example.s201172wheeloffortune

import java.util.*


fun main(){
val r1 = Random(123456)
val nums1= (1..18).map { r1.nextInt() }
    
    val r2 = Random(12345)
    val nums2 = (1..10).map { r2.nextInt() }
    assertEquals(nums1, nums2)

}

fun assertEquals(nums1: List<Int>, nums2: List<Int>) {

}

