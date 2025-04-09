public boolean sleepIn(boolean weekday, boolean vacation) 
{
  if((weekday && vacation) || (vacation) || (!weekday && !vacation))
    return true;
  return false;
}
