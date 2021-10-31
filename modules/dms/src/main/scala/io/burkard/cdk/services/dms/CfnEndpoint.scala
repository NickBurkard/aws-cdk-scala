package io.burkard.cdk.services.dms

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnEndpoint {

  def apply(
    internalResourceId: String,
    oracleSettings: Option[software.amazon.awscdk.services.dms.CfnEndpoint.OracleSettingsProperty] = None,
    ibmDb2Settings: Option[software.amazon.awscdk.services.dms.CfnEndpoint.IbmDb2SettingsProperty] = None,
    username: Option[String] = None,
    mySqlSettings: Option[software.amazon.awscdk.services.dms.CfnEndpoint.MySqlSettingsProperty] = None,
    dynamoDbSettings: Option[software.amazon.awscdk.services.dms.CfnEndpoint.DynamoDbSettingsProperty] = None,
    port: Option[Number] = None,
    mongoDbSettings: Option[software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty] = None,
    redshiftSettings: Option[software.amazon.awscdk.services.dms.CfnEndpoint.RedshiftSettingsProperty] = None,
    kinesisSettings: Option[software.amazon.awscdk.services.dms.CfnEndpoint.KinesisSettingsProperty] = None,
    endpointIdentifier: Option[String] = None,
    kafkaSettings: Option[software.amazon.awscdk.services.dms.CfnEndpoint.KafkaSettingsProperty] = None,
    s3Settings: Option[software.amazon.awscdk.services.dms.CfnEndpoint.S3SettingsProperty] = None,
    sslMode: Option[String] = None,
    engineName: Option[String] = None,
    serverName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    postgreSqlSettings: Option[software.amazon.awscdk.services.dms.CfnEndpoint.PostgreSqlSettingsProperty] = None,
    certificateArn: Option[String] = None,
    sybaseSettings: Option[software.amazon.awscdk.services.dms.CfnEndpoint.SybaseSettingsProperty] = None,
    extraConnectionAttributes: Option[String] = None,
    endpointType: Option[String] = None,
    elasticsearchSettings: Option[software.amazon.awscdk.services.dms.CfnEndpoint.ElasticsearchSettingsProperty] = None,
    microsoftSqlServerSettings: Option[software.amazon.awscdk.services.dms.CfnEndpoint.MicrosoftSqlServerSettingsProperty] = None,
    neptuneSettings: Option[software.amazon.awscdk.services.dms.CfnEndpoint.NeptuneSettingsProperty] = None,
    databaseName: Option[String] = None,
    docDbSettings: Option[software.amazon.awscdk.services.dms.CfnEndpoint.DocDbSettingsProperty] = None,
    kmsKeyId: Option[String] = None,
    resourceIdentifier: Option[String] = None,
    password: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.dms.CfnEndpoint =
    software.amazon.awscdk.services.dms.CfnEndpoint.Builder
      .create(stackCtx, internalResourceId)
      .oracleSettings(oracleSettings.orNull)
      .ibmDb2Settings(ibmDb2Settings.orNull)
      .username(username.orNull)
      .mySqlSettings(mySqlSettings.orNull)
      .dynamoDbSettings(dynamoDbSettings.orNull)
      .port(port.orNull)
      .mongoDbSettings(mongoDbSettings.orNull)
      .redshiftSettings(redshiftSettings.orNull)
      .kinesisSettings(kinesisSettings.orNull)
      .endpointIdentifier(endpointIdentifier.orNull)
      .kafkaSettings(kafkaSettings.orNull)
      .s3Settings(s3Settings.orNull)
      .sslMode(sslMode.orNull)
      .engineName(engineName.orNull)
      .serverName(serverName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .postgreSqlSettings(postgreSqlSettings.orNull)
      .certificateArn(certificateArn.orNull)
      .sybaseSettings(sybaseSettings.orNull)
      .extraConnectionAttributes(extraConnectionAttributes.orNull)
      .endpointType(endpointType.orNull)
      .elasticsearchSettings(elasticsearchSettings.orNull)
      .microsoftSqlServerSettings(microsoftSqlServerSettings.orNull)
      .neptuneSettings(neptuneSettings.orNull)
      .databaseName(databaseName.orNull)
      .docDbSettings(docDbSettings.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .resourceIdentifier(resourceIdentifier.orNull)
      .password(password.orNull)
      .build()
}
