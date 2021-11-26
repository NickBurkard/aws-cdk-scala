package io.burkard.cdk.services.fsx

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DiskIopsConfigurationProperty {

  def apply(
    iops: Option[Number] = None,
    mode: Option[String] = None
  ): software.amazon.awscdk.services.fsx.CfnFileSystem.DiskIopsConfigurationProperty =
    (new software.amazon.awscdk.services.fsx.CfnFileSystem.DiskIopsConfigurationProperty.Builder)
      .iops(iops.orNull)
      .mode(mode.orNull)
      .build()
}
