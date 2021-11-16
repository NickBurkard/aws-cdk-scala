package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DeltaSyncConfigProperty {

  def apply(
    baseTableTtl: String,
    deltaSyncTableTtl: String,
    deltaSyncTableName: String
  ): software.amazon.awscdk.services.appsync.CfnDataSource.DeltaSyncConfigProperty =
    (new software.amazon.awscdk.services.appsync.CfnDataSource.DeltaSyncConfigProperty.Builder)
      .baseTableTtl(baseTableTtl)
      .deltaSyncTableTtl(deltaSyncTableTtl)
      .deltaSyncTableName(deltaSyncTableName)
      .build()
}
