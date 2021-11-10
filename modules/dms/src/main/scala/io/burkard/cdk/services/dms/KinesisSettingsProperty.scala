package io.burkard.cdk.services.dms

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KinesisSettingsProperty {

  def apply(
    noHexPrefix: Option[Boolean] = None,
    serviceAccessRoleArn: Option[String] = None,
    messageFormat: Option[String] = None,
    partitionIncludeSchemaTable: Option[Boolean] = None,
    includeNullAndEmpty: Option[Boolean] = None,
    includeTransactionDetails: Option[Boolean] = None,
    streamArn: Option[String] = None,
    includeControlDetails: Option[Boolean] = None,
    includeTableAlterOperations: Option[Boolean] = None
  ): software.amazon.awscdk.services.dms.CfnEndpoint.KinesisSettingsProperty =
    (new software.amazon.awscdk.services.dms.CfnEndpoint.KinesisSettingsProperty.Builder)
      .noHexPrefix(noHexPrefix.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .serviceAccessRoleArn(serviceAccessRoleArn.orNull)
      .messageFormat(messageFormat.orNull)
      .partitionIncludeSchemaTable(partitionIncludeSchemaTable.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .includeNullAndEmpty(includeNullAndEmpty.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .includeTransactionDetails(includeTransactionDetails.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .streamArn(streamArn.orNull)
      .includeControlDetails(includeControlDetails.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .includeTableAlterOperations(includeTableAlterOperations.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
