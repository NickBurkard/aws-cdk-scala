package io.burkard.cdk.services.cognito

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnUserPoolIdentityProvider {

  def apply(
    internalResourceId: String,
    providerDetails: Option[AnyRef] = None,
    attributeMapping: Option[AnyRef] = None,
    idpIdentifiers: Option[List[String]] = None,
    providerType: Option[String] = None,
    providerName: Option[String] = None,
    userPoolId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProvider =
    software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProvider.Builder
      .create(stackCtx, internalResourceId)
      .providerDetails(providerDetails.orNull)
      .attributeMapping(attributeMapping.orNull)
      .idpIdentifiers(idpIdentifiers.map(_.asJava).orNull)
      .providerType(providerType.orNull)
      .providerName(providerName.orNull)
      .userPoolId(userPoolId.orNull)
      .build()
}
