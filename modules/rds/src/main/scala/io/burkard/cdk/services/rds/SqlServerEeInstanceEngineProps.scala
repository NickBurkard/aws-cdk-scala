package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SqlServerEeInstanceEngineProps {

  def apply(
    version: Option[software.amazon.awscdk.services.rds.SqlServerEngineVersion] = None
  ): software.amazon.awscdk.services.rds.SqlServerEeInstanceEngineProps =
    (new software.amazon.awscdk.services.rds.SqlServerEeInstanceEngineProps.Builder)
      .version(version.orNull)
      .build()
}
