package io.burkard.cdk.services.secretsmanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SecretRotationApplication {

  def apply(
    applicationId: String,
    semanticVersion: String,
    isMultiUser: Boolean
  ): software.amazon.awscdk.services.secretsmanager.SecretRotationApplication =
    software.amazon.awscdk.services.secretsmanager.SecretRotationApplication.Builder
      .create(applicationId, semanticVersion)
      .isMultiUser(isMultiUser)
      .build()
}
