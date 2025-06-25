package Classes;

public class CSDate {
    private int day;
    private int month;
    private int year;

   public void setDay(int d){
    int num = 0;
    switch (month){
        case 4: case 6: case 9: case 11:
            num = 30;
            break;
        case 2:
            num = 28;
            break;
        default:
            num = 31;
            break;
    }
    if (d >= 1 && d <= num){
        day = d;
    }
}
    public int getDay(){
        return day; 
    }
    public void setMonth(int m){
    if (m >= 1 && m <= 12){
        month = m;
    }
}

    public int getMonth(){
        return month;
    }
    public String getMonthName(){
        String _m = " ";
        switch (month){
            case 1:
                _m = "January"; 
                break;
            case 2:
                _m = "Febuary"; 
                break;
            case 3:
                _m = "March"; 
                break;
            case 4:
                _m = "April"; 
                break;
            case 5:
                _m = "May"; 
                break;
            case 6:
                _m = "June"; 
                break;
            case 7:
                _m = "July"; 
                break;
            case 8:
                _m = "August"; 
                break;
            case 9:
                _m = "September"; 
                break;
            case 10:
                _m = "October"; 
                break;
            case 11:
                _m = "November"; 
                break;
            case 12:
                _m = "December"; 
                break;
        }
        return _m;
    } 
   public void setYear(int y){
    if (y >= 1800 && y <= 2025){
        year = y;
    }
}
    public int getYear(){
        return year;
    }
    public CSDate(){
        month = 1;
        day = 1;
        year = 1800;
    }
    public CSDate(int d, int m, int y){
        if ( m < 1 || m > 12){
            m = 1;
        }
        setMonth(m);
        if (d < 1 || d > 31){
            d = 1;
        }
        setDay(d);
        if (y < 1800 || y > 2025){
            y = 1800;
        }
        setYear(y);
    }
  
}
