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

import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;

import com.tarsolution.notifyman.shared.common.Message;
import com.tarsolution.notifyman.shared.plugin.PluginInfo;
import com.tarsolution.notifyman.shared.plugin.StatusEnum;

/**
 * 
 * @author FMARSLAN
 *
 */
public abstract class AbstractOutbound {

    private Consumer<Map<String,Object>> configListener;

    public abstract PluginInfo getInfo();

    /**
     *  The method run your outbound process for sending a message
     * @param message is the message to be sent
     * @return type of {@link Response}
     */
    public abstract Response send(Message message);

    /**
     * The method run as a periodical by a times,
     * in this method, you should check your plugin status
     * @param config includes the plugin configurations, the config parameter a key-value list
     * @return type of StatusEnum 
     */
    public abstract StatusEnum checkStatus(Map<String,Object> config);

    /**
     * The method run when the application is starting
     * in this method you can do all your initialize process.
     * @param config includes the plugin configurations, the config parameter a key-value list
     */
    public abstract void initialize(Map<String,Object> config);

    /**
     * 
     * The method is run when the application is closed, 
     * in this method you can do all your destructions process.
     * 
     */
    public abstract void destroy();

    /**
     * 
     * The method is run when the plugin installed, 
     * in this method you can do all your register process.
     * 
     */
    public abstract void register();

    /**
     * 
     * The method is run when the plugin uninstalled, 
     * in this method you can do all your unregister process.
     * 
     */
    public abstract void unregister();

    public StatusEnum getStatus(){
        return StatusEnum.OK;
    }

    public final void register_config(Consumer<Map<String,Object>> configListener){
        this.configListener=configListener;
    }

    public final void setConfig(Map<String,Object> config){
        this.configListener.accept(config);
    }

    public final String getUUID(){
        return UUID.fromString(getClass().getName()).toString();
    }
}