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


package com.sap.ndb.bimodelcalculation;

import com.sap.ndb.basemodelbase.SortDirection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Defines the order of one column
 *
 *
 * <p>Java class for Order complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Order"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="byViewAttributeName" use="required" type="{http://www.sap.com/ndb/RepositoryModelResource.ecore}Identifier" /&gt;
 *       &lt;attribute name="direction" type="{http://www.sap.com/ndb/BaseModelBase.ecore}SortDirection" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Order")
public class Order {

  @XmlAttribute(name = "byViewAttributeName", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String byViewAttributeName;
  @XmlAttribute(name = "direction")
  protected SortDirection direction;

  /**
   * Gets the value of the byViewAttributeName property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getByViewAttributeName() {
    return byViewAttributeName;
  }

  /**
   * Sets the value of the byViewAttributeName property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setByViewAttributeName(String value) {
    this.byViewAttributeName = value;
  }

  /**
   * Gets the value of the direction property.
   *
   * @return possible object is
   * {@link SortDirection }
   */
  public SortDirection getDirection() {
    return direction;
  }

  /**
   * Sets the value of the direction property.
   *
   * @param value allowed object is
   *              {@link SortDirection }
   */
  public void setDirection(SortDirection value) {
    this.direction = value;
  }

}
