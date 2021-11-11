package io.burkard.cdk.services.rds

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OracleSe1InstanceEngineProps {

  def apply(
    version: Option[software.amazon.awscdk.services.rds.OracleLegacyEngineVersion] = None
  ): software.amazon.awscdk.services.rds.OracleSe1InstanceEngineProps =
    (new software.amazon.awscdk.services.rds.OracleSe1InstanceEngineProps.Builder)
      .version(version.orNull)
      .build()
}
