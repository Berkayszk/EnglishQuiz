package com.berkaysazak.englishquiz
object Constants{
    
    const val TOTAL_QUESTIONS: String ="total_question"
    const val CORRECT_ANSWERS: String ="correct_answers"
    
    fun getQuestions() : ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        //val que1 = Question(1,"He is ………  a car","Drive","Eat","Camel","Ticket",1)
        val que1 = Question(1,"Tom prefers ................. alone ................. out with friends.","to be / to hang","to being / to hanging","being /hanging","being / to hanging",4)
        val que2 = Question(2,"You and I……… at the same school.","'m", "is", "are","isn’t",1)
        val que3 = Question(3,"I can play basketball better than you, .............. I am taller.","and","or","because","but",1)
        val que4 = Question(4,"……………………… happens when we don’t have enough rainfall and waste too much water.","Landslide","Flood","Drought","Avlanche",3)
        val que5 = Question(5,"“What can we do for a better world?","We should walk or bike less and drive more.","We should use energy saving light bulbs.","We shouldn’t plant trees.","We shouldn’t protect wild animals.",2)
        val que6 = Question(6,"Elsa's husband is …………………… setting the table. Elis cooks and her husband sets the table.","necessary","in charge","responsibility","responsible for",4)
        val que7 = Question(7,"I ……………… forget to water the plants. It’s my responsibility at home.","mustn’t","must","have to","am not",1)
        val que8 = Question(8,"My brother hates ……………………. his toys.","loading","tidying up","taking out","mopping",2)
        val que9 = Question(9,"I …………………. my dog for a walk every morning.","taking","takes","take","took",3)
        val que10 = Question(10,"I don’t like listening to classical music. I think it is ...................","trendy","fun","boring","enjoyable",3)

        //val que12 = Question(12,"I’m a vegetarian, so I ................. eat meat.","never","always","often","usually",1)

        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
        questionsList.add(que6)
        questionsList.add(que7)
        questionsList.add(que8)
        questionsList.add(que9)
        questionsList.add(que10)
        //questionsList.add(que11)
        //questionsList.add(que12)


        return  questionsList
    }
}
