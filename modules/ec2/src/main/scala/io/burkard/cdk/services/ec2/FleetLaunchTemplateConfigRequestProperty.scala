package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FleetLaunchTemplateConfigRequestProperty {

  def apply(
    launchTemplateSpecification: Option[software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateSpecificationRequestProperty] = None,
    overrides: Option[List[_]] = None
  ): software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateConfigRequestProperty =
    (new software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateConfigRequestProperty.Builder)
      .launchTemplateSpecification(launchTemplateSpecification.orNull)
      .overrides(overrides.map(_.asJava).orNull)
      .build()
}
