package io.burkard.cdk.services.secretsmanager

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SecretAttributes {

  def apply(
    secretPartialArn: Option[String] = None,
    secretCompleteArn: Option[String] = None,
    encryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    secretArn: Option[String] = None
  ): software.amazon.awscdk.services.secretsmanager.SecretAttributes =
    (new software.amazon.awscdk.services.secretsmanager.SecretAttributes.Builder)
      .secretPartialArn(secretPartialArn.orNull)
      .secretCompleteArn(secretCompleteArn.orNull)
      .encryptionKey(encryptionKey.orNull)
      .secretArn(secretArn.orNull)
      .build()
}
