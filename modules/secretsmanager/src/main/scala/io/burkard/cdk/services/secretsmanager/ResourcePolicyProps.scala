package io.burkard.cdk.services.secretsmanager

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ResourcePolicyProps {

  def apply(
    secret: Option[software.amazon.awscdk.services.secretsmanager.ISecret] = None
  ): software.amazon.awscdk.services.secretsmanager.ResourcePolicyProps =
    (new software.amazon.awscdk.services.secretsmanager.ResourcePolicyProps.Builder)
      .secret(secret.orNull)
      .build()
}
