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
package com.tarsolution.notifyman.shared.plugin.outbound;

import java.io.Serializable;

import com.tarsolution.notifyman.shared.plugin.StatusEnum;

/**
 * Class defines the response pattern for your 
 * {@link com.tarsolution.notifyman.shared.plugin.outbound.AbstractOutbound#send(com.tarsolution.notifyman.shared.common.Message)} method
 */
public class Response implements Serializable {
    
    private static final long serialVersionUID = -4360088647797937499L;
    private StatusEnum status;
    private String message;

    /**
     * 
     * @param status is required
     * @param message is required
     */
    public Response(StatusEnum status, String message) {
        this.status = status;
        this.message = message;
    }
    
    public static Response ok(){
        return new Response(StatusEnum.OK, "");
    }

    public static Response error(String message){
        return new Response(StatusEnum.ERROR,message);
    }

    public static Response warning(String message){
        return new Response(StatusEnum.ERROR,message);
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    
    
}
