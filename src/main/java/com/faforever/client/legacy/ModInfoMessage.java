package com.faforever.client.legacy;

import com.faforever.client.legacy.message.ServerMessage;

public class ModInfoMessage  extends ServerMessage{

  public boolean join;
  public String name;
  public boolean live;
  public boolean host;
  public String fullname;
  public String desc;
  public Boolean[] options;
  public String icon;
}
