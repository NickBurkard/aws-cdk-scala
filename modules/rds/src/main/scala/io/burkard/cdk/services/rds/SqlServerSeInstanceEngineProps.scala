package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SqlServerSeInstanceEngineProps {

  def apply(
    version: software.amazon.awscdk.services.rds.SqlServerEngineVersion
  ): software.amazon.awscdk.services.rds.SqlServerSeInstanceEngineProps =
    (new software.amazon.awscdk.services.rds.SqlServerSeInstanceEngineProps.Builder)
      .version(version)
      .build()
}
