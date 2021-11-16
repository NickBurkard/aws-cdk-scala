package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LogConfigurationProperty {

  def apply(
    logDriver: String,
    secretOptions: Option[List[_]] = None,
    options: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.LogConfigurationProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.LogConfigurationProperty.Builder)
      .logDriver(logDriver)
      .secretOptions(secretOptions.map(_.asJava).orNull)
      .options(options.map(_.asJava).orNull)
      .build()
}
