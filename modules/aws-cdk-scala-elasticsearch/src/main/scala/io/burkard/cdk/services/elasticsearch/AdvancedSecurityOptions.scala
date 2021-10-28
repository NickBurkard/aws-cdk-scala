package io.burkard.cdk.services.elasticsearch

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AdvancedSecurityOptions {

  def apply(
    masterUserArn: Option[String] = None,
    masterUserName: Option[String] = None,
    masterUserPassword: Option[software.amazon.awscdk.SecretValue] = None
  ): software.amazon.awscdk.services.elasticsearch.AdvancedSecurityOptions =
    (new software.amazon.awscdk.services.elasticsearch.AdvancedSecurityOptions.Builder)
      .masterUserArn(masterUserArn.orNull)
      .masterUserName(masterUserName.orNull)
      .masterUserPassword(masterUserPassword.orNull)
      .build()
}
