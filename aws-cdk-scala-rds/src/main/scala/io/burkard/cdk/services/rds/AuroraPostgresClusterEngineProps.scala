package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AuroraPostgresClusterEngineProps {

  def apply(
    version: Option[software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion] = None
  ): software.amazon.awscdk.services.rds.AuroraPostgresClusterEngineProps =
    (new software.amazon.awscdk.services.rds.AuroraPostgresClusterEngineProps.Builder)
      .version(version.orNull)
      .build()
}
