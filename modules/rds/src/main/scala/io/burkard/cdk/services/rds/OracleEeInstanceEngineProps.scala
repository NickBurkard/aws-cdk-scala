package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OracleEeInstanceEngineProps {

  def apply(
    version: software.amazon.awscdk.services.rds.OracleEngineVersion
  ): software.amazon.awscdk.services.rds.OracleEeInstanceEngineProps =
    (new software.amazon.awscdk.services.rds.OracleEeInstanceEngineProps.Builder)
      .version(version)
      .build()
}
