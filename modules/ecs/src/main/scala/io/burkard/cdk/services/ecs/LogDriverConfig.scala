package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LogDriverConfig {

  def apply(
    logDriver: String,
    secretOptions: Option[List[_ <: software.amazon.awscdk.services.ecs.CfnTaskDefinition.SecretProperty]] = None,
    options: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.ecs.LogDriverConfig =
    (new software.amazon.awscdk.services.ecs.LogDriverConfig.Builder)
      .logDriver(logDriver)
      .secretOptions(secretOptions.map(_.asJava).orNull)
      .options(options.map(_.asJava).orNull)
      .build()
}
