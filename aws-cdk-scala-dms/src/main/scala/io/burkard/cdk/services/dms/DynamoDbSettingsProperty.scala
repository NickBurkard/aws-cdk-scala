package io.burkard.cdk.services.dms

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DynamoDbSettingsProperty {

  def apply(
    serviceAccessRoleArn: Option[String] = None
  ): software.amazon.awscdk.services.dms.CfnEndpoint.DynamoDbSettingsProperty =
    (new software.amazon.awscdk.services.dms.CfnEndpoint.DynamoDbSettingsProperty.Builder)
      .serviceAccessRoleArn(serviceAccessRoleArn.orNull)
      .build()
}
