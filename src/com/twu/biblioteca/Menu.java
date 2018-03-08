package com.twu.biblioteca;

import java.util.ArrayList;

public class Menu {
    private ArrayList<String> messageList = new ArrayList<String>();
    public Menu(String messages){
        String[] str = messages.split(",");
        for(int i=0; i<str.length; i++){
            this.messageList.add(str[i]);
        }
    }

    public ArrayList<String> getMessageList(){
        return messageList;
    }

    public void dispaly(){
        for(int i=0; i<messageList.size(); i++)
            System.out.println(messageList.get(i));
    }
    public boolean invalidMenuOption(String choose){
        if (!messageList.contains(choose)){
            System.out.println("Select a valid option!");
            return false;
        }
        else{
            return true;
        }
    }

    public boolean quit(String ifQuit){
        while(!"Quit".equals(ifQuit)){

        }
        return true;
    }
}
