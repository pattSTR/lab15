package lab10;

public class Football implements Playable, Scorable {
    private String team1;
    private String team2;
    private int duration;
    private int scoreTeam1;
    private int scoreTeam2;

    public Football(String team1, String team2, int duration) {
        this.team1 = team1;
        this.team2 = team2;
        this.duration = duration;
        this.scoreTeam1 = 0;
        this.scoreTeam2 = 0;
    }

    @Override
    public void play() {
        System.out.println("Футбольный матч начался: " + team1 + " против " + team2 + " (Длительность: " + duration + " мин.)");
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public void score() {
        if (Math.random() > 0.5) {
            scoreTeam1++;
            System.out.println("⚽ Гол забивает " + team1 + "! (+1)");
        } else {
            scoreTeam2++;
            System.out.println("⚽ Гол забивает " + team2 + "! (+1)");
        }
    }

    @Override
    public String getScore() {
        return team1 + " [" + scoreTeam1 + " : " + scoreTeam2 + "] " + team2;
    }

    public String getTeam1() { return team1; }
    public String getTeam2() { return team2; }
}