package com.learncamel.bean;

import java.util.logging.Logger;

/**
 * Created by z001qgd on 7/1/17.
 */
public class DataModifier {

    Logger log = Logger.getLogger(DataModifier.class.getName());

    public String map(String input) throws Exception {
        String newBody=null;
        try{
             newBody = input.replace(",", "*");
        }catch(RuntimeException e){
            log.severe("RuntimeException : " + e);
            throw e;
        }
        catch(Exception e){
            log.severe("Exception : " + e);
            throw e;
        }
        return  newBody;

    }
}
