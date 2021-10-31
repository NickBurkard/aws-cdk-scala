package io.burkard.cdk.services.iot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnProvisioningTemplate {

  def apply(
    internalResourceId: String,
    templateName: Option[String] = None,
    preProvisioningHook: Option[software.amazon.awscdk.services.iot.CfnProvisioningTemplate.ProvisioningHookProperty] = None,
    templateBody: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    enabled: Option[Boolean] = None,
    provisioningRoleArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iot.CfnProvisioningTemplate =
    software.amazon.awscdk.services.iot.CfnProvisioningTemplate.Builder
      .create(stackCtx, internalResourceId)
      .templateName(templateName.orNull)
      .preProvisioningHook(preProvisioningHook.orNull)
      .templateBody(templateBody.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .provisioningRoleArn(provisioningRoleArn.orNull)
      .build()
}
