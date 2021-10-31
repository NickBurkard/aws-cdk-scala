package io.burkard.cdk.services.dms

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MongoDbSettingsProperty {

  def apply(
    username: Option[String] = None,
    serverName: Option[String] = None,
    secretsManagerAccessRoleArn: Option[String] = None,
    secretsManagerSecretId: Option[String] = None,
    port: Option[Number] = None,
    docsToInvestigate: Option[String] = None,
    databaseName: Option[String] = None,
    nestingLevel: Option[String] = None,
    authSource: Option[String] = None,
    password: Option[String] = None,
    authType: Option[String] = None,
    extractDocId: Option[String] = None,
    authMechanism: Option[String] = None
  ): software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty =
    (new software.amazon.awscdk.services.dms.CfnEndpoint.MongoDbSettingsProperty.Builder)
      .username(username.orNull)
      .serverName(serverName.orNull)
      .secretsManagerAccessRoleArn(secretsManagerAccessRoleArn.orNull)
      .secretsManagerSecretId(secretsManagerSecretId.orNull)
      .port(port.orNull)
      .docsToInvestigate(docsToInvestigate.orNull)
      .databaseName(databaseName.orNull)
      .nestingLevel(nestingLevel.orNull)
      .authSource(authSource.orNull)
      .password(password.orNull)
      .authType(authType.orNull)
      .extractDocId(extractDocId.orNull)
      .authMechanism(authMechanism.orNull)
      .build()
}
