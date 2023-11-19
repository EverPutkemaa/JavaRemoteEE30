package UserValidatorHomeW2.exersisesTask4;

import java.util.List;

class Season {
    int number;
    String name;
    List<Episode> episodes;

    public Season(int number,String name,List<Episode> episodes){
        this.number = number;
        this.name = name;
        this.episodes = episodes;
    }
}
