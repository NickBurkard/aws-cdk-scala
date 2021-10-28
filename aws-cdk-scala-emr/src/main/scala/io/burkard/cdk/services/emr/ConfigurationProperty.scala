package io.burkard.cdk.services.emr

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ConfigurationProperty {

  def apply(
    configurationProperties: Option[Map[String, String]] = None,
    configurations: Option[List[_]] = None,
    classification: Option[String] = None
  ): software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.ConfigurationProperty =
    (new software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.ConfigurationProperty.Builder)
      .configurationProperties(configurationProperties.map(_.asJava).orNull)
      .configurations(configurations.map(_.asJava).orNull)
      .classification(classification.orNull)
      .build()
}
