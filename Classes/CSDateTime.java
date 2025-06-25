package Classes;

public class CSDateTime extends CSDate{
  private int hours;
  private int minutes;



  public void setHours(int h){
    if(h >= 0 && h <= 23) hours = h;
  }
  public void setMinutes(int m){
    if(m >= 0 && m <= 59)minutes = m;
  }
  public int getHours(){
    return hours;
  }
  public int getMinutes(){
    return minutes;
  }
  @Override
  public String toString(){
    return String.format("%02d/%02d/%04d %02d:%02d", getMonth(), getDay(), getYear(), hours, minutes);
  }
  public CSDateTime(){
    super(1,1,1800);
    setHours(0);
    setMinutes(0);
  }
  public CSDateTime(int d, int m, int y, int h, int min){
     super(d, m, y);
     setHours(h);
     setMinutes(min);
  }

}
