package io.burkard.cdk.services.iot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnProvisioningTemplate {

  def apply(
    internalResourceId: String,
    templateBody: String,
    provisioningRoleArn: String,
    templateName: Option[String] = None,
    preProvisioningHook: Option[software.amazon.awscdk.services.iot.CfnProvisioningTemplate.ProvisioningHookProperty] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    enabled: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iot.CfnProvisioningTemplate =
    software.amazon.awscdk.services.iot.CfnProvisioningTemplate.Builder
      .create(stackCtx, internalResourceId)
      .templateBody(templateBody)
      .provisioningRoleArn(provisioningRoleArn)
      .templateName(templateName.orNull)
      .preProvisioningHook(preProvisioningHook.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
