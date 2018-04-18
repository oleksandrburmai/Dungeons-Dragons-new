package util;


import model.Team;

public class AppMenu {
    public void startGame(){
        OutPutUtil.printWelcomeMessage();
        Team team = new Team();
        OutPutUtil.printInfo();
        team.creatTeam();
    }
}