package io.burkard.cdk.services.rds

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OracleSeInstanceEngineProps {

  def apply(
    version: software.amazon.awscdk.services.rds.OracleLegacyEngineVersion
  ): software.amazon.awscdk.services.rds.OracleSeInstanceEngineProps =
    (new software.amazon.awscdk.services.rds.OracleSeInstanceEngineProps.Builder)
      .version(version)
      .build()
}
