package io.burkard.cdk.services.dms

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KafkaSettingsProperty {

  def apply(
    noHexPrefix: Option[Boolean] = None,
    sslClientKeyArn: Option[String] = None,
    sslClientKeyPassword: Option[String] = None,
    sslCaCertificateArn: Option[String] = None,
    broker: Option[String] = None,
    includeNullAndEmpty: Option[Boolean] = None,
    includeTransactionDetails: Option[Boolean] = None,
    topic: Option[String] = None,
    sslClientCertificateArn: Option[String] = None,
    includeControlDetails: Option[Boolean] = None,
    includeTableAlterOperations: Option[Boolean] = None,
    securityProtocol: Option[String] = None,
    partitionIncludeSchemaTable: Option[Boolean] = None,
    saslPassword: Option[String] = None,
    saslUserName: Option[String] = None
  ): software.amazon.awscdk.services.dms.CfnEndpoint.KafkaSettingsProperty =
    (new software.amazon.awscdk.services.dms.CfnEndpoint.KafkaSettingsProperty.Builder)
      .noHexPrefix(noHexPrefix.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .sslClientKeyArn(sslClientKeyArn.orNull)
      .sslClientKeyPassword(sslClientKeyPassword.orNull)
      .sslCaCertificateArn(sslCaCertificateArn.orNull)
      .broker(broker.orNull)
      .includeNullAndEmpty(includeNullAndEmpty.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .includeTransactionDetails(includeTransactionDetails.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .topic(topic.orNull)
      .sslClientCertificateArn(sslClientCertificateArn.orNull)
      .includeControlDetails(includeControlDetails.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .includeTableAlterOperations(includeTableAlterOperations.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .securityProtocol(securityProtocol.orNull)
      .partitionIncludeSchemaTable(partitionIncludeSchemaTable.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .saslPassword(saslPassword.orNull)
      .saslUserName(saslUserName.orNull)
      .build()
}
