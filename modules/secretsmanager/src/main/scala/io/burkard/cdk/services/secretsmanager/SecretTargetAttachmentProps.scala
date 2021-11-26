package io.burkard.cdk.services.secretsmanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SecretTargetAttachmentProps {

  def apply(
    secret: software.amazon.awscdk.services.secretsmanager.ISecret,
    target: Option[software.amazon.awscdk.services.secretsmanager.ISecretAttachmentTarget] = None
  ): software.amazon.awscdk.services.secretsmanager.SecretTargetAttachmentProps =
    (new software.amazon.awscdk.services.secretsmanager.SecretTargetAttachmentProps.Builder)
      .secret(secret)
      .target(target.orNull)
      .build()
}
