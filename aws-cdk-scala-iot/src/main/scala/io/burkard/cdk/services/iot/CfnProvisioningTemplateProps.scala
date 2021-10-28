package io.burkard.cdk.services.iot

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnProvisioningTemplateProps {

  def apply(
    templateName: Option[String] = None,
    preProvisioningHook: Option[software.amazon.awscdk.services.iot.CfnProvisioningTemplate.ProvisioningHookProperty] = None,
    templateBody: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    enabled: Option[Boolean] = None,
    provisioningRoleArn: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnProvisioningTemplateProps =
    (new software.amazon.awscdk.services.iot.CfnProvisioningTemplateProps.Builder)
      .templateName(templateName.orNull)
      .preProvisioningHook(preProvisioningHook.orNull)
      .templateBody(templateBody.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .provisioningRoleArn(provisioningRoleArn.orNull)
      .build()
}
