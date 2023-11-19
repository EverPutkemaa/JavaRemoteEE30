package UserValidatorHomeW2.exersisesTask4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming {
    public static void main(String[] args) {
        List<Season> seasons = Arrays.asList(
                new Season(1,"Season 1",Arrays.asList(
                new Episode(1,"Episode 1", Arrays.asList(new Video("Video 1","URL1"))),
                new Episode(2,"Episode 2", Arrays.asList(new Video("Video 3","URL2")))

        )),
                new Season(2,"Season 2", Arrays.asList(
                        new Episode(3,"Episode 3",Arrays.asList(new Video("Video 1","URL3"))),
                        new Episode(3,"Episode 4",Arrays.asList(new Video("Video4","URL4")))
                )));
        // List of all episodes
        List<Episode> allEpisodes = seasons.stream().flatMap(season -> season.episodes.stream()).collect(Collectors.toList());
        // List of all videos
        List<Video> allVideos = allEpisodes.stream().flatMap(episode -> episode.video.stream()).collect(Collectors.toList());
        // List of all season names
        List<String> allSeasonsNames = seasons.stream().map(season -> season.name).collect(Collectors.toList());
        // List of all season numbers
        List<Integer> allSeasonNumbers = seasons.stream().map(season -> season.number).collect(Collectors.toList());
        // List of all episode names
        List<String> allEpisodeNames = allEpisodes.stream().map(episode -> episode.name).collect(Collectors.toList());
        // List of episode numbers
        List<Integer> allEpisodeNumbers = allEpisodes.stream().map(episode -> episode.number).collect(Collectors.toList());
        // List of all video names
        List<String> allVideoNames = allVideos.stream().map(video -> video.name).collect(Collectors.toList());
        // List of all video URLs
        List<String> allVideoUrls = allVideos.stream().map(video -> video.url).collect(Collectors.toList());
        // Only episodes from even seasons
        List<Episode> evenSeasonEpisodes = seasons.stream()
                .filter(season -> season.number % 2 == 0).flatMap(season -> season.episodes.stream()).collect(Collectors.toList());
        // Only videos from even seasons
        List<Video> evenSeasonVideos = evenSeasonEpisodes.stream().flatMap(episode -> episode.video.stream()).collect(Collectors.toList());
        // Only videos from even episodes and seasons
        List<Video> evenEpisodeEvenSeasonVideos = evenSeasonVideos.stream().
                filter(video -> video.name.endsWith("2") || video.name.endsWith("4")).collect(Collectors.toList());
        // Only Preview videos from odd episodes and even seasons
        List<Video> oddEpisodeEvenSeasonPreviewVideos = evenSeasonEpisodes.stream().filter(episode -> episode.number % 2 != 0)
                .flatMap(episode -> episode.video.stream()).filter(video -> video.name.toLowerCase().contains("preview")).collect(Collectors.toList());


    }
}
