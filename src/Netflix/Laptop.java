package Netflix;

public class Laptop implements NetflixPlayer {
    @Override
    public String play() {
        return "Played on a laptop";
    }

    @Override
    public String pause() {
        return "Paused on a laptop";
    }

    @Override
    public String rewind() {
        return "Rewound on a laptop";
    }
}
