package io.burkard.cdk.services.autoscaling

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LaunchTemplateProperty {

  def apply(
    launchTemplateSpecification: Option[software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateSpecificationProperty] = None,
    overrides: Option[List[_]] = None
  ): software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateProperty =
    (new software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateProperty.Builder)
      .launchTemplateSpecification(launchTemplateSpecification.orNull)
      .overrides(overrides.map(_.asJava).orNull)
      .build()
}
