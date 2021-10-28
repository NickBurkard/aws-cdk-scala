package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDataSourceProps {

  def apply(
    openSearchServiceConfig: Option[software.amazon.awscdk.services.appsync.CfnDataSource.OpenSearchServiceConfigProperty] = None,
    name: Option[String] = None,
    elasticsearchConfig: Option[software.amazon.awscdk.services.appsync.CfnDataSource.ElasticsearchConfigProperty] = None,
    description: Option[String] = None,
    serviceRoleArn: Option[String] = None,
    apiId: Option[String] = None,
    `type`: Option[String] = None,
    lambdaConfig: Option[software.amazon.awscdk.services.appsync.CfnDataSource.LambdaConfigProperty] = None,
    httpConfig: Option[software.amazon.awscdk.services.appsync.CfnDataSource.HttpConfigProperty] = None,
    relationalDatabaseConfig: Option[software.amazon.awscdk.services.appsync.CfnDataSource.RelationalDatabaseConfigProperty] = None,
    dynamoDbConfig: Option[software.amazon.awscdk.services.appsync.CfnDataSource.DynamoDBConfigProperty] = None
  ): software.amazon.awscdk.services.appsync.CfnDataSourceProps =
    (new software.amazon.awscdk.services.appsync.CfnDataSourceProps.Builder)
      .openSearchServiceConfig(openSearchServiceConfig.orNull)
      .name(name.orNull)
      .elasticsearchConfig(elasticsearchConfig.orNull)
      .description(description.orNull)
      .serviceRoleArn(serviceRoleArn.orNull)
      .apiId(apiId.orNull)
      .`type`(`type`.orNull)
      .lambdaConfig(lambdaConfig.orNull)
      .httpConfig(httpConfig.orNull)
      .relationalDatabaseConfig(relationalDatabaseConfig.orNull)
      .dynamoDbConfig(dynamoDbConfig.orNull)
      .build()
}
