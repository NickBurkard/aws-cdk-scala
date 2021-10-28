package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SqlServerSeInstanceEngineProps {

  def apply(
    version: Option[software.amazon.awscdk.services.rds.SqlServerEngineVersion] = None
  ): software.amazon.awscdk.services.rds.SqlServerSeInstanceEngineProps =
    (new software.amazon.awscdk.services.rds.SqlServerSeInstanceEngineProps.Builder)
      .version(version.orNull)
      .build()
}
