package io.burkard.cdk.services.secretsmanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSecretTargetAttachment {

  def apply(
    internalResourceId: String,
    secretId: Option[String] = None,
    targetId: Option[String] = None,
    targetType: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachment =
    software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachment.Builder
      .create(stackCtx, internalResourceId)
      .secretId(secretId.orNull)
      .targetId(targetId.orNull)
      .targetType(targetType.orNull)
      .build()
}
