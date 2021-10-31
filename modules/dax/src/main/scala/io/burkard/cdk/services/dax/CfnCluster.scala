package io.burkard.cdk.services.dax

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCluster {

  def apply(
    internalResourceId: String,
    subnetGroupName: Option[String] = None,
    iamRoleArn: Option[String] = None,
    clusterEndpointEncryptionType: Option[String] = None,
    securityGroupIds: Option[List[String]] = None,
    preferredMaintenanceWindow: Option[String] = None,
    sseSpecification: Option[software.amazon.awscdk.services.dax.CfnCluster.SSESpecificationProperty] = None,
    nodeType: Option[String] = None,
    replicationFactor: Option[Number] = None,
    clusterName: Option[String] = None,
    availabilityZones: Option[List[String]] = None,
    description: Option[String] = None,
    tags: Option[AnyRef] = None,
    notificationTopicArn: Option[String] = None,
    parameterGroupName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.dax.CfnCluster =
    software.amazon.awscdk.services.dax.CfnCluster.Builder
      .create(stackCtx, internalResourceId)
      .subnetGroupName(subnetGroupName.orNull)
      .iamRoleArn(iamRoleArn.orNull)
      .clusterEndpointEncryptionType(clusterEndpointEncryptionType.orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .preferredMaintenanceWindow(preferredMaintenanceWindow.orNull)
      .sseSpecification(sseSpecification.orNull)
      .nodeType(nodeType.orNull)
      .replicationFactor(replicationFactor.orNull)
      .clusterName(clusterName.orNull)
      .availabilityZones(availabilityZones.map(_.asJava).orNull)
      .description(description.orNull)
      .tags(tags.orNull)
      .notificationTopicArn(notificationTopicArn.orNull)
      .parameterGroupName(parameterGroupName.orNull)
      .build()
}
