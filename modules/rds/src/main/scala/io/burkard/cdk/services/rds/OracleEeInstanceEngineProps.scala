package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OracleEeInstanceEngineProps {

  def apply(
    version: Option[software.amazon.awscdk.services.rds.OracleEngineVersion] = None
  ): software.amazon.awscdk.services.rds.OracleEeInstanceEngineProps =
    (new software.amazon.awscdk.services.rds.OracleEeInstanceEngineProps.Builder)
      .version(version.orNull)
      .build()
}
