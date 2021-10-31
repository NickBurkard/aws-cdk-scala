package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AuroraMysqlClusterEngineProps {

  def apply(
    version: Option[software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion] = None
  ): software.amazon.awscdk.services.rds.AuroraMysqlClusterEngineProps =
    (new software.amazon.awscdk.services.rds.AuroraMysqlClusterEngineProps.Builder)
      .version(version.orNull)
      .build()
}
