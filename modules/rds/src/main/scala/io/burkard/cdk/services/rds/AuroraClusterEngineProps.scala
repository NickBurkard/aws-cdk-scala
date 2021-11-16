package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AuroraClusterEngineProps {

  def apply(
    version: software.amazon.awscdk.services.rds.AuroraEngineVersion
  ): software.amazon.awscdk.services.rds.AuroraClusterEngineProps =
    (new software.amazon.awscdk.services.rds.AuroraClusterEngineProps.Builder)
      .version(version)
      .build()
}
