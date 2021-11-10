package io.burkard.cdk.services.secretsmanager

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SecretTargetAttachmentProps {

  def apply(
    secret: Option[software.amazon.awscdk.services.secretsmanager.ISecret] = None,
    target: Option[software.amazon.awscdk.services.secretsmanager.ISecretAttachmentTarget] = None
  ): software.amazon.awscdk.services.secretsmanager.SecretTargetAttachmentProps =
    (new software.amazon.awscdk.services.secretsmanager.SecretTargetAttachmentProps.Builder)
      .secret(secret.orNull)
      .target(target.orNull)
      .build()
}
