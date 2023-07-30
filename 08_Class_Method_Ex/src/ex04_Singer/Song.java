package ex04_Singer;

public class Song {

  private String title;
  private String genre;
  private double Playtime;
  
  
  
  
  //setter
  
  public void setTitle(String title) {
    this.title = title;    
  }  
  public void setGenre(String genre) {
    this.genre = genre;
  }  
  public void setPlayTime(double Playtime) {
    this.Playtime = Playtime;
  }
  
  //info
  public void info() {
    System.out.println("제목: " + title + ", 장르: " + genre + ", 재생시간: " + Playtime + "분");
  }
  
}
