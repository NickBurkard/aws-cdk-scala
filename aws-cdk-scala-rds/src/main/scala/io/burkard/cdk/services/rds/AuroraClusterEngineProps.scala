package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AuroraClusterEngineProps {

  def apply(
    version: Option[software.amazon.awscdk.services.rds.AuroraEngineVersion] = None
  ): software.amazon.awscdk.services.rds.AuroraClusterEngineProps =
    (new software.amazon.awscdk.services.rds.AuroraClusterEngineProps.Builder)
      .version(version.orNull)
      .build()
}
