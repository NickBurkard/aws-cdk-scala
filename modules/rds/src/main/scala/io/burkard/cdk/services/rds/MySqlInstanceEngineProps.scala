package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MySqlInstanceEngineProps {

  def apply(
    version: Option[software.amazon.awscdk.services.rds.MysqlEngineVersion] = None
  ): software.amazon.awscdk.services.rds.MySqlInstanceEngineProps =
    (new software.amazon.awscdk.services.rds.MySqlInstanceEngineProps.Builder)
      .version(version.orNull)
      .build()
}
