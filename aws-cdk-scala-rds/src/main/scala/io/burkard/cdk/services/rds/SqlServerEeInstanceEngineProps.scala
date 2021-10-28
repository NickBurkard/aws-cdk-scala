package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SqlServerEeInstanceEngineProps {

  def apply(
    version: Option[software.amazon.awscdk.services.rds.SqlServerEngineVersion] = None
  ): software.amazon.awscdk.services.rds.SqlServerEeInstanceEngineProps =
    (new software.amazon.awscdk.services.rds.SqlServerEeInstanceEngineProps.Builder)
      .version(version.orNull)
      .build()
}
