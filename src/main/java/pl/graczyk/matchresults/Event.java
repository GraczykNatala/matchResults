package pl.graczyk.matchresults;

import pl.graczyk.matchresults.Competitor;

import java.util.Arrays;

public class Event {
 private String sport_event_id;
 private String start_date;
 private String sport_name;
  private String competition_name;
 private String competition_id;
 private String season_name;
 private Competitor[] competitors;
 private Venue venue;
 private  double probability_home_team_winner;
 private double probability_draw;
 private  double probability_away_team_winner;

  double highest_probable_result;


    public String getSport_event_id() {
        return sport_event_id;
    }

    public void setSport_event_id(String sport_event_id) {
        this.sport_event_id = sport_event_id;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getSport_name() {
        return sport_name;
    }

    public void setSport_name(String sport_name) {
        this.sport_name = sport_name;
    }

    public String getCompetition_name() {
        return competition_name;
    }

    public void setCompetition_name(String competition_name) {
        this.competition_name = competition_name;
    }

    public String getCompetition_id() {
        return competition_id;
    }

    public void setCompetition_id(String competition_id) {
        this.competition_id = competition_id;
    }

    public String getSeason_name() {
        return season_name;
    }

    public void setSeason_name(String season_name) {
        this.season_name = season_name;
    }

    public Competitor[] getCompetitors() {
        return competitors;
    }

    public void setCompetitors(Competitor[] competitors) {
        this.competitors = competitors;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public double getProbability_home_team_winner() {
        return probability_home_team_winner;
    }

    public void setProbability_home_team_winner(double probability_home_team_winner) {
        this.probability_home_team_winner = probability_home_team_winner;
    }

    public double getProbability_draw() {
        return probability_draw;
    }

    public void setProbability_draw(double probability_draw) {
        this.probability_draw = probability_draw;
    }

    public double getProbability_away_team_winner() {
        return probability_away_team_winner;
    }

    public void setProbability_away_team_winner(double probability_away_team_winner) {
        this.probability_away_team_winner = probability_away_team_winner;
    }

    public Event(String eventId, String startDate,
                 String sportName, String competitionName,
                 String competitionId, String seasonName,
                 Competitor[] competitors, Venue venue,
                 double probabilityHomeTeamWinner,
                 double probabilityDraw,
                 double probabilityAwayTeamWinner) {
        this.sport_event_id = eventId;
        this.start_date = startDate;
        this.sport_name = sportName;
        this.competition_name = competitionName;
        this.competition_id = competitionId;
        this.season_name = seasonName;
        this.competitors = competitors;
        this.venue = venue;
        this.probability_home_team_winner = probabilityHomeTeamWinner;
        this.probability_draw = probabilityDraw;
        this.probability_away_team_winner = probabilityAwayTeamWinner;
    }


public double HighestProbableResult(double probability_home_team_winner,
                                    double probability_draw,
                                    double probability_away_team_winner) {
        double highest_probable_result = Math.max(probability_draw,
            Math.max(probability_away_team_winner, probability_home_team_winner));


        return highest_probable_result; }

    public String HighestProbableResultName() {
        highest_probable_result = HighestProbableResult(probability_home_team_winner,probability_draw,probability_away_team_winner);
        String highestProbableResultName = null;
         if( highest_probable_result == probability_home_team_winner){
             highestProbableResultName = "HOME_TEAM_WIN";
         } else if(highest_probable_result == probability_draw) {
             highestProbableResultName = "DRAW";
         } else if(highest_probable_result == probability_away_team_winner) {
             highestProbableResultName = "AWAY_TEAM_WIN";
         }  return highestProbableResultName;}


    @Override
    public String toString() {
        return "Start date: " + start_date.replace("T", " ")
                .substring(0,19) + "," + "\n"
        + Arrays.toString(competitors)
                .replace("[", "")
                .replace(",", " vs.")
                .replace("]",",") + "\n"
                + venue + "\n"
                + "Highest probable result : "
                + HighestProbableResultName() + " (" + highest_probable_result + ")" + "\n"
                ;

    }



    }

