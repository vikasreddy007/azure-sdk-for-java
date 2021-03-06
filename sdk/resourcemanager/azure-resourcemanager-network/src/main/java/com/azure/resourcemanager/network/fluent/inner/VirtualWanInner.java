// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.OfficeTrafficCategory;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The VirtualWan model. */
@JsonFlatten
@Fluent
public class VirtualWanInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualWanInner.class);

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Vpn encryption to be disabled or not.
     */
    @JsonProperty(value = "properties.disableVpnEncryption")
    private Boolean disableVpnEncryption;

    /*
     * List of VirtualHubs in the VirtualWAN.
     */
    @JsonProperty(value = "properties.virtualHubs", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> virtualHubs;

    /*
     * List of VpnSites in the VirtualWAN.
     */
    @JsonProperty(value = "properties.vpnSites", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> vpnSites;

    /*
     * True if branch to branch traffic is allowed.
     */
    @JsonProperty(value = "properties.allowBranchToBranchTraffic")
    private Boolean allowBranchToBranchTraffic;

    /*
     * True if Vnet to Vnet traffic is allowed.
     */
    @JsonProperty(value = "properties.allowVnetToVnetTraffic")
    private Boolean allowVnetToVnetTraffic;

    /*
     * The office local breakout category.
     */
    @JsonProperty(value = "properties.office365LocalBreakoutCategory", access = JsonProperty.Access.WRITE_ONLY)
    private OfficeTrafficCategory office365LocalBreakoutCategory;

    /*
     * The provisioning state of the virtual WAN resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The type of the VirtualWAN.
     */
    @JsonProperty(value = "properties.type")
    private String typePropertiesType;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the disableVpnEncryption property: Vpn encryption to be disabled or not.
     *
     * @return the disableVpnEncryption value.
     */
    public Boolean disableVpnEncryption() {
        return this.disableVpnEncryption;
    }

    /**
     * Set the disableVpnEncryption property: Vpn encryption to be disabled or not.
     *
     * @param disableVpnEncryption the disableVpnEncryption value to set.
     * @return the VirtualWanInner object itself.
     */
    public VirtualWanInner withDisableVpnEncryption(Boolean disableVpnEncryption) {
        this.disableVpnEncryption = disableVpnEncryption;
        return this;
    }

    /**
     * Get the virtualHubs property: List of VirtualHubs in the VirtualWAN.
     *
     * @return the virtualHubs value.
     */
    public List<SubResource> virtualHubs() {
        return this.virtualHubs;
    }

    /**
     * Get the vpnSites property: List of VpnSites in the VirtualWAN.
     *
     * @return the vpnSites value.
     */
    public List<SubResource> vpnSites() {
        return this.vpnSites;
    }

    /**
     * Get the allowBranchToBranchTraffic property: True if branch to branch traffic is allowed.
     *
     * @return the allowBranchToBranchTraffic value.
     */
    public Boolean allowBranchToBranchTraffic() {
        return this.allowBranchToBranchTraffic;
    }

    /**
     * Set the allowBranchToBranchTraffic property: True if branch to branch traffic is allowed.
     *
     * @param allowBranchToBranchTraffic the allowBranchToBranchTraffic value to set.
     * @return the VirtualWanInner object itself.
     */
    public VirtualWanInner withAllowBranchToBranchTraffic(Boolean allowBranchToBranchTraffic) {
        this.allowBranchToBranchTraffic = allowBranchToBranchTraffic;
        return this;
    }

    /**
     * Get the allowVnetToVnetTraffic property: True if Vnet to Vnet traffic is allowed.
     *
     * @return the allowVnetToVnetTraffic value.
     */
    public Boolean allowVnetToVnetTraffic() {
        return this.allowVnetToVnetTraffic;
    }

    /**
     * Set the allowVnetToVnetTraffic property: True if Vnet to Vnet traffic is allowed.
     *
     * @param allowVnetToVnetTraffic the allowVnetToVnetTraffic value to set.
     * @return the VirtualWanInner object itself.
     */
    public VirtualWanInner withAllowVnetToVnetTraffic(Boolean allowVnetToVnetTraffic) {
        this.allowVnetToVnetTraffic = allowVnetToVnetTraffic;
        return this;
    }

    /**
     * Get the office365LocalBreakoutCategory property: The office local breakout category.
     *
     * @return the office365LocalBreakoutCategory value.
     */
    public OfficeTrafficCategory office365LocalBreakoutCategory() {
        return this.office365LocalBreakoutCategory;
    }

    /**
     * Get the provisioningState property: The provisioning state of the virtual WAN resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the typePropertiesType property: The type of the VirtualWAN.
     *
     * @return the typePropertiesType value.
     */
    public String typePropertiesType() {
        return this.typePropertiesType;
    }

    /**
     * Set the typePropertiesType property: The type of the VirtualWAN.
     *
     * @param typePropertiesType the typePropertiesType value to set.
     * @return the VirtualWanInner object itself.
     */
    public VirtualWanInner withTypePropertiesType(String typePropertiesType) {
        this.typePropertiesType = typePropertiesType;
        return this;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the VirtualWanInner object itself.
     */
    public VirtualWanInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
