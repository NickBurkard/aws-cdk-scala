package io.burkard.cdk.services.imagebuilder

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DistributionProperty {

  def apply(
    region: String,
    licenseConfigurationArns: Option[List[String]] = None,
    launchTemplateConfigurations: Option[List[_]] = None,
    amiDistributionConfiguration: Option[AnyRef] = None,
    containerDistributionConfiguration: Option[AnyRef] = None
  ): software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.DistributionProperty =
    (new software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.DistributionProperty.Builder)
      .region(region)
      .licenseConfigurationArns(licenseConfigurationArns.map(_.asJava).orNull)
      .launchTemplateConfigurations(launchTemplateConfigurations.map(_.asJava).orNull)
      .amiDistributionConfiguration(amiDistributionConfiguration.orNull)
      .containerDistributionConfiguration(containerDistributionConfiguration.orNull)
      .build()
}
