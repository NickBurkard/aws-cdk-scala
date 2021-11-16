package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MariaDbInstanceEngineProps {

  def apply(
    version: software.amazon.awscdk.services.rds.MariaDbEngineVersion
  ): software.amazon.awscdk.services.rds.MariaDbInstanceEngineProps =
    (new software.amazon.awscdk.services.rds.MariaDbInstanceEngineProps.Builder)
      .version(version)
      .build()
}
