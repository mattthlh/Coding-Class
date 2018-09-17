package Netflix;

public class Tablet implements NetflixPlayer {
    @Override
    public String play() {
        return "Played on a tablet";
    }

    @Override
    public String pause() {
        return "Paused on a tablet";
    }

    @Override
    public String rewind() {
        return "Rewound on a tablet";
    }
}
