package equalsAndhascode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Step2 {

    public static void main(String[] args) {
        Team team1 = new Team("Baku", "ABB");
        Team team2 = new Team("Baku", "ABB");

        System.out.println(team1.equals(team2));
        System.out.println(team1.hashCode());
        System.out.println(team2.hashCode());

        Map<Team,String> leaders = new HashMap<>();
        leaders.put(new Team("New York", "development"), "Anne");
        leaders.put(new Team("Boston", "development"), "Brian");
        leaders.put(new Team("Boston", "marketing"), "Charlie");

        Team myTeam = new Team("New York", "development");
        String myTeamLeader = leaders.get(myTeam);
        System.out.println(myTeamLeader);

        Team team3 = new Team();
        Team team4 = new Team();
        System.out.println(team3.hashCode());
        System.out.println(team4.hashCode());
    }

}


class Team {

    String city;
    String department;

    public Team() {
    }

    public Team(String city, String department) {
        this.city = city;
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Objects.equals(city, team.city) && Objects.equals(department, team.department);
    }

        @Override
        public int hashCode() {
            return Objects.hash(city, department);
        }
}
