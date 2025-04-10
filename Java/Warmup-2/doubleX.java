boolean doubleX(String str) 
{
    if(str.length() >=2 && str.indexOf('x') != -1)
    {
      if((str.indexOf('x') != str.length()-1) && (str.charAt(str.indexOf('x')+1) == 'x'))
        return true;
    }
    return false;
}
