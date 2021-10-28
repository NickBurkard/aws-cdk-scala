package io.burkard.cdk.services.secretsmanager

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SecretRotationApplicationOptions {

  def apply(
    isMultiUser: Option[Boolean] = None
  ): software.amazon.awscdk.services.secretsmanager.SecretRotationApplicationOptions =
    (new software.amazon.awscdk.services.secretsmanager.SecretRotationApplicationOptions.Builder)
      .isMultiUser(isMultiUser.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
