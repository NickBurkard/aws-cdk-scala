package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MariaDbInstanceEngineProps {

  def apply(
    version: Option[software.amazon.awscdk.services.rds.MariaDbEngineVersion] = None
  ): software.amazon.awscdk.services.rds.MariaDbInstanceEngineProps =
    (new software.amazon.awscdk.services.rds.MariaDbInstanceEngineProps.Builder)
      .version(version.orNull)
      .build()
}
