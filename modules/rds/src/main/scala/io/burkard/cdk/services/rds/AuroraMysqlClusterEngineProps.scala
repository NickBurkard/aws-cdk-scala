package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AuroraMysqlClusterEngineProps {

  def apply(
    version: software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion
  ): software.amazon.awscdk.services.rds.AuroraMysqlClusterEngineProps =
    (new software.amazon.awscdk.services.rds.AuroraMysqlClusterEngineProps.Builder)
      .version(version)
      .build()
}
