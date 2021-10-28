package io.burkard.cdk.services.secretsmanager

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SecretTargetAttachmentProps {

  def apply(
    secret: Option[software.amazon.awscdk.services.secretsmanager.ISecret] = None
  ): software.amazon.awscdk.services.secretsmanager.SecretTargetAttachmentProps =
    (new software.amazon.awscdk.services.secretsmanager.SecretTargetAttachmentProps.Builder)
      .secret(secret.orNull)
      .build()
}
