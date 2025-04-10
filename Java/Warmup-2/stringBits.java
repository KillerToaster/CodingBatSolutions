public String stringBits(String str) 
{
  String str2 = "";
  if(str.length() >= 1)
  {
    for(int idx = 0; idx < str.length(); idx++)
    {
      if(idx%2 == 0)
        str2 += String.valueOf(str.charAt(idx)); 
    }
  }
  return str2;
}