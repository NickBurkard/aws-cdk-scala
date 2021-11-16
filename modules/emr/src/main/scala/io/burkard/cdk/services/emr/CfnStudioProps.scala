package io.burkard.cdk.services.emr

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStudioProps {

  def apply(
    name: String,
    workspaceSecurityGroupId: String,
    defaultS3Location: String,
    engineSecurityGroupId: String,
    authMode: String,
    subnetIds: List[String],
    serviceRole: String,
    vpcId: String,
    idpAuthUrl: Option[String] = None,
    userRole: Option[String] = None,
    idpRelayStateParameterName: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.emr.CfnStudioProps =
    (new software.amazon.awscdk.services.emr.CfnStudioProps.Builder)
      .name(name)
      .workspaceSecurityGroupId(workspaceSecurityGroupId)
      .defaultS3Location(defaultS3Location)
      .engineSecurityGroupId(engineSecurityGroupId)
      .authMode(authMode)
      .subnetIds(subnetIds.asJava)
      .serviceRole(serviceRole)
      .vpcId(vpcId)
      .idpAuthUrl(idpAuthUrl.orNull)
      .userRole(userRole.orNull)
      .idpRelayStateParameterName(idpRelayStateParameterName.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
