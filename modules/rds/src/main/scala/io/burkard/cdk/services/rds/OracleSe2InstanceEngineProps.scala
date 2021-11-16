package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OracleSe2InstanceEngineProps {

  def apply(
    version: software.amazon.awscdk.services.rds.OracleEngineVersion
  ): software.amazon.awscdk.services.rds.OracleSe2InstanceEngineProps =
    (new software.amazon.awscdk.services.rds.OracleSe2InstanceEngineProps.Builder)
      .version(version)
      .build()
}
