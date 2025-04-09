public String everyNth(String str, int n) 
{
   String newStr = String.valueOf(str.charAt(0));
   for(int idx = 1; idx < str.length(); idx++)
   {
     if(idx % n == 0)
      newStr += String.valueOf(str.charAt(idx));
   }
   return newStr;
}