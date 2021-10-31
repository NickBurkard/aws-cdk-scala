package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LogConfigurationProperty {

  def apply(
    secretOptions: Option[List[_]] = None,
    logDriver: Option[String] = None,
    options: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.LogConfigurationProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.LogConfigurationProperty.Builder)
      .secretOptions(secretOptions.map(_.asJava).orNull)
      .logDriver(logDriver.orNull)
      .options(options.map(_.asJava).orNull)
      .build()
}
