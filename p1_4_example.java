// the more great example of this question
public class p1_4_example
{
   public void replaseSpaces(char[] str, int length)
   {
      int spaceCount = 0, newLength = 0, i = 0; // initialize all of the int in
                                                // the beginning of this program

      for (i = 0; i < length; i++)
      {
         if (str[i] == ' ')
            spaceCount++;
      }

      newLength = length + (spaceCount * 2);
      str[newLength] = '\0'; // add this \0 value to the end, for the print
      for (i = length - 1; i >= 0; i--)
      {
         if (str[i] == ' ')
         {
            str[newLength - 1] = '0';
            str[newLength - 2] = '2';
            str[newLength - 3] = '%';
            newLength = newLength - 3;
         } else
         {
            str[newLength - 1] = str[i];
            newLength = newLength - 1;
         }
      }
      System.out.println(str);
   }

   public static void main(String[] args)
   {
      p1_4_example tst = new p1_4_example();
      char[] ch =
      { 't', 'h', 'e', ' ', 'd', 'o', 'g', ' ', ' ', ' ', ' ', ' ', ' ' };
      int length = 7;
      tst.replaseSpaces(ch, length);
   }
}