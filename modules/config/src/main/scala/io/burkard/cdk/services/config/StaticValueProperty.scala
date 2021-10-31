package io.burkard.cdk.services.config

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StaticValueProperty {

  def apply(
    values: Option[List[String]] = None
  ): software.amazon.awscdk.services.config.CfnRemediationConfiguration.StaticValueProperty =
    (new software.amazon.awscdk.services.config.CfnRemediationConfiguration.StaticValueProperty.Builder)
      .values(values.map(_.asJava).orNull)
      .build()
}
