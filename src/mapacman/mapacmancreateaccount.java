/* $Id: mapacmancreateaccount.java,v 1.3 2004/04/26 15:25:30 arianne_rpg Exp $ */
/***************************************************************************
 *                      (C) Copyright 2003 - Marauroa                      *
 ***************************************************************************
 ***************************************************************************
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *                                                                         *
 ***************************************************************************/
package mapacman;

import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;
import marauroa.game.*;
import marauroa.Configuration;

public class mapacmancreateaccount extends marauroa.createaccount
  {
  public static void main (String[] args)
    {
    mapacmancreateaccount instance=new mapacmancreateaccount();
    System.exit(instance.run(args));
    }
  
  public mapacmancreateaccount()
    {
    super();

    Configuration.setConfigurationFile("mapacman.ini");
    }
  
  public RPObject populatePlayerRPObject(PlayerDatabase playerDatabase) throws Exception
    {
    Transaction trans=playerDatabase.getTransaction();
    RPObject object=new RPObject(((JDBCPlayerDatabase)playerDatabase).getValidRPObjectID(trans));
    object.put("type","player");
    object.put("name",get("character"));
    object.put("x",0);
    object.put("y",0);
    object.put("dir","N");
    object.put("score",0);
    
    return object;
    }
  }
