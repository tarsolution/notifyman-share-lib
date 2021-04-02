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
package com.tarsolution.notifyman.share.plugin;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * The Class defines your plugin information
 */
public class PluginInfo implements Serializable {
    
    private static final long serialVersionUID = -5876811295012854174L;
    public static final String UNDEFINED="UNDEFINED";

    private String name;
    private String author;
    private String version;
    private String description;
    private PluginTypeEnum pluginType;
    private Map<String, Object> configuration;

    /**
     * @param pluginType is required
     * @param name is required
     */
    public PluginInfo(final PluginTypeEnum pluginType, final String name) {
        this(pluginType, name,UNDEFINED);
    }

    public PluginInfo(final PluginTypeEnum pluginType, final String name, final String version) {
        this(pluginType, name,version, UNDEFINED, "",new HashMap<>());
    }

    public PluginInfo(final PluginTypeEnum pluginType, final String name, final String version, final String author,  final String description, 
            final Map<String, Object> configuration) {
        this.name = name;
        this.author = author;
        this.version = version;
        this.description = description;
        this.pluginType = pluginType;
        this.configuration = configuration;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(final String author) {
        this.author = author;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public PluginTypeEnum getPluginType() {
        return pluginType;
    }

    public void setPluginType(final PluginTypeEnum pluginType) {
        this.pluginType = pluginType;
    }

    public Map<String, Object> getConfiguration() {
        return configuration;
    }

    public void setConfiguration(final Map<String, Object> configuration) {
        this.configuration = configuration;
    }
    
   

}
