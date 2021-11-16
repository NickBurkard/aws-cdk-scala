package io.burkard.cdk.services.cognito

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserPoolIdentityProviderProps {

  def apply(
    providerType: String,
    providerName: String,
    userPoolId: String,
    providerDetails: Option[AnyRef] = None,
    attributeMapping: Option[AnyRef] = None,
    idpIdentifiers: Option[List[String]] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProviderProps =
    (new software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProviderProps.Builder)
      .providerType(providerType)
      .providerName(providerName)
      .userPoolId(userPoolId)
      .providerDetails(providerDetails.orNull)
      .attributeMapping(attributeMapping.orNull)
      .idpIdentifiers(idpIdentifiers.map(_.asJava).orNull)
      .build()
}
