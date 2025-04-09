public String missingChar(String str, int n) 
{
  if(n == 0)
    return str.substring(1);
  else if (n == str.length()-1)
    return str.substring(0,n);
  return str.substring(0,n)+str.substring(n+1);
}
