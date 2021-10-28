package io.burkard.cdk.services.imagebuilder

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DistributionProperty {

  def apply(
    licenseConfigurationArns: Option[List[String]] = None,
    launchTemplateConfigurations: Option[List[_]] = None,
    amiDistributionConfiguration: Option[AnyRef] = None,
    region: Option[String] = None,
    containerDistributionConfiguration: Option[AnyRef] = None
  ): software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.DistributionProperty =
    (new software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.DistributionProperty.Builder)
      .licenseConfigurationArns(licenseConfigurationArns.map(_.asJava).orNull)
      .launchTemplateConfigurations(launchTemplateConfigurations.map(_.asJava).orNull)
      .amiDistributionConfiguration(amiDistributionConfiguration.orNull)
      .region(region.orNull)
      .containerDistributionConfiguration(containerDistributionConfiguration.orNull)
      .build()
}
