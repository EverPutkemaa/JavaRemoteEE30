package UserValidatorHomeW2.exersisesTask4;

import java.util.List;

class Episode {
    int number;
    String name;
    List<Video> video;

    public Episode(int number, String name,List<Video> video) {
        this.number = number;
        this.name = name;
        this.video = video;
    }
}
