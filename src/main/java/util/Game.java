package util;


import model.Team;


public class Game {

    private Team team;

    public Game() {
        this.team = new Team();
    }

    public void startGame() {
        OutPutUtil.printWelcomeMessage();
        OutPutUtil.printInfo();
        team.creatTeam();
        for (int i = 0; i < team.getHeroes().size(); i++) {
            OutPutUtil.printTeamInfo(team, i);
        }
        gamePlay();
    }

    private void gamePlay(){
        System.out.println("\n\n\nIt is demonstration of hero lvl up:\n");
        for (int i = 0; i < 5; i++) {
            team.distrybXp(100);
            System.out.println();
        }
    }
}