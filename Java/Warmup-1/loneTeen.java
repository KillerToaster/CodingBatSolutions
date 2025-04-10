public boolean loneTeen(int a, int b) 
{
  if( a <= 19 && a >= 13)
    if(b < 13 || b > 19)
      return true;
    else
      return false;
  else if(b >= 13 && b <= 19)
    return true;
  return false;
}