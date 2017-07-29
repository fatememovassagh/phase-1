
package entities;

public class school {
    private string _name;
    private int _numOfStudents;
    private boolean _housed;
    private ArrayList<String> _houseNames;
    private ArrayList<String> _courseNames;
    private Vector<String> _professorNames;
    private Vector<String> _studentNames;
     
    public School(String name)
    {
    _name = name;
    _houseNames = new ArrayList<String>();
    _courseNames = new ArrayList<String>();
    _studentNames = new Vector<String>();
    _professorNames = new Vector<String>();
    
}
    public School(String name ,ArrayList<String> houses ,ArrayList<String> courses,Vector<String> students,Vector<String> professors)
    {
        _name = name;
        _houseNames = houses;
        _courseNames =courses;
        _professorNames = professors;
        _studentNames = students;
        if(_studentNames != null)
            _numOfStudents = _studentNames.size();
        else
            _numOfStudents = 0;
        if(houses == null || houses.isEmpty())
        _housed = false ;
        else
            -housed = true;
         }
    
    public String getName(){
            return _name;
    }
    public String setName(String a){
        _name = a;
    }
    public String gethouseName(){
        return _houseNames;
    }
    public String sethouseName(String b){
        _houseNames = b;
    }
    public String getcourseNames(){
        return _courseNames;
    }
    public String setcourseNames(String c){
        _courseNames = c;
    }
    public String getprofessorNames(){
        return _professorNames;
    }
    public String setprofessorNames(String d){
        _professorNames = d;
    }
    public String getstudentNames(){
        return _studentNames;
    }
    public String setstudentNames(String e){
        _studentNames = e;
    }
    
    