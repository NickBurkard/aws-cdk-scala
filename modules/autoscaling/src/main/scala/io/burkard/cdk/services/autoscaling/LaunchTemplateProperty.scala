package io.burkard.cdk.services.autoscaling

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
