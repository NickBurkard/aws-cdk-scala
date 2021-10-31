package io.burkard.cdk.services.emr

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStudio {

  def apply(
    internalResourceId: String,
    idpAuthUrl: Option[String] = None,
    name: Option[String] = None,
    userRole: Option[String] = None,
    idpRelayStateParameterName: Option[String] = None,
    workspaceSecurityGroupId: Option[String] = None,
    defaultS3Location: Option[String] = None,
    engineSecurityGroupId: Option[String] = None,
    authMode: Option[String] = None,
    subnetIds: Option[List[String]] = None,
    serviceRole: Option[String] = None,
    vpcId: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.emr.CfnStudio =
    software.amazon.awscdk.services.emr.CfnStudio.Builder
      .create(stackCtx, internalResourceId)
      .idpAuthUrl(idpAuthUrl.orNull)
      .name(name.orNull)
      .userRole(userRole.orNull)
      .idpRelayStateParameterName(idpRelayStateParameterName.orNull)
      .workspaceSecurityGroupId(workspaceSecurityGroupId.orNull)
      .defaultS3Location(defaultS3Location.orNull)
      .engineSecurityGroupId(engineSecurityGroupId.orNull)
      .authMode(authMode.orNull)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .serviceRole(serviceRole.orNull)
      .vpcId(vpcId.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
