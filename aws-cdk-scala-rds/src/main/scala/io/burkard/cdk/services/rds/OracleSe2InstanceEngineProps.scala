package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OracleSe2InstanceEngineProps {

  def apply(
    version: Option[software.amazon.awscdk.services.rds.OracleEngineVersion] = None
  ): software.amazon.awscdk.services.rds.OracleSe2InstanceEngineProps =
    (new software.amazon.awscdk.services.rds.OracleSe2InstanceEngineProps.Builder)
      .version(version.orNull)
      .build()
}
