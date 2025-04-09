public boolean stringE(String str) 
{
  int count = 0;
  for(int idx = 0; idx < str.length(); idx++)
  {
     if(str.charAt(idx) == 'e')
      count++;
  }
  if(count == 1 || count == 3)
    return true;
  return false;
}
