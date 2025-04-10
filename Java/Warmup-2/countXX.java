int countXX(String str) 
{
  if(str.length() >= 2)
  {
    int count = 0;
    for(int idx = 0; idx < str.length()-1; idx++)
    {
      if(str.charAt(idx) == 'x' && str.charAt(idx+1) == 'x')
        count++;
    }
    return count;
  }
  else
    return 0;
}
