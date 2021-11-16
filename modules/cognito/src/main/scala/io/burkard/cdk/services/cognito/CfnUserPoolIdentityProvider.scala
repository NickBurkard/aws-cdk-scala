package io.burkard.cdk.services.cognito

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserPoolIdentityProvider {

  def apply(
    internalResourceId: String,
    providerType: String,
    providerName: String,
    userPoolId: String,
    providerDetails: Option[AnyRef] = None,
    attributeMapping: Option[AnyRef] = None,
    idpIdentifiers: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProvider =
    software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProvider.Builder
      .create(stackCtx, internalResourceId)
      .providerType(providerType)
      .providerName(providerName)
      .userPoolId(userPoolId)
      .providerDetails(providerDetails.orNull)
      .attributeMapping(attributeMapping.orNull)
      .idpIdentifiers(idpIdentifiers.map(_.asJava).orNull)
      .build()
}
