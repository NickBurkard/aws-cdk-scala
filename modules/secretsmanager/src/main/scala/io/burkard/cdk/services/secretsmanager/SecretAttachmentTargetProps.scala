package io.burkard.cdk.services.secretsmanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SecretAttachmentTargetProps {

  def apply(
    targetId: String,
    targetType: software.amazon.awscdk.services.secretsmanager.AttachmentTargetType
  ): software.amazon.awscdk.services.secretsmanager.SecretAttachmentTargetProps =
    (new software.amazon.awscdk.services.secretsmanager.SecretAttachmentTargetProps.Builder)
      .targetId(targetId)
      .targetType(targetType)
      .build()
}
