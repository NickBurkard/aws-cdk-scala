package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FirelensOptions {

  def apply(
    configFileType: Option[software.amazon.awscdk.services.ecs.FirelensConfigFileType] = None,
    configFileValue: Option[String] = None,
    enableEcsLogMetadata: Option[Boolean] = None
  ): software.amazon.awscdk.services.ecs.FirelensOptions =
    (new software.amazon.awscdk.services.ecs.FirelensOptions.Builder)
      .configFileType(configFileType.orNull)
      .configFileValue(configFileValue.orNull)
      .enableEcsLogMetadata(enableEcsLogMetadata.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
