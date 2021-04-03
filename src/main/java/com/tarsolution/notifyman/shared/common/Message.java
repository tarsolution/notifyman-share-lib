/*
 * Copyright (C) 2011 The Best Company in the World
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * https://github.com/fmarslan/notifyman/blob/master/LICENSE
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tarsolution.notifyman.shared.common;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * The Class define Message model of Notifyman 
 */
public class Message implements Serializable {
    
    private static final long serialVersionUID = -8712903541646903537L;
    
    private String subject;
    private String content;
    private String notificationType;
    private Date messageTime;
    private Map<String,String> userInfo;

    /**
     * 
     * @param subject is your message subject
     * @param content is your message content
     * @param notificationType is your message type
     * @param messageTime is your message time
     * @param userInfo is user info
     */
    public Message(String subject, String content, String notificationType, Date messageTime,
            Map<String, String> userInfo) {
        this.subject = subject;
        this.content = content;
        this.notificationType = notificationType;
        this.messageTime = messageTime;
        this.userInfo = userInfo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public Date getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(Date messageTime) {
        this.messageTime = messageTime;
    }

    public Map<String, String> getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(Map<String, String> userInfo) {
        this.userInfo = userInfo;
    }
    
    
    
}
