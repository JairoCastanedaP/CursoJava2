/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import org.apache.logging.log4j.*;



/**
 *
 * @author ENVYX360
 */
public class HolaMundoAction {
    
    Logger log= LogManager.getLogger(HolaMundoAction.class);
    
    private String saludosAtr;

    public String execute(){
        log.info("ejecutando método execute desde struts2");
        this.saludosAtr="Saludos desde struts2";
        return "exito";
    }
    
    public String getSaludosAtr() {
        return saludosAtr;
    }

    public void setSaludosAtr(String saludosAtr) {
        this.saludosAtr = saludosAtr;
    }
    
    
}
