package io.burkard.cdk.services.dms

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MicrosoftSqlServerSettingsProperty {

  def apply(
    secretsManagerAccessRoleArn: Option[String] = None,
    secretsManagerSecretId: Option[String] = None
  ): software.amazon.awscdk.services.dms.CfnEndpoint.MicrosoftSqlServerSettingsProperty =
    (new software.amazon.awscdk.services.dms.CfnEndpoint.MicrosoftSqlServerSettingsProperty.Builder)
      .secretsManagerAccessRoleArn(secretsManagerAccessRoleArn.orNull)
      .secretsManagerSecretId(secretsManagerSecretId.orNull)
      .build()
}
