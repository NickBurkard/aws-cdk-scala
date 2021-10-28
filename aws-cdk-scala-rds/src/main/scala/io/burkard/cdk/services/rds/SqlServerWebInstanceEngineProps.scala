package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SqlServerWebInstanceEngineProps {

  def apply(
    version: Option[software.amazon.awscdk.services.rds.SqlServerEngineVersion] = None
  ): software.amazon.awscdk.services.rds.SqlServerWebInstanceEngineProps =
    (new software.amazon.awscdk.services.rds.SqlServerWebInstanceEngineProps.Builder)
      .version(version.orNull)
      .build()
}
