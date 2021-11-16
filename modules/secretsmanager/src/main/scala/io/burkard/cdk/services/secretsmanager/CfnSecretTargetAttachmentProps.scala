package io.burkard.cdk.services.secretsmanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSecretTargetAttachmentProps {

  def apply(
    secretId: String,
    targetId: String,
    targetType: String
  ): software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps =
    (new software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps.Builder)
      .secretId(secretId)
      .targetId(targetId)
      .targetType(targetType)
      .build()
}
