package io.burkard.cdk.services.dms

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OracleSettingsProperty {

  def apply(
    secretsManagerOracleAsmSecretId: Option[String] = None,
    secretsManagerAccessRoleArn: Option[String] = None,
    secretsManagerSecretId: Option[String] = None,
    secretsManagerOracleAsmAccessRoleArn: Option[String] = None
  ): software.amazon.awscdk.services.dms.CfnEndpoint.OracleSettingsProperty =
    (new software.amazon.awscdk.services.dms.CfnEndpoint.OracleSettingsProperty.Builder)
      .secretsManagerOracleAsmSecretId(secretsManagerOracleAsmSecretId.orNull)
      .secretsManagerAccessRoleArn(secretsManagerAccessRoleArn.orNull)
      .secretsManagerSecretId(secretsManagerSecretId.orNull)
      .secretsManagerOracleAsmAccessRoleArn(secretsManagerOracleAsmAccessRoleArn.orNull)
      .build()
}
