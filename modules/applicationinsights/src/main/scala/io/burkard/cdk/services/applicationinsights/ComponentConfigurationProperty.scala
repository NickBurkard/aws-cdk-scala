package io.burkard.cdk.services.applicationinsights

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ComponentConfigurationProperty {

  def apply(
    subComponentTypeConfigurations: Option[List[_]] = None,
    configurationDetails: Option[software.amazon.awscdk.services.applicationinsights.CfnApplication.ConfigurationDetailsProperty] = None
  ): software.amazon.awscdk.services.applicationinsights.CfnApplication.ComponentConfigurationProperty =
    (new software.amazon.awscdk.services.applicationinsights.CfnApplication.ComponentConfigurationProperty.Builder)
      .subComponentTypeConfigurations(subComponentTypeConfigurations.map(_.asJava).orNull)
      .configurationDetails(configurationDetails.orNull)
      .build()
}
