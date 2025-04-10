public String frontTimes(String str, int n) 
{
  String rString = "";
  if(str.length() >= 3)
  {
    for(int idx = 0; idx < n; idx++)
    {
       rString += str.substring(0,3);
    }
  }
  else
  {
    for(int idx = 0; idx < n; idx++)
    {
      rString += str;
    }
  }
  return rString;
}