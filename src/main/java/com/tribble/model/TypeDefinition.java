package com.tribble.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TypeDefition")
public class TypeDefinition {

	@Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="internal_name", nullable=false)
	private String internalName;
	
	@Column(name="display_name")
	private String displayName;
	
	@Column(name="description", columnDefinition="TEXT")
	private String description;
	
	@Column(name="icon_path")
	private String iconPath;
	
	@Column(name="instantiable", nullable=false, columnDefinition = "boolean default true")
	private boolean instantiable;
		
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getInternalName() {
		return internalName;
	}
	public void setInternalName(String internalName) {
		this.internalName = internalName;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIconPath() {
		return iconPath;
	}
	public void setIconPath(String iconPath) {
		this.iconPath = iconPath;
	}
	public boolean isInstantiable() {
		return instantiable;
	}
	public void setInstantiable(boolean instantiable) {
		this.instantiable = instantiable;
	}
	@Override
	public String toString() {
		return "TypeDefinition [id=" + id + ", internalName=" + internalName + ", displayName=" + displayName
				+ ", description=" + description + ", iconPath=" + iconPath + ", instantiable=" + instantiable + "]";
	}
}
