package io.burkard.cdk.services.secretsmanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SecretAttachmentTargetProps {

  def apply(
    targetId: Option[String] = None,
    targetType: Option[software.amazon.awscdk.services.secretsmanager.AttachmentTargetType] = None
  ): software.amazon.awscdk.services.secretsmanager.SecretAttachmentTargetProps =
    (new software.amazon.awscdk.services.secretsmanager.SecretAttachmentTargetProps.Builder)
      .targetId(targetId.orNull)
      .targetType(targetType.orNull)
      .build()
}
