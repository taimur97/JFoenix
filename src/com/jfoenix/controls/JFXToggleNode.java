/*
 * Copyright (c) 2015, JFoenix and/or its affiliates. All rights reserved.
 * JFoenix PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package com.jfoenix.controls;

import javafx.beans.DefaultProperty;
import javafx.scene.control.Skin;
import javafx.scene.control.ToggleButton;

import com.jfoenix.skins.JFXToggleNodeSkin;

@DefaultProperty(value="graphic")
public class JFXToggleNode extends ToggleButton {

	private static final String DEFAULT_STYLE_CLASS = "jfx-toggle-node";
	
	public JFXToggleNode() {
		super();
		initialize();
	}
	
	@Override
	protected Skin<?> createDefaultSkin()	{
		return new JFXToggleNodeSkin(this);
	}
	
	private void initialize() {
		this.getStyleClass().add(DEFAULT_STYLE_CLASS);        
	}
	
	
}
