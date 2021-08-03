/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company and XSK contributors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, v2.0
 * which accompanies this distribution, and is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * SPDX-FileCopyrightText: 2021 SAP SE or an SAP affiliate company and XSK contributors
 * SPDX-License-Identifier: Apache-2.0
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.26 at 10:54:28 AM EET 
//


package com.sap.ndb.datamodelgraph;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Argument of a PredicateOperation i.e. one of the following 3 possibilities:Variable element, constant, parameter
 *
 *
 * <p>Java class for Argument complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Argument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="variableElement" type="{http://www.sap.com/ndb/DataModelGraph.ecore}VariableElement"/&gt;
 *         &lt;element name="constant" type="{http://www.sap.com/ndb/DataModelGraph.ecore}ConstantArgument"/&gt;
 *         &lt;element name="parameter" type="{http://www.sap.com/ndb/DataModelGraph.ecore}ParameterArgument"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Argument", propOrder = {
    "variableElement",
    "constant",
    "parameter"
})
public class Argument {

  protected VariableElement variableElement;
  protected ConstantArgument constant;
  protected ParameterArgument parameter;

  /**
   * Gets the value of the variableElement property.
   *
   * @return possible object is
   * {@link VariableElement }
   */
  public VariableElement getVariableElement() {
    return variableElement;
  }

  /**
   * Sets the value of the variableElement property.
   *
   * @param value allowed object is
   *              {@link VariableElement }
   */
  public void setVariableElement(VariableElement value) {
    this.variableElement = value;
  }

  /**
   * Gets the value of the constant property.
   *
   * @return possible object is
   * {@link ConstantArgument }
   */
  public ConstantArgument getConstant() {
    return constant;
  }

  /**
   * Sets the value of the constant property.
   *
   * @param value allowed object is
   *              {@link ConstantArgument }
   */
  public void setConstant(ConstantArgument value) {
    this.constant = value;
  }

  /**
   * Gets the value of the parameter property.
   *
   * @return possible object is
   * {@link ParameterArgument }
   */
  public ParameterArgument getParameter() {
    return parameter;
  }

  /**
   * Sets the value of the parameter property.
   *
   * @param value allowed object is
   *              {@link ParameterArgument }
   */
  public void setParameter(ParameterArgument value) {
    this.parameter = value;
  }

}
