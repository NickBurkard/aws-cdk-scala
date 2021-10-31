package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PostgresInstanceEngineProps {

  def apply(
    version: Option[software.amazon.awscdk.services.rds.PostgresEngineVersion] = None
  ): software.amazon.awscdk.services.rds.PostgresInstanceEngineProps =
    (new software.amazon.awscdk.services.rds.PostgresInstanceEngineProps.Builder)
      .version(version.orNull)
      .build()
}
