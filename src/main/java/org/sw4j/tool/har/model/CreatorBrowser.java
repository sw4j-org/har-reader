package org.sw4j.tool.har.model;

import com.google.gson.annotations.Expose;

public class CreatorBrowser {

    @Expose
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
