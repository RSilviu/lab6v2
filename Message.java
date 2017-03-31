/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.Date;

/**
 *
 * @author Silviu
 */
public class Message extends Entity<Message>
{

    Date createdAt;
    String text;
    User postedBy;

    public Date getCreatedAt()
    {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt)
    {
        this.createdAt = createdAt;
    }

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    public User getPostedBy()
    {
        return postedBy;
    }

    public void setPostedBy(User postedBy)
    {
        this.postedBy = postedBy;
    }
    
    public Message(Date createdAt, String text, User postedBy)
    {
        this.createdAt = createdAt;
        ++id;
        this.text = text;
        this.postedBy = postedBy;
    }

}
