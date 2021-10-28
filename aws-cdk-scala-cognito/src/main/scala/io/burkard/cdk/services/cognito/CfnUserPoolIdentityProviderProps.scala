package io.burkard.cdk.services.cognito

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
