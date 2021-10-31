package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLaunchTemplate {

  def apply(
    internalResourceId: String,
    tagSpecifications: Option[List[_]] = None,
    launchTemplateData: Option[software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateDataProperty] = None,
    launchTemplateName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnLaunchTemplate =
    software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Builder
      .create(stackCtx, internalResourceId)
      .tagSpecifications(tagSpecifications.map(_.asJava).orNull)
      .launchTemplateData(launchTemplateData.orNull)
      .launchTemplateName(launchTemplateName.orNull)
      .build()
}
