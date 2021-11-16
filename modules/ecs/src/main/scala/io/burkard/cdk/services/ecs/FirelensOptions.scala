package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FirelensOptions {

  def apply(
    configFileValue: String,
    configFileType: Option[software.amazon.awscdk.services.ecs.FirelensConfigFileType] = None,
    enableEcsLogMetadata: Option[Boolean] = None
  ): software.amazon.awscdk.services.ecs.FirelensOptions =
    (new software.amazon.awscdk.services.ecs.FirelensOptions.Builder)
      .configFileValue(configFileValue)
      .configFileType(configFileType.orNull)
      .enableEcsLogMetadata(enableEcsLogMetadata.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
