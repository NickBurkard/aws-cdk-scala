package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AuroraPostgresClusterEngineProps {

  def apply(
    version: software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion
  ): software.amazon.awscdk.services.rds.AuroraPostgresClusterEngineProps =
    (new software.amazon.awscdk.services.rds.AuroraPostgresClusterEngineProps.Builder)
      .version(version)
      .build()
}
