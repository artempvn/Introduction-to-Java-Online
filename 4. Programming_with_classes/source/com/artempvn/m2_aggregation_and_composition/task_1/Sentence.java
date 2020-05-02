package com.artempvn.m2_aggregation_and_composition.task_1;
class  Sentence {
private String sentence="";
public Sentence(Word...words){
for (Word w: words){
sentence=sentence.concat(w.getWord()+" ");

}
sentence=sentence.concat(".");
sentence=sentence.replace(" .",".");
}
public String getSentense(){
return sentence;
}

}
