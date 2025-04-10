public String startOz(String str) {
  if (str.length() >= 1 && str.charAt(0) == 'o') 
  {
    if (str.length() >= 2 && str.charAt(1) == 'z')
      return "oz";
    else
      return "o";
  } 
  else if (str.length() >= 2 && str.charAt(1) == 'z')
    return "z";
  return "";
}
