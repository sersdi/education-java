package examples;

public class Monster {
    int eyes;
    int arms;
    int legs;

    Monster(){
        this(2,2,2);
    }
    Monster(int count){
        this(count,count,count);
    }
    Monster(int eyes, int legs, int arms){
        this.eyes = eyes;
        this.arms = legs;
        this.legs = arms;
    }
    void voice(){
        voice(1);
    }
    void voice(int count){
        voice(count,"GRRRRR");

    }
    void voice(int count,String words){
        for(int i  = 0; i<count;i++){
            System.out.println(words);
        }
    }





}
