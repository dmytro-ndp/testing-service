package org.ndp.psylab.site.model;

import java.util.ArrayList;
import java.util.List;

public class Template
{
   public List<String> getBrands(String color)
   {
      List<String> brands = new ArrayList<String>();
      if (color.equals("amber"))
      {
         brands.add("Jack Amber");
         brands.add("Red Moose");
      }
      else
      {
         brands.add("Jail pale Ale");
         brands.add("Gout Stout");
      }
      
      return brands;
   }
}
