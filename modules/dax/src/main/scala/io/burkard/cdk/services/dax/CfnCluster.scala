package io.burkard.cdk.services.dax

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCluster {

  def apply(
    internalResourceId: String,
    iamRoleArn: String,
    nodeType: String,
    replicationFactor: Number,
    subnetGroupName: Option[String] = None,
    clusterEndpointEncryptionType: Option[String] = None,
    securityGroupIds: Option[List[String]] = None,
    preferredMaintenanceWindow: Option[String] = None,
    sseSpecification: Option[software.amazon.awscdk.services.dax.CfnCluster.SSESpecificationProperty] = None,
    clusterName: Option[String] = None,
    availabilityZones: Option[List[String]] = None,
    description: Option[String] = None,
    tags: Option[AnyRef] = None,
    notificationTopicArn: Option[String] = None,
    parameterGroupName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.dax.CfnCluster =
    software.amazon.awscdk.services.dax.CfnCluster.Builder
      .create(stackCtx, internalResourceId)
      .iamRoleArn(iamRoleArn)
      .nodeType(nodeType)
      .replicationFactor(replicationFactor)
      .subnetGroupName(subnetGroupName.orNull)
      .clusterEndpointEncryptionType(clusterEndpointEncryptionType.orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .preferredMaintenanceWindow(preferredMaintenanceWindow.orNull)
      .sseSpecification(sseSpecification.orNull)
      .clusterName(clusterName.orNull)
      .availabilityZones(availabilityZones.map(_.asJava).orNull)
      .description(description.orNull)
      .tags(tags.orNull)
      .notificationTopicArn(notificationTopicArn.orNull)
      .parameterGroupName(parameterGroupName.orNull)
      .build()
}
