
package entities;


public class course {
    private String _name;
    private char _minGrade;
    private String _professorName:
    private int _year;
    private Vector<String> _studentName;
    
    
    public course(string name){
       _name = name ;
       _minGrade = new char();
       _professorName = new ArrayList<String>();
       _year = 0;
       _studentName = new Vector<String>();
    }
    public course(Sring name,char mingrade,ArrayList<String> professor, Vector<String> student, int year){
        _name = name;
         _minGrade = mingrade;
         _professorName = professor ;
         _year = year;
        _studentName = student; 
        
    }
     public String getName(){
            return _name;
    }
    public String setName(String a){
        _name = a;
    }
     public String getprofessorName(){
        return _professorName;
    }
    public String setprofessorName(String b){
        _professorName = b;
    }
    public String getminGrade(){
        return _minGrade;
    }
    public String setminGrade(String c){
        _minGrade = c;
        
    }
     public String getstudentName(){
        return _studentName;
    }
    public String setstudentName(String e){
        _studentName = e;
    }
           
            
            
     
            
            
            
            
            
            
            
            }
