public class Event {
 private   String eventId;
  private  String startDate;
  private  String sportName;
  private  String competitionName;
  private  String competitionId;
  private  String seasonName;
  private  Competitor[] competitors;
  private  Venue venue;
   private double probabilityHomeTeamWinner;
   private double probabilityDraw;
   private double probabilityAwayTeamWinner;


    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }

    public String getCompetitionId() {
        return competitionId;
    }

    public void setCompetitionId(String competitionId) {
        this.competitionId = competitionId;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
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

    public double getProbabilityHomeTeamWinner() {
        return probabilityHomeTeamWinner;
    }

    public void setProbabilityHomeTeamWinner(double probabilityHomeTeamWinner) {
        this.probabilityHomeTeamWinner = probabilityHomeTeamWinner;
    }

    public double getProbabilityDraw() {
        return probabilityDraw;
    }

    public void setProbabilityDraw(double probabilityDraw) {
        this.probabilityDraw = probabilityDraw;
    }

    public double getProbabilityAwayTeamWinner() {
        return probabilityAwayTeamWinner;
    }

    public void setProbabilityAwayTeamWinner(double probabilityAwayTeamWinner) {
        this.probabilityAwayTeamWinner = probabilityAwayTeamWinner;
    }

    public Event(String eventId, String startDate,
                 String sportName, String competitionName,
                 String competitionId, String seasonName,
                 Competitor[] competitors, Venue venue,
                 double probabilityHomeTeamWinner,
                 double probabilityDraw,
                 double probabilityAwayTeamWinner) {
        this.eventId = eventId;
        this.startDate = startDate;
        this.sportName = sportName;
        this.competitionName = competitionName;
        this.competitionId = competitionId;
        this.seasonName = seasonName;
        this.competitors = competitors;
        this.venue = venue;
        this.probabilityHomeTeamWinner = probabilityHomeTeamWinner;
        this.probabilityDraw = probabilityDraw;
        this.probabilityAwayTeamWinner = probabilityAwayTeamWinner;


    }
}
