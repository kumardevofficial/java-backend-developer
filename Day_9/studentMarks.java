class StudentMarks
{

  public static void main(String args[])
  {
   int minMarks = 35;
   String stName = args[0];
   int mathMarks = Integer.parseInt(args[1]);
   int scienceMarks = Integer.parseInt(args[2]);
   int englishMarks = Integer.parseInt(args[3]);
   
   System.out.println(stName + "is psass on Math marks " + (mathMarks > minMarks) );
   System.out.println(stName + "is psass on Science marks " + (scienceMarks > minMarks));
   System.out.println(stName + "is psass on English marks " + (englishMarks > minMarks));
   
   System.out.println("Student " + stName + " is pass " + (((mathMarks > minMarks) && (scienceMarks > minMarks)) || (englishMarks > minMarks)) );
  }

}