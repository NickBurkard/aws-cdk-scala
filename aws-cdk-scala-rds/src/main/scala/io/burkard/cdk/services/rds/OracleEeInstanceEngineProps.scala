package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OracleEeInstanceEngineProps {

  def apply(
    version: Option[software.amazon.awscdk.services.rds.OracleEngineVersion] = None
  ): software.amazon.awscdk.services.rds.OracleEeInstanceEngineProps =
    (new software.amazon.awscdk.services.rds.OracleEeInstanceEngineProps.Builder)
      .version(version.orNull)
      .build()
}
