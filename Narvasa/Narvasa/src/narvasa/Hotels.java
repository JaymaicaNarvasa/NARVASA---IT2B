package narvasa;

public class Hotels {
    String name, rtype, pstats, status;
    int id, cout,cin;
    
    public void getHotels(String Name , String Rtype, String Pstats, String Status, int Id, int Cout, int  Cin) {
        this.name = Name;
        this.rtype = Rtype;
        this. pstats = Pstats;
        this.status = Status;
        this.id = Id;
        this.cout = Cout;
        this.cin = Cin;
        
    }
    
    public void viewHotel(){
        System.out.printf("|  %-10d  |  %-10s  |  %-10s  |  %-10d  |  %-10d  |  %-10s  |  %-10s  |",  this.name, this.rtype,this. pstats, this.status, this.id,this.cout, this.cin );
    }
}
