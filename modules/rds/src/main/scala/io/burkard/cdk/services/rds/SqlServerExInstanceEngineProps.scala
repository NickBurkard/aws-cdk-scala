package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SqlServerExInstanceEngineProps {

  def apply(
    version: software.amazon.awscdk.services.rds.SqlServerEngineVersion
  ): software.amazon.awscdk.services.rds.SqlServerExInstanceEngineProps =
    (new software.amazon.awscdk.services.rds.SqlServerExInstanceEngineProps.Builder)
      .version(version)
      .build()
}
