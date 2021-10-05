package com.berkaysazak.englishquiz

data class Question(
    val id : Int,
    val question: String,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswers: Int
)
{

}