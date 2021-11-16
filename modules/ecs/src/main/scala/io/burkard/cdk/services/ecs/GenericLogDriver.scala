package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GenericLogDriver {

  def apply(
    logDriver: String,
    secretOptions: Option[Map[String, _ <: software.amazon.awscdk.services.ecs.Secret]] = None,
    options: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.ecs.GenericLogDriver =
    software.amazon.awscdk.services.ecs.GenericLogDriver.Builder
      .create()
      .logDriver(logDriver)
      .secretOptions(secretOptions.map(_.asJava).orNull)
      .options(options.map(_.asJava).orNull)
      .build()
}
