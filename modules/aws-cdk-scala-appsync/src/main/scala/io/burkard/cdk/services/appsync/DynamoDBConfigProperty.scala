package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DynamoDBConfigProperty {

  def apply(
    awsRegion: Option[String] = None,
    tableName: Option[String] = None,
    deltaSyncConfig: Option[software.amazon.awscdk.services.appsync.CfnDataSource.DeltaSyncConfigProperty] = None,
    useCallerCredentials: Option[Boolean] = None,
    versioned: Option[Boolean] = None
  ): software.amazon.awscdk.services.appsync.CfnDataSource.DynamoDBConfigProperty =
    (new software.amazon.awscdk.services.appsync.CfnDataSource.DynamoDBConfigProperty.Builder)
      .awsRegion(awsRegion.orNull)
      .tableName(tableName.orNull)
      .deltaSyncConfig(deltaSyncConfig.orNull)
      .useCallerCredentials(useCallerCredentials.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .versioned(versioned.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
