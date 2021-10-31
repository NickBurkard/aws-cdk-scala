package io.burkard.cdk.services.opensearchservice

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AdvancedSecurityOptions {

  def apply(
    masterUserArn: Option[String] = None,
    masterUserName: Option[String] = None,
    masterUserPassword: Option[software.amazon.awscdk.SecretValue] = None
  ): software.amazon.awscdk.services.opensearchservice.AdvancedSecurityOptions =
    (new software.amazon.awscdk.services.opensearchservice.AdvancedSecurityOptions.Builder)
      .masterUserArn(masterUserArn.orNull)
      .masterUserName(masterUserName.orNull)
      .masterUserPassword(masterUserPassword.orNull)
      .build()
}
