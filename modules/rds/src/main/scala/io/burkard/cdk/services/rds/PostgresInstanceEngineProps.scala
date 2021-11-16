package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PostgresInstanceEngineProps {

  def apply(
    version: software.amazon.awscdk.services.rds.PostgresEngineVersion
  ): software.amazon.awscdk.services.rds.PostgresInstanceEngineProps =
    (new software.amazon.awscdk.services.rds.PostgresInstanceEngineProps.Builder)
      .version(version)
      .build()
}
