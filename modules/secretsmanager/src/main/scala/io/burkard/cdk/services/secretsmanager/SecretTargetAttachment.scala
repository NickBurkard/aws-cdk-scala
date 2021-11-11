package io.burkard.cdk.services.secretsmanager

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SecretTargetAttachment {

  def apply(
    internalResourceId: String,
    secret: Option[software.amazon.awscdk.services.secretsmanager.ISecret] = None,
    target: Option[software.amazon.awscdk.services.secretsmanager.ISecretAttachmentTarget] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.secretsmanager.SecretTargetAttachment =
    software.amazon.awscdk.services.secretsmanager.SecretTargetAttachment.Builder
      .create(stackCtx, internalResourceId)
      .secret(secret.orNull)
      .target(target.orNull)
      .build()
}
