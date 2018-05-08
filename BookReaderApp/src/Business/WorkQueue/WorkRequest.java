/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author rishi
 */
public class WorkRequest {    
    private UserAccount sender;
    private UserAccount receiver;
    private String status;   
    

    
    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    @Override
    public String toString() {
        String name = sender.getEmployee().getFirstName() + " " + sender.getEmployee().getLastName();
        return name;
    }
    
    
}
