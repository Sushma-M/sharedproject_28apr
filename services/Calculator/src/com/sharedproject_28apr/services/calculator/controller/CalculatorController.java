/**This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
package com.sharedproject_28apr.services.calculator.controller;

import com.sharedproject_28apr.services.calculator.services.CalculatorService;
import com.sharedproject_28apr.services.calculator.Add;
import com.sharedproject_28apr.services.calculator.AddResponse;
import com.sharedproject_28apr.services.calculator.Divide;
import com.sharedproject_28apr.services.calculator.DivideResponse;
import com.sharedproject_28apr.services.calculator.Multiply;
import com.sharedproject_28apr.services.calculator.MultiplyResponse;
import com.sharedproject_28apr.services.calculator.Subtract;
import com.sharedproject_28apr.services.calculator.SubtractResponse;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import com.wordnik.swagger.annotations.*;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

@RestController
@RequestMapping(value = "/calculator", produces = { "application/json", "application/xml" })
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public AddResponse add(@RequestBody Add parameters) {
        return calculatorService.add(parameters);
    }

    @RequestMapping(value = "/divide", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public DivideResponse divide(@RequestParam(value = "intA", required = false) int intA, @RequestParam(value = "intB", required = false) int intB) {
        Divide parameters = new Divide();
        parameters.setIntA(intA);
        parameters.setIntB(intB);
        return calculatorService.divide(parameters);
    }

    @RequestMapping(value = "/multiply", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public MultiplyResponse multiply(@RequestParam(value = "intA", required = false) int intA, @RequestParam(value = "intB", required = false) int intB) {
        Multiply parameters = new Multiply();
        parameters.setIntA(intA);
        parameters.setIntB(intB);
        return calculatorService.multiply(parameters);
    }

    @RequestMapping(value = "/subtract", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public SubtractResponse subtract(@RequestParam(value = "intA", required = false) int intA, @RequestParam(value = "intB", required = false) int intB) {
        Subtract parameters = new Subtract();
        parameters.setIntA(intA);
        parameters.setIntB(intB);
        return calculatorService.subtract(parameters);
    }
}
