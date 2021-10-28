package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object JwtTokenTypeConfigurationProperty {

  def apply(
    groupAttributeField: Option[String] = None,
    url: Option[String] = None,
    keyLocation: Option[String] = None,
    claimRegex: Option[String] = None,
    issuer: Option[String] = None,
    userNameAttributeField: Option[String] = None,
    secretManagerArn: Option[String] = None
  ): software.amazon.awscdk.services.kendra.CfnIndex.JwtTokenTypeConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnIndex.JwtTokenTypeConfigurationProperty.Builder)
      .groupAttributeField(groupAttributeField.orNull)
      .url(url.orNull)
      .keyLocation(keyLocation.orNull)
      .claimRegex(claimRegex.orNull)
      .issuer(issuer.orNull)
      .userNameAttributeField(userNameAttributeField.orNull)
      .secretManagerArn(secretManagerArn.orNull)
      .build()
}
