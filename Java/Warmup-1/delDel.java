public String delDel(String str) 
{
  if(str.length() >= 4 && str.charAt(1) == 'd' 
    && str.charAt(2) == 'e' && str.charAt(3) == 'l')
    return str.substring(0,1) + str.substring(4);
  return str;
}
