/*
 * Copyright 2017 Uwe Plonus
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sw4j.tool.har.model;

import com.google.gson.annotations.Expose;

/**
 * <p>
 * This model class is the container for a complete HAR JSON object.
 * </p>
 *
 * @author Uwe Plonus &lt;u.plonus@gmail.com&gt;
 */
public class Har {

    /** The log attribute of the HAR container. */
    @Expose
    private Log log;

    /** The default constructor. */
    public Har() { }

    /**
     * <p>
     * Returns the log attribute of the HAR.
     * </p>
     *
     * @return the log attribute.
     */
    public Log getLog() {
        return log;
    }

    /**
     * <p>
     * Sets the log attribute of the HAR.
     * </p>
     *
     * @param log the log attribute.
     */
    public void setLog(final Log log) {
        this.log = log;
    }

}
