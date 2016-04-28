/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.sharedproject_28apr.myjavaservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import com.sharedproject_28apr.myjavaservice.model.*;
import com.wavemaker.runtime.service.annotations.ExposeToClient;

/**
 * This is a singleton class with all of its public methods exposed to the client via controller.
 * Their return values and parameters will be passed to the client or taken
 * from the client respectively.
 */
@ExposeToClient
public class MyJavaService {

    private static final Logger logger=LoggerFactory.getLogger(MyJavaService.class);

    public String sampleJavaOperation(String name) {
        String result = null;
        try {
            logger.debug("Starting sample operation");
            result = "Hello " + name + "!";
            logger.debug("Returning {}", result);
            return result;
        } catch (Exception e) {
            logger.error("Sample java service operation has failed", e);
            throw e;
        }
    }
}
