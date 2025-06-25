package Classes; 
 

public class CSEvent { 

private String name; 
private String Description; 
private CSDateTime eventDateTime; 

public CSEvent(String n, String d, int day, int month, int year, int hours, int minutes){ 

    if(n == null || n.isEmpty() ){ 
        this.name = "Unknown";
    } else{ 
        this.name = n; 
    }
 
if (d == null) { 
        this.Description = ""; 
    } else { 
        this.Description = d; 
    }

this.eventDateTime = new CSDateTime(day, month, year, hours, minutes);


}


public void setName(String n){ 
     this.name = n;
     if( n == null || n.isEmpty() )
     {
     this.name = "Unknown"; 
     }

 
     }

     public void setDescription(String d) { 
    if (d == null) { 
        this.Description = ""; 
    } else { 
        this.Description = d; 
    }
}

     public String getName() 
     { 
     return name; 
     }

     public String getDescription() 
     { 
    return Description; 
    
     }

     public CSDateTime getEventDateTime(){ 
        return eventDateTime;
     }

    @Override
    public String toString()  
    {
    
        return "[" + name + "]\n"  + 
        (Description.isEmpty() ? "" : Description + "\n") + 
        eventDateTime.toString(); 

    }


     


}

