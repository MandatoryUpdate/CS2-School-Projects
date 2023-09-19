public class gradeCheck
{
    public static void main(String[] args)
    {
        int[] sampleData = {78,92,31,82,77,73,55,65};
        
        for(int i = 0 ; i<=sampleData.length-1 ; i++)
        {
            System.out.println(check(sampleData[i]) + "\n");
        }
    }
    
    public static String check(int grade)
    {
        String letterGrade = "";
        if(grade >= 90)
        {
            letterGrade = "A";
        }
        else if(80<=grade && grade<90)
        {
            letterGrade = "B";
        }
        else if(75<=grade && grade < 80)
        {
            letterGrade = "C";
        }
        else if(70<=grade && grade < 75)
        {
            letterGrade = "D";
        }
        else if(70 > grade)
        {
            letterGrade = "F";
        }
        return "Enter a number grade :: " + grade + "\n" + grade + " is a " + letterGrade;
    }
}
