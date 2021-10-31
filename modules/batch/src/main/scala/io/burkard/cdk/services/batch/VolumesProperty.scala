package io.burkard.cdk.services.batch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VolumesProperty {

  def apply(
    name: Option[String] = None,
    host: Option[software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesHostProperty] = None,
    efsVolumeConfiguration: Option[software.amazon.awscdk.services.batch.CfnJobDefinition.EfsVolumeConfigurationProperty] = None
  ): software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesProperty =
    (new software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesProperty.Builder)
      .name(name.orNull)
      .host(host.orNull)
      .efsVolumeConfiguration(efsVolumeConfiguration.orNull)
      .build()
}
