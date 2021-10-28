package io.burkard.cdk.services.resourcegroups

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ConfigurationParameterProperty {

  def apply(
    name: Option[String] = None,
    values: Option[List[String]] = None
  ): software.amazon.awscdk.services.resourcegroups.CfnGroup.ConfigurationParameterProperty =
    (new software.amazon.awscdk.services.resourcegroups.CfnGroup.ConfigurationParameterProperty.Builder)
      .name(name.orNull)
      .values(values.map(_.asJava).orNull)
      .build()
}
