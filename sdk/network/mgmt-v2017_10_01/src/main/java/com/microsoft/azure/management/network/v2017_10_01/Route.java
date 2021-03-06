/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2017_10_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2017_10_01.implementation.RouteInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2017_10_01.implementation.NetworkManager;

/**
 * Type representing Route.
 */
public interface Route extends HasInner<RouteInner>, Indexable, Refreshable<Route>, Updatable<Route.Update>, HasManager<NetworkManager> {
    /**
     * @return the addressPrefix value.
     */
    String addressPrefix();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the nextHopIpAddress value.
     */
    String nextHopIpAddress();

    /**
     * @return the nextHopType value.
     */
    RouteNextHopType nextHopType();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * The entirety of the Route definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithRouteTable, DefinitionStages.WithNextHopType, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Route definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Route definition.
         */
        interface Blank extends WithRouteTable {
        }

        /**
         * The stage of the route definition allowing to specify RouteTable.
         */
        interface WithRouteTable {
           /**
            * Specifies resourceGroupName, routeTableName.
            * @param resourceGroupName The name of the resource group
            * @param routeTableName The name of the route table
            * @return the next definition stage
            */
            WithNextHopType withExistingRouteTable(String resourceGroupName, String routeTableName);
        }

        /**
         * The stage of the route definition allowing to specify NextHopType.
         */
        interface WithNextHopType {
           /**
            * Specifies nextHopType.
            * @param nextHopType The type of Azure hop the packet should be sent to. Possible values are: 'VirtualNetworkGateway', 'VnetLocal', 'Internet', 'VirtualAppliance', and 'None'. Possible values include: 'VirtualNetworkGateway', 'VnetLocal', 'Internet', 'VirtualAppliance', 'None'
            * @return the next definition stage
            */
            WithCreate withNextHopType(RouteNextHopType nextHopType);
        }

        /**
         * The stage of the route definition allowing to specify AddressPrefix.
         */
        interface WithAddressPrefix {
            /**
             * Specifies addressPrefix.
             * @param addressPrefix The destination CIDR to which the route applies
             * @return the next definition stage
             */
            WithCreate withAddressPrefix(String addressPrefix);
        }

        /**
         * The stage of the route definition allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             * @param etag A unique read-only string that changes whenever the resource is updated
             * @return the next definition stage
             */
            WithCreate withEtag(String etag);
        }

        /**
         * The stage of the route definition allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             * @param id Resource ID
             * @return the next definition stage
             */
            WithCreate withId(String id);
        }

        /**
         * The stage of the route definition allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource
             * @return the next definition stage
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the route definition allowing to specify NextHopIpAddress.
         */
        interface WithNextHopIpAddress {
            /**
             * Specifies nextHopIpAddress.
             * @param nextHopIpAddress The IP address packets should be forwarded to. Next hop values are only allowed in routes where the next hop type is VirtualAppliance
             * @return the next definition stage
             */
            WithCreate withNextHopIpAddress(String nextHopIpAddress);
        }

        /**
         * The stage of the route definition allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState The provisioning state of the resource. Possible values are: 'Updating', 'Deleting', and 'Failed'
             * @return the next definition stage
             */
            WithCreate withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Route>, DefinitionStages.WithAddressPrefix, DefinitionStages.WithEtag, DefinitionStages.WithId, DefinitionStages.WithName, DefinitionStages.WithNextHopIpAddress, DefinitionStages.WithProvisioningState {
        }
    }
    /**
     * The template for a Route update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Route>, UpdateStages.WithAddressPrefix, UpdateStages.WithEtag, UpdateStages.WithId, UpdateStages.WithName, UpdateStages.WithNextHopIpAddress, UpdateStages.WithProvisioningState {
    }

    /**
     * Grouping of Route update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the route update allowing to specify AddressPrefix.
         */
        interface WithAddressPrefix {
            /**
             * Specifies addressPrefix.
             * @param addressPrefix The destination CIDR to which the route applies
             * @return the next update stage
             */
            Update withAddressPrefix(String addressPrefix);
        }

        /**
         * The stage of the route update allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             * @param etag A unique read-only string that changes whenever the resource is updated
             * @return the next update stage
             */
            Update withEtag(String etag);
        }

        /**
         * The stage of the route update allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             * @param id Resource ID
             * @return the next update stage
             */
            Update withId(String id);
        }

        /**
         * The stage of the route update allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource
             * @return the next update stage
             */
            Update withName(String name);
        }

        /**
         * The stage of the route update allowing to specify NextHopIpAddress.
         */
        interface WithNextHopIpAddress {
            /**
             * Specifies nextHopIpAddress.
             * @param nextHopIpAddress The IP address packets should be forwarded to. Next hop values are only allowed in routes where the next hop type is VirtualAppliance
             * @return the next update stage
             */
            Update withNextHopIpAddress(String nextHopIpAddress);
        }

        /**
         * The stage of the route update allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState The provisioning state of the resource. Possible values are: 'Updating', 'Deleting', and 'Failed'
             * @return the next update stage
             */
            Update withProvisioningState(String provisioningState);
        }

    }
}
