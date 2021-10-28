package io.burkard.cdk.services.config

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StaticValueProperty {

  def apply(
    values: Option[List[String]] = None
  ): software.amazon.awscdk.services.config.CfnRemediationConfiguration.StaticValueProperty =
    (new software.amazon.awscdk.services.config.CfnRemediationConfiguration.StaticValueProperty.Builder)
      .values(values.map(_.asJava).orNull)
      .build()
}
