package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SqlServerExInstanceEngineProps {

  def apply(
    version: Option[software.amazon.awscdk.services.rds.SqlServerEngineVersion] = None
  ): software.amazon.awscdk.services.rds.SqlServerExInstanceEngineProps =
    (new software.amazon.awscdk.services.rds.SqlServerExInstanceEngineProps.Builder)
      .version(version.orNull)
      .build()
}
