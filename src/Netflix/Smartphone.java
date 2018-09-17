package Netflix;

public class Smartphone implements NetflixPlayer {
    @Override
    public String play() {
        return "Played on a smartphone";
    }

    @Override
    public String pause() {
        return "Paused on a smartphone";
    }

    @Override
    public String rewind() {
        return "Rewound on a smartphone";
    }
}
