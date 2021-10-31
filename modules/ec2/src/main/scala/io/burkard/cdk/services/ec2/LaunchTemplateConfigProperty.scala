package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LaunchTemplateConfigProperty {

  def apply(
    launchTemplateSpecification: Option[software.amazon.awscdk.services.ec2.CfnSpotFleet.FleetLaunchTemplateSpecificationProperty] = None,
    overrides: Option[List[_]] = None
  ): software.amazon.awscdk.services.ec2.CfnSpotFleet.LaunchTemplateConfigProperty =
    (new software.amazon.awscdk.services.ec2.CfnSpotFleet.LaunchTemplateConfigProperty.Builder)
      .launchTemplateSpecification(launchTemplateSpecification.orNull)
      .overrides(overrides.map(_.asJava).orNull)
      .build()
}
