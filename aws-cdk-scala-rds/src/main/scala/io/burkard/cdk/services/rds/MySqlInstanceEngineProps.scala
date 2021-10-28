package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MySqlInstanceEngineProps {

  def apply(
    version: Option[software.amazon.awscdk.services.rds.MysqlEngineVersion] = None
  ): software.amazon.awscdk.services.rds.MySqlInstanceEngineProps =
    (new software.amazon.awscdk.services.rds.MySqlInstanceEngineProps.Builder)
      .version(version.orNull)
      .build()
}
