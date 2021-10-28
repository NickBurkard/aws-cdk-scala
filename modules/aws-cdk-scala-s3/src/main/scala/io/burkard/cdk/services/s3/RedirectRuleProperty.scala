package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RedirectRuleProperty {

  def apply(
    httpRedirectCode: Option[String] = None,
    hostName: Option[String] = None,
    replaceKeyPrefixWith: Option[String] = None,
    replaceKeyWith: Option[String] = None,
    protocol: Option[String] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.RedirectRuleProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.RedirectRuleProperty.Builder)
      .httpRedirectCode(httpRedirectCode.orNull)
      .hostName(hostName.orNull)
      .replaceKeyPrefixWith(replaceKeyPrefixWith.orNull)
      .replaceKeyWith(replaceKeyWith.orNull)
      .protocol(protocol.orNull)
      .build()
}
