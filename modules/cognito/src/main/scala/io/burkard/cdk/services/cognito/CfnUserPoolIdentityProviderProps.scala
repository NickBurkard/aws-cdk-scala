package io.burkard.cdk.services.cognito

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserPoolIdentityProviderProps {

  def apply(
    providerDetails: Option[AnyRef] = None,
    attributeMapping: Option[AnyRef] = None,
    idpIdentifiers: Option[List[String]] = None,
    providerType: Option[String] = None,
    providerName: Option[String] = None,
    userPoolId: Option[String] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProviderProps =
    (new software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProviderProps.Builder)
      .providerDetails(providerDetails.orNull)
      .attributeMapping(attributeMapping.orNull)
      .idpIdentifiers(idpIdentifiers.map(_.asJava).orNull)
      .providerType(providerType.orNull)
      .providerName(providerName.orNull)
      .userPoolId(userPoolId.orNull)
      .build()
}
