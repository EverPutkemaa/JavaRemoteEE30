package UserValidatorHomeW2.Task4Continue;

import java.util.List;

public enum VideoType {
    CLIP, PREVIEW, EPISODE
}
class Video {
    public String title;
    public String url;
    public String videoType;

    public Video(String title,String url,String videoType) {
        this.title = title;
        this.title = url;

        this.videoType = videoType;
    }
}
class Episode {
    public String episodeName;
    public int episodeNumber;
    List<Video> videos;

    public Episode(String episodeName,int episodeNumber, List<Video> videos) {
        this.episodeName = episodeName;
        this.episodeNumber = episodeNumber;
        this.videos = videos;

    }
}
class Season {
    public String seasonName;
    public int seasonNumber;
    List<Episode> episodes;

    public Season(String seasonName,int seasonNumber, List<Episode> episodes){
        this.seasonName = seasonName;
        this.seasonNumber = seasonNumber;
        this.episodes = episodes;
    }
}