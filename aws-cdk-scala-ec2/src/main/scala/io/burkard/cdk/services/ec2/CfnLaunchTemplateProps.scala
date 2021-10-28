package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLaunchTemplateProps {

  def apply(
    tagSpecifications: Option[List[_]] = None,
    launchTemplateData: Option[software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateDataProperty] = None,
    launchTemplateName: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnLaunchTemplateProps =
    (new software.amazon.awscdk.services.ec2.CfnLaunchTemplateProps.Builder)
      .tagSpecifications(tagSpecifications.map(_.asJava).orNull)
      .launchTemplateData(launchTemplateData.orNull)
      .launchTemplateName(launchTemplateName.orNull)
      .build()
}
